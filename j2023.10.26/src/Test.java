import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-10-26
 * Time: 15:36
 */
public class Test {

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    //
    //如数组：[1,2,3,4,5,6]
    //
    //调整后可能是：[1, 5, 3, 4, 2, 6]
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 3, 4, 1, 6};
        reorder(array);
        System.out.println(Arrays.toString(array));

    }

    public static void reorder(int[] array) {
        int left = 0;
        int right = 1;
        while (left <= array.length - 1 && right <= array.length - 1) {
            if (array[left] % 2 == 1) {//奇数
                if (array[right] % 2 == 1) {
                    //前奇数后偶数
                    right ++;
                } else {//前奇数后奇数
                    left++;
                    right ++;
                }
            } else {//ou
                if (array[right] % 2 == 1) {
                    //ji前偶后奇
                    int tmp = array[left];
                    array[left] = array[right];
                    array[right] = tmp;
                    left++;
                    right ++;
                } else {//前偶数后偶数
                    right ++;
                }

            }
        }

    }

    //给定一个有序整型数组, 实现二分查找
}
