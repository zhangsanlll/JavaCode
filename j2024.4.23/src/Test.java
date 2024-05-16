import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-04-23
 * Time: 16:36
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4};
        selectSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static  void selectSort1(int[] arr){
        for(int i = 0 ;i < arr.length;i++){
            int j = i+1;
            int minIndex = i;
            for(;j < arr.length;j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
    public static void shell(int[] array,int gap){
        for(int i = gap; i < array.length;i++){
            int tmp = array[i];
            int j = i - gap;
            for(;j >= 0;j-=gap){
                if(array[j] > tmp){
                    array[j+gap] = array[i];
                }else{
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
}
