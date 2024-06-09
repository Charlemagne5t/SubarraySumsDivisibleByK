import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = {7,-5,5,-8,-6,6,-4,7,-8,-7};
        int k = 7;
        int expected = 11;
        int actual = new Solution().subarraysDivByK(nums, k);

        Assert.assertEquals(expected,actual);
    }
}
