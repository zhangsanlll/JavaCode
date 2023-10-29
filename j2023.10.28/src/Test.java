import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-10-28
 * Time: 9:53
 */

public class Test {

    static boolean Paddy;
    public static void main(String args[]){
        System.out.println(Paddy);
    }

    //给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：
    // 如果存在，请返回 true ；否则，返回 false 。
    public static void main6(String[] args) {
        int[] arr = new int[]{1,23,4,5,6,13,15,5};
        Boolean bool = judgeOdd(arr);
        System.out.println(bool);

    }

    public static boolean judgeOdd(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length-2; i++) {
            if(arr[i]%2 == 1 && arr[i+1]%2 == 1 && arr[i+2]%2 == 1){
                return true;
            }

        }
        return false;

    }


    //给定一个大小为 n 的数组，找到其中的多数元素。
    // 多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。

    public static void main7(String[] args) {
        //直接排序，中位数就是众数（前提是有很多数字相同的数）
        int[] nums = new int[]{3, 1, 1, 1, 1,1, 4, 5, 5};
        /*for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[j] == nums[j+1]) {
                    count++;
                }
            }
            if(count>= (nums.length/2)){
                System.out.print(nums[j]);
                break;
            }
        }*/
        Arrays.sort(nums);
        System.out.println(nums[nums.length/2]);
    }

    //给定一个非空整数数组，除了某个元素只出现一次以外，
    // 其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static void main4(String[] args) {
        //n^n = 0;0^n = n;
        int ret = 0;
        //String r = "[";
        int[] nums = new int[]{1,1,2,2,3,3,4,5,5};
        for (int i = 0; i < nums.length; i++) {
            //r+=nums[i]+" ";

            ret  =ret ^ nums[i];
        }
        //System.out.print(r);
        System.out.println(ret);
    }

    //给定一个整数数组 nums 和一个整数目标值 target，
    // 请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
    public static void main3(String[] args) {
        int[] nums = new int[]{1,4,6,8};
        int[] arrays = sum(nums,14);
        System.out.println(Arrays.toString(arrays));
    }

    public static int[] sum(int[] array,int target){
        int[] num = new int[2];
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j] == target){
                    num[0] = i;
                    num[1] = j;

                }
            }
        }
        return num;
    }


    //给定一个有序整型数组, 实现二分查找
    public static void main1(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        int key = binarySearch(array,5);
        System.out.println(key);


    }

    public static int binarySearch(int[] array, int key){
        int left = 0;
        int right = array.length-1;
        while(left<=right){
            int mid  = (left + right)/2;

            if(key < array[mid]){
                right = mid -1;

            }else if (key > array[mid]){
                left = mid + 1;

            }else {
                return mid;
            }
        }
        return -1;
    }


    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void main2(String[] args) {
        int[] array = new int[]{8,7,6,5,4,3,2,1,0};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];;
                    array[j] =array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }


    }

