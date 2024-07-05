package nowcoder.MultipleThread;

/**
 * @author: yandg
 * @Date: 2023/12/13/0013 9:00
 * @Description: 调用join方法保证线程顺序执行
 */
public class JoinThread {

    public static void main(String[] args) {
        // 保证t1、t2、t3 三个线程顺序执行

        Thread t1 = new Thread(()->{
            System.out.println("t1");
        });
        Thread t2 = new Thread(()->{
            try {
                t1.join();                          // 加入线程t1，只有t1线程执行完毕以后，再次执行该线程
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t2");
        });
        Thread t3 = new Thread(() -> {
            try {
                t2.join();                          // 加入线程t2，只有t2线程执行完毕以后，再次执行该线程
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t3");
        });
        // 启动线程
        t1.start();
        t2.start();
        t3.start();

        new Thread(()->{
            System.out.println("创建线程");
        }).start();
    }
}
