/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-03-08
 * Time: 11:30
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int length  = nums.length;
        int left = 0;
        int right = 1;
        while(left < length && right <length ){
            if(nums[left] == nums[right]){
                left++;
                right++;

            }else{
                nums[index] = nums[left];
                left++;
                right++;
                index++;
            }

        }
        if(nums[right] == nums[length-1]){
            nums[index] = nums[left];
            index++;
        }
        return index;
    }

}

public class Test {
    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,2,2,2,3,3,4,4};
        Solution test = new Solution();
        int ret = test.removeDuplicates(nums);
        System.out.println(ret);
    }

}


