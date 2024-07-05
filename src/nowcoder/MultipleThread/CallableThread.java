package nowcoder.MultipleThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: yandg
 * @Date: 2023/12/13/0013 8:27
 * @Description: 实现Callalbe接口
 */
public class CallableThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return "ok";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 创建Callable对象
        CallableThread thread3 = new CallableThread();
        // 创建FutureTask
        FutureTask<String> futureTask = new FutureTask<>(thread3);
        // 创建Thread对象
        Thread t3 = new Thread(futureTask);
        // 调用start方法启动线程
        t3.start();
        // 调用 FutureTask的get方法获取执行结果
        String result = futureTask.get();
        System.out.println(result);
    }
}
