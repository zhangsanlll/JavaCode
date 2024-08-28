package JavaeeDemo;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-05-22
 * Time: 11:12
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t= new Thread();
        Random random = new Random();
        int[] arr = new int[1000_0000];
        for(int i = 0; i < arr.length;i++){
            arr[i] = random.nextInt(100)+1;
        }
        t.start();
        Thread t1 = new
    }




}
