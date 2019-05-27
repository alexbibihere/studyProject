## 1.String s = new String("xyz"); 创建了几个String Object?

两个。第一个对象是字符串常量"xyz" 第二个对象是new String()的时候产生的，
在堆中分配内存给这个对象，只不过这个对象的内容是指向字符串常量"xyz" 
另外还有一个引用s，指向第二个对象。这是一个变量，在栈中分配内存。

## 2.数组有没有length()方法？string没有lenght()方法？

java中数组是没有length()方法的，只有length属性，数组array.length返回的是该数组的长度。

字符串String是有length()方法的，str.length()返回的是该字符串的长度。

## 3.wait(1000)与sleep(1000)的区别?

1、sleep是Thread的静态方法，wait是Object的方法，任何对象实例都能调用。

2、sleep不会释放锁，它也不需要占用锁。wait会释放锁，但调用它的前提是当前线程占有锁(即代码要在synchronized中)。

3、它们都可以被interrupted方法中断。

## 什么是Singleton模式，有什么作用。编程实现一个单例类.

1.Singleton是一种创建型模式，指某个类采用Singleton模式，
则在这个类被创建后，只可能产生一个实例供外部访问，并且提供一个全局的访问点


 ` public class Singleton {
             
              private Singleton(){};
              private static Singleton singleton; 
          
           //make sure you use a static method
           public static synchronized Singleton getInstance() {
             if (singleton == null)
                singleton = new Singleton();
             return singleton;
           }`
           
           
           
           
##  new ThreadPoolExecutor 对象各参数的含义
corePoolSize： 线程池维护线程的最少数量

maximumPoolSize：线程池维护线程的最大数量

keepAliveTime： 线程池维护线程所允许的空闲时间

unit： 线程池维护线程所允许的空闲时间的单位

workQueue： 线程池所使用的缓冲队列

handler： 线程池对拒绝任务的处理策略