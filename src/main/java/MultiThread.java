import java.util.HashMap;
import java.util.Map;
class ThreadTest extends Thread{
    public int para1;
    public int para2;
    @Override
    public void run()
    {
        System.out.println("ThreadTest" + Thread.activeCount());
        System.out.print(para1 + " "+ para2 );
    }
}
class MyThread implements Runnable{
    // how to transfer parameters to a thread
    public int para1;
    public int para2;
    public void run()
    {
        System.out.println("Main" + Thread.activeCount());
        System.out.println(Thread.currentThread());
        System.out.print(para1 + " "+ para2 );
    }
}
public class MultiThread {
    public static void main(String[] args) {


        //Some method of Thread
        System.out.println("Main" + Thread.activeCount());
        Thread.currentThread().getThreadGroup().list();


        // create a thread using a subclass of Thread
        ThreadTest t = new ThreadTest();
        t.setName("test");
        t.setPriority(10);
        t.start();
//        t.suspend();
//        t.sleep(1000);
//        t.stop();

        // create a thread using runnable
        // MyThread tmp = new MyThread();
//         tmp.para2 = 12;
//         tmp.para1 = 13;
//         Thread thread = new Thread(tmp);
//         thread.start();


        // 使用匿名内部类 创建线程
        new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("aaaaaaaaa");
                }
            }
        }.start();//开启线程

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("bbbbbbbbb");
                }
            }
        }).start();//开启线程





    }
}
