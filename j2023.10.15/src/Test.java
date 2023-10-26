import java.util.Scanner;

public class Test {
    //class 4
    public static void main3(String[] args) {
        //既能被5整除，也能被6整除
        int i=5;
        while(i<=100){
            if(i%30==0){
                System.out.println(i);
                i++;
            }else{
                i++;
            }
        }

    }



    //输出 1000 - 2000 之间所有的闰年
    public static void main2(String[] args) {
        int i=1000;
        int count=0;
        while(i<=2000){
            if(i%400==0||(i%100!=0&&i%4==0)){
                System.out.print(i+" ");
                count++;
                i++;
                if(count%30==0){
                    System.out.println();
                }
            }else{
                i++;
            }
        }
        System.out.println("共有"+count+"个闰年");

    }

    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    //一位数：1-9：n/9==0 --->一个
    //两位数：10-100：19、29、39、49、59...89--->n%10=9
    //90,91,92...99--->n/10=9
    //if(n/10==9&&n%10==9)count+2
    public static void main4(String[] args) {
        int count=0;
        for (int i = 1; i <=100 ; i++) {
            if(i==9){
                count++;
            }else if((i/10==9||i%10==9)&&i!=99){
                count++;
            }if (i/10==9&&i%10==9){
                count+=2;
            }
        }
        System.out.println("1到100中一共有"+count+"个数字9");
    }

    //输出n*n的乘法口诀表，n由用户输入。
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
       // while(scan.hasNextInt())
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
    //class 3
    public static void main1(String[] args) {
        System.out.println(10/3);
        System.out.println(10/-3);
        System.out.println(-10/3);
        System.out.println(-10/-3);

        System.out.println(10%3);
        System.out.println(10%-3);
        System.out.println(-10%3);
        System.out.println(-10%-3);

        System.out.println("=========");
        System.out.println(11.5/2);
        System.out.println(11.5%2);


    }
}
