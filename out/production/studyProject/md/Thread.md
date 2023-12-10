# 多线程

## 进程与线程

- 进程：运行的程序和它所需要的资源(CPU、内存)
- 线程：线程是进程的一部分，粒度比进程小，一个进程可以拥有多个线程，至少包含一个线程，这个线程就是主线程

线程和进程的区别：

1.一个进程里面至少拥有一个线程
2.线程之间使用的资源是共享的
3.线程之间的通信比进程之间的通信开销小 
4.线程的创建相对于进程的创建容易
5.线程的创建比进程的创建小的多，使用比较多

**使用多线程的目的：最大效率的使用CPU资源，提高程序的运行效率**
 
## 创建多线程 
 
 **创建多线程有两种方法：**

继承Thread类，重写run方法

实现Runnable接口，重写run方法


**1.继承Thread类，重写run方法**

public class MyThread extends Thread{

    @Override
    public void run(){
        //test
    }
}

**2.实现Runnable接口，重写run方法**

public class MyRunnable implements Runnable{

    @Override
    public void run(){
    //test
    }
}


**3.带返回值的线程创建 Callable和FutureTask**
返回值获取方法FutureTask对象的get()方法


在多线程中，run()和start()方法的区别：
run()：仅仅是封装了被线程执行的代码，直接调用是普通方法
start()：首先启动线程，然后再由jvm去调用该线程的run()方法


一般都是使用实现Runnable接口，因为java只支持单继承、多实现
并发运行任务和运行机制解耦


## 线程的生命周期
- 创建： 实例化一个线程对象
- 就绪：start方法执行或者阻塞结束后
- 运行：获得CPU的时间片，执行run方法
- 阻塞：暂停(挂起)、IO、sleep、wait、join
- 结束：run方法结束或者异常

## 使用Sychronized关键字
-  修饰代码块  
   public synchronized void addCount(){}
-  修饰方法  
   public static synchronized void addCount(){}
   
   修饰代码块，synchronized使用的就是当前方法调用时所属的那个实例的【内置锁】
   
   修饰方法时，synchronized使用的就是当前方法所属的类对象的锁
   
## 怎么启动线程

thread.start(); 启动线程用start方法，启动后执行的是run方法.