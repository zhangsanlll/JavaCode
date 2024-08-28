import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入单精度浮点数和加急字符b;
        float a= in.nextFloat();
        char b = in.next().charAt(0);
        int ret = yunfei(a,b);
        System.out.println(ret);

    }

    private static int yunfei(float a, char b) {
        //先判断是否加急
        //是加急，加5元
       // float t = 0;
        if( b == 'y'){
            if(a <= 1){
                return 25;
            }else{
                //重量大于1kg
                return Math.round(25+(a-1) * 1);
            }
        }else{
            //不是加急
            if(a <= 1){
                return 20;
            }else{
                //重量大于1kg
                return Math.round(20+(a-1) * 1);
            }
        }
    }
}
