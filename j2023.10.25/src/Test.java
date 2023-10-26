import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-10-25
 * Time: 9:33
 */
public class Test {

    public static void main(String[] args) {
        //数组转字符串
        int[] array = new int[]{1,2,3,4,5,6};
       // System.out.println(Arrays.toString(array));
       String ret = mytoString(array);
       System.out.println(ret);
    }

    public static String mytoString(int[] array){
        /*if(array.length==0){
            return null;
        }
        System.out.println("[");
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]+",");
            if(i ==array.length-1){
                System.out.println(array[i]+"]");
            }
        }
        return array;*/
        if(array == null){
            return "null";
        String ret = "[";
        for (int i = 0; i < array.length ; i++) {
            ret += array[i];
            if(i !=array.length-1){
                ret+=",";
            }
        }
        ret+="]";
        return ret;
    }
    public static void main9(String[] args) {
        //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
        int[] array = new int[]{1,2,3,4,5};
        double ret = avg(array);
        System.out.println(ret);
    }

    public static double  avg (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum / array.length;
    }


    public static void main8(String[] args) {

        //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
        int[] array = new int[]{1,2,3,4,5};
        int ret = sum(array);
        System.out.println(ret);
    }

    public static int  sum (int[] array){
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
           sum1+=array[i];
        }
        return sum1;
    }

    public static void main7(String[] args) {
        //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
        // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
        int[] array = new int[]{1,2,3,4,5};
        transform(array);

    }
    public static void transform (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]*2+" ");
        }
    }
    public static void main6(String[] args) {
        //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
        int[] array = new int [100];
        for (int i = 0; i < array.length ; i++) {
            array[i] = i+1;
        }
        printArray(array);

    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
            if(array[i]%10==0){
                System.out.println();
            }
        }
    }

    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main5(String[] args) {
        int[] array = new int [100];
        for (int i = 0; i < array.length ; i++) {
            array[i] = i+1;

        }
    }
    //在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？
    public static void main4(String[] args) {
        int x = 10;
        int y = 20;
        double a = 1.5;
        double b = 2.4;
        double c = 3.6;
        int max1 = max(x,y);
        double max2 = max(a,b,c);
        System.out.println(max1);
        System.out.println(max2);

    }

    public static int max(int x,int y){
        return x > y ? x : y;

    }

    public static double max(double a,double b,double c){
        double max1 = a > b ? a : b;
        return max1 > c ? max1 : c;

    }

    public static void main3(String[] args) {
        // 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
        int x = 10;
        int y = 20;
        double a = 1.5;
        double b = 2.4;
        double c = 3.6;
        int ret1 = add(x,y);
        double ret2 = add(a,b,c);
        System.out.println(ret1);
        System.out.println(ret2);
    }

    public static int add(int x,int y){
        return x + y;
    }
    public  static double add(double a, double b,double c){
        return a+b+c;
    }


    public static void main2(String[] args) {
        //求斐波那契数列的第n项。(迭代实现)
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a= 1;
        int b= 1;
        int c=-1;
        if (n == 1||n == 2) {
            c = 1;
        }
        for (int i = 3; i <= n ; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);

    }
    //求1！+2！+3！+4！+.......
    // .+n!的和
    public static void main1(String[] args) {
        //求1！+2！+3！+4！+........+n!的和
        int ret = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <=n ; i++) {     //1-n
            for (int j = 1; j <= i; j++) {   //1-n
                ret *= j;
            }
            sum+=ret;
            ret = 1;

        }
        System.out.println(sum);

    }
}
