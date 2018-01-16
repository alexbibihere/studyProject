/**
 * @author: yan
 * @Date: 2018/1/16/0016 20:31
 * @Description: 多线程卖票
 */
public class SellTicket implements Runnable{

    private static int ticketCount =100;

    private Object object = new Object();


    @Override
    public void run() {
        try {
            while(ticketCount>0){
                sellTicket();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private synchronized static  void sellTicket() {
        if (ticketCount>0){
            ticketCount--;
            System.out.println(Thread.currentThread().getName()+"余票还剩"+ticketCount+"张");
        }else{
            System.out.println("票卖完了");
        }
    }
}
