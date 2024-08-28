
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-05-21
 * Time: 11:21
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            System.out.println("lambda表达式");
        });
        t.start();
    }
    public static void main4(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类创建Runnable子类对象");
            }
        });
        t.start();
    }
    public static void main3(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("使用匿名内部类创建Thread子类对象");
            }
        };
        t.start();
    }
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            while(true){
                System.out.println("This is a Thread1 function! ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main2(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyRunnable() );
        t.start();
        while(true){
            System.out.println("This is a main1 function");
            Thread.sleep(1000);
        }
    }

    private static class MyThread1  extends  Thread{
        @Override
        //线程的入口方法，重写run方法
        public void run() {

            while(true){
                System.out.println("This is a Thread function! ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main1(String[] args) throws InterruptedException {
        Thread t = new MyThread1();
        t.start();
        while(true){
            System.out.println("This is a main function");
            Thread.sleep(1000);
        }
    }
}
