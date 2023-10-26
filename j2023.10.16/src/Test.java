import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-10-16
 * Time: 14:17
 */
public class Test {

    //输出一个整数的每一位，如：123的每一位是3，2，1
    //n=123;

    /*
     123/10=12...3
    12/10=1...2
    1/10=0...1
     */
    public static void main1(String[] args) {
        //递归

        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        fun(n);

    }
    public static void fun(int n){
        if(n>0){
            System.out.print(n%10+" ");
            fun(n/10);
        }
    }


    //编写代码模拟三次密码输入的场景。
    // 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
    // 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    public static void main2(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            String password= scan.nextLine();//输入密码
            if(password.equals("123456")){
                System.out.println("密码正确，登录成功！");
            }else{
                if(3==i) {
                    System.out.println("三次机会已使用完毕，退出程序！");
                    continue;
                }
                System.out.println("输入错误，你还有"+(3-i)+"次机会");
            }



        }

    }


    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main(String[] args) {
        /*
        *        1 0 1 0 1 1 1 1
        * 偶数位： 0 0 0 0 0 0 0 0 <<1
        * */
        Scanner scan=new Scanner(System.in);
        int sc= scan.nextInt();
        /*int tmp=sc;
        for (int i = 32; i >=1; i--) {
            System.out.print((tmp & 1)+" ");//奇数序列
            tmp = tmp>>2;
        }

        System.out.println(" ");
        tmp=sc>>1;
        for (int i= 32; i >=1; i--) {
            System.out.print((tmp & 1)+" ");//偶数序列
            tmp = tmp>>2;
        }
       */

        //从高地址位向低地址位遍历
        for (int i = 30; i >= 0 ; i-=2) {
            System.out.print(((sc>>i) & 1) +" ");//奇数
        }
        System.out.println();
        for (int i = 31; i >= 1 ; i-=2) {
            System.out.print(((sc>>i) & 1) +" ");//偶数
        }
    }



    //class 4
    //获得一个数二进制1的个数
    public static void main3(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sc= scan.nextInt();

        int count=0;
        //1.
       /* for (int i = 0; i < 32; i++) {
            if((sc&1)==1) {
                count++;
            }
            sc=sc>>1;
        }
        System.out.println(count);*/
        //2.效率更高，但为负数时死机
       /* while(sc!=0){
            if((sc & 1)==1) {
                count++;
            }
            sc=sc>>>1;
        }
        System.out.println(count);*/

        //3.当n和n-1相与时，相与的次数就是n的二进制有1的个数,最好
        while(sc!=0){
            sc=sc & (sc-1);
            count ++;
        }
        System.out.println(count);
    }
}

