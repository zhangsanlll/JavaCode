import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-10-23
 * Time: 20:39
 */
public class Test {

    public static void main5(String[] args) {
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
        }
        System.out.println(sum);

    }

    //求 N 的阶乘
    public static void main7(String[] args) {
        int ret = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            ret *= i;

        }
        System.out.println(ret);
    }
    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static void main4(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int ret2 = max2(a,b);
        int ret3 = max3(a,b,c);
        System.out.println(ret2);
        System.out.println(ret3);

    }

    public static int max2(int x,int y){
        return (x>y) ? x : y;
    }
    public static int max3(int x,int y,int z){

        return (max2(x,y)>z) ? max2(x,y) : z;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       // int num= scan.nextInt();
        while(scan.hasNext()){
            int num= scan.nextInt();
            for (int i = 0; i <num ; i++) {//i为col
                for (int j=0;j<num;j++){//j为row
                    if(i==j||(i+j==num-1)){
                        System.out.print("*");
                    }else {
                            System.out.print(" ");
                         }
                }
                    System.out.println();
            }

        }

    }
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值    。
    public static void main2(String[] args) {
        double sum = 0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0){
                //奇数
                sum+=1.0/i;
            }else{
                sum-=1.0/i;
            }
        }
        System.out.println(sum);

    }
    public static void main1(String[] args) {
       /* int x=10;
        double y =20;
        int ret =add(x,y);
        System.out.println(ret);*/
        //System.out.println(sum(123));
        int[] array=new int[]{1,2,3,4,5};
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int y:array) {
            System.out.print(y+" ");
        }
        System.out.println("=======");
        System.out.println(Arrays.toString(array));
    }

    public static int add (int a,double b){
        return (int)(a+b);
    }

    public static int add (double b,int a){
        return (int)(a+b);
    }

    public static int sum(int n){
        if(n<10){
            return n;
        }else {
            /*int ret = sum(n / 10);
             ret += (n%10);
            return ret;*/
            return sum(n/10)+(n%10);
        }
    }
}
