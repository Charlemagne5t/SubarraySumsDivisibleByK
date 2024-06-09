import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int subarraysDivByK(int[] nums, int k) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            List<Integer> list = new ArrayList<>();
//            for (int j = i; j < nums.length; j++) {
//                list.add(nums[j]);
//                sum += nums[j];
//                if(sum % k == 0) {
//                    System.out.println(++count);
//                    System.out.println(list);
//                }
//            }
//        }

        int n = nums.length;
        int res = 0;

        Map<Integer, Integer> map = new HashMap<>();
        int prev = 0;
        map.put(0 , 1);
        for(int i = 0; i < n; i++) {
            int prefixSum = prev + nums[i];
            prev = prefixSum;
            int cur = prefixSum % k;
            if(map.containsKey(cur) ) {
                res += map.get(cur);
            }
            if(map.containsKey(cur - k)) {
                res += map.get(cur - k);
            }
            if(map.containsKey(cur + k)) {
                res += map.get(cur + k);
            }
            map.put(cur, map.getOrDefault(cur, 0) + 1);


        }

        return res;
    }
}