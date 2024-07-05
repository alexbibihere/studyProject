package nowcoder.MultipleThread;

/**
 * @author: yandg
 * @Date: 2023/12/13/0013 8:19
 * @Description: 继承Thread类
 */
public class thread extends Thread{

    @Override
    public void run() {
        System.out.println("thread1...running");
    }

    public static void main(String[] args) {
        // 创建Thread对象
        Thread thread = new Thread();
        // 调用start方法启动线程
        thread.start();
    }
}
