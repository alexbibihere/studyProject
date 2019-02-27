多线程

创建多线程有两种方法：

继承Thread类，重写run方法

实现Runnable接口，重写run方法


1.继承Thread类，重写run方法

public class MyThread extends Thread{

    @Override
    public void run(){
        //test
    }
}

2.实现Runnable接口，重写run方法

public class MyRunnable implements Runnable{

    @Override
    public void run(){
    //test
    }
}


在多线程中，run()和start()方法的区别：
run()：仅仅是封装了被线程执行的代码，直接调用是普通方法
start()：首先启动线程，然后再由jvm去调用该线程的run()方法


一般都是使用实现Runnable接口，因为java只支持单继承、多实现
并发运行任务和运行机制解耦
