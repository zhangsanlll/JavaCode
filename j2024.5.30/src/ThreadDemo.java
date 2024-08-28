/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2024-05-30
 * Time: 10:44
 */
public class ThreadDemo {
    public static  class MyRunnable implements Runnable{
        public volatile boolean isQuit = false;

        @Override
        public void run() {
                while(!isQuit){
                    System.out.println(Thread.currentThread().getName()+":别管我，我忙着转账呢！");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            System.out.println(Thread.currentThread().getName()+":哎呀，差点误了大事！");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable target = new MyRunnable();
        //创建一个线程类
        Thread thread = new Thread(target,"李四");
        System.out.println(Thread.currentThread().getName()+":让李四开始转账");
        //调用线程
        thread.start();
        //休眠1s
        Thread.sleep(10000);
        System.out.println(Thread.currentThread().getName()+":老板来电话了，的赶紧通知李四对方是个骗子！");
        target.isQuit = true;
    }
    public static void main1(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        });
        t.start();
        System.out.println("2");
    }
}
