/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-05-21
 * Time: 10:24
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        int[] nums = {2,3,1,2,4,3};
       int ret =  test.minSubArrayLen(7,nums);
        System.out.println(ret);
    }
    public  static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = 100000;
        while(right < nums.length && left < nums.length){
            sum += nums[right];
            while(sum >= target){
                //满足结果，更新最小值
                int len = right -left+1;
                min = Math.min(len,min);
                sum =sum- nums[left];
                left++;
            }
            right++;
        }
        return min == 100000?0:min;
    }
}
