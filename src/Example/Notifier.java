package Example;

/**
 * @author: yan
 * @Date: 2018/1/16/0016 21:24
 * @Description:
 */
public class Notifier implements Runnable{

    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg){
            msg.setMsg("唤醒线程工作");
            msg.notifyAll();
        }
    }
}
