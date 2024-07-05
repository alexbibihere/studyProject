package nowcoder.MultipleThread;

/**
 * @author: yandg
 * @Date: 2023/12/13/0013 8:23
 * @Description:实现Runnable接口
 */
public class RunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("thread2...running");
    }

    public static void main(String[] args) {
        // 创建 Runnable对象
        RunnableThread thread2 = new RunnableThread();

        // 创建 Thread对象
        Thread t1 = new Thread(thread2);

        // 调用start方法启动线程
        t1.start();
    }
}
