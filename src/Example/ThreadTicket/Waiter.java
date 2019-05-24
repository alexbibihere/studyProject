package Example.ThreadTicket;

import Example.ThreadTicket.Message;

/**
 * @author: yan
 * @Date: 2018/1/16/0016 21:16
 * @Description:
 */
public class Waiter implements Runnable{

    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg){
            try {
                System.out.println(name+"等待时间"+System.currentTimeMillis());
                //持有该线程的会等待
                msg.wait();
                System.out.println(name +"--"+msg.getMsg()+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
