package nowcoder.MultipleThread;

import java.util.concurrent.ExecutorService;

/**
 * @author: yandg
 * @Date: 2023/12/13/0013 8:32
 * @Description:线程池创建线程
 */
public class Executors implements  Runnable{

    @Override
    public void run() {
        System.out.println("Executor..running");
    }

    public static void main(String[] args) {

        // 创建线程池对象
        ExecutorService threadPool = java.util.concurrent.Executors.newFixedThreadPool(3);
        threadPool.submit(new Executors());

        // 关闭线程池
        threadPool.shutdown();

    }
}
