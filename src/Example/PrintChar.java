package Example;

/**
 * @author: yan
 * @Date: 2018/1/16/0016 18:55
 * @Description: 实现Runnable接口  和 继承 Thread类
 */
public class PrintChar extends Thread{
    //常用的继承Thread   因为java单继承多实现
    private char c;
    private int times;

    public PrintChar() {
    }

    public PrintChar(char c, int times) {
        this.c = c;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i=0;i<times;i++){
            System.out.println(c);
        }
    }
}
