![20231214165104.png](attachments/JVM/20231214165104.png)
# JVM组成
![20231214165436.png](attachments/JVM/20231214165436.png)
- 类加载器：用于装载字节码文件（.class文件）
- 运行时数据区：用于分配存储空间
- 执行引擎：执行字节码文件或本地方法
- 垃圾回收器：用于对JVM中的垃圾内容进行回收
## 程序计数器
- 线程私有的，每个线程一份，内部保存的字节码的行号，用于记录正在执行的字节码指令的地址
  ![20231215063857.png](attachments/JVM/20231215063857.png)

## 堆
**线程共享的区域：主要用来保存对象实例、数组等，当堆中没有内存空间可分配给实例，也无法再扩展时，则抛出OutOfMemoryError异常**
- 存储对象和数组
  ![20231215064409.png](attachments/JVM/20231215064409.png)
## =========
![20231215064541.png](attachments/JVM/20231215064541.png)

## 虚拟机栈
![20231215064836.png](attachments/JVM/20231215064836.png)
![20231215064932.png](attachments/JVM/20231215064932.png)

![20231215065301.png](attachments/JVM/20231215065301.png)
![20231215065341.png](attachments/JVM/20231215065341.png)
## ======
![20231215065506.png](attachments/JVM/20231215065506.png)
![20231215065548.png](attachments/JVM/20231215065548.png)
## 方法区
![20231215065757.png](attachments/JVM/20231215065757.png)
## 常量池
![20231215070146.png](attachments/JVM/20231215070146.png)
![20231215070228.png](attachments/JVM/20231215070228.png)
## ===
![20231215070306.png](attachments/JVM/20231215070306.png)

## 直接内存
### BIO
![20231215070859.png](attachments/JVM/20231215070859.png)
### NIO
![20231215070933.png](attachments/JVM/20231215070933.png)
## ===
![20231215071019.png](attachments/JVM/20231215071019.png)
# 类加载器
![20231215071422.png](attachments/JVM/20231215071422.png)
### 双亲委派模型
![20231215071826.png](attachments/JVM/20231215071826.png)
![20231215071912.png](attachments/JVM/20231215071912.png)
## ===
![20231215071638.png](attachments/JVM/20231215071638.png)
![20231215072027.png](attachments/JVM/20231215072027.png)


## 类装载的过程
![20231215072147.png](attachments/JVM/20231215072147.png)
### 加载
![20231215072333.png](attachments/JVM/20231215072333.png)
### 验证
![20231215072429.png](attachments/JVM/20231215072429.png)
### 准备
![20231215072551.png](attachments/JVM/20231215072551.png)
### 解析
![20231215072626.png](attachments/JVM/20231215072626.png)
### 初始化
![20231215072717.png](attachments/JVM/20231215072717.png)
### 使用
![20231215072859.png](attachments/JVM/20231215072859.png)
### 卸载
**用户程序代码执行完毕以后，JVM就会销毁创建的CLASS对象**

### ====
![20231215073042.png](attachments/JVM/20231215073042.png)
# 垃圾回收

## 对象什么时候可以被垃圾器回收
![20231215073252.png](attachments/JVM/20231215073252.png)
## ====
![20231215073849.png](attachments/JVM/20231215073849.png)

## 定位垃圾的方法
### 引用计数法
![20231215073419.png](attachments/JVM/20231215073419.png)
![20231215073556.png](attachments/JVM/20231215073556.png)

### 可达性计数法
![20231215073642.png](attachments/JVM/20231215073642.png)

![20231215073819.png](attachments/JVM/20231215073819.png)

## JVM垃圾回收算法有哪些
### 标记清楚算法
![20231215074119.png](attachments/JVM/20231215074119.png)

### 标记整理算法（老年代）
![20231215074322.png](attachments/JVM/20231215074322.png)
### 复制算法（新生代）

![20231215074430.png](attachments/JVM/20231215074430.png)
## ======
![20231215074618.png](attachments/JVM/20231215074618.png)

## JVM中的分代回收
![20231215074756.png](attachments/JVM/20231215074756.png)
![20231215075043.png](attachments/JVM/20231215075043.png)
## MinorGC、MixedGC、FullGC区别

![20231215075234.png](attachments/JVM/20231215075234.png)
## =====
![20231215075517.png](attachments/JVM/20231215075517.png)

## JVM有哪些垃圾回收器
### 串行垃圾回收器
![20231215075835.png](attachments/JVM/20231215075835.png)
### 并行垃圾回收器
![20231215075910.png](attachments/JVM/20231215075910.png)
### CMS（并发）垃圾回收器
![20231215080205.png](attachments/JVM/20231215080205.png)
### G1垃圾回收器
**JDK9 以后默认**
**新生代回收、并发标记、混合收集**
![20231215080445.png](attachments/JVM/20231215080445.png)
#### 年轻代垃圾回收
![20231215080635.png](attachments/JVM/20231215080635.png)
![20231215080755.png](attachments/JVM/20231215080755.png)
![20231215080842.png](attachments/JVM/20231215080842.png)
![20231215080916.png](attachments/JVM/20231215080916.png)
#### 混合垃圾回收
![20231215081035.png](attachments/JVM/20231215081035.png)
![20231215081106.png](attachments/JVM/20231215081106.png)
#### ====
![20231215081342.png](attachments/JVM/20231215081342.png)
## ====
![20231215080306.png](attachments/JVM/20231215080306.png)

### 强引用、软引用、弱引用、虚引用区别
![20231215081611.png](attachments/JVM/20231215081611.png)
![20231215081658.png](attachments/JVM/20231215081658.png)
![20231215081807.png](attachments/JVM/20231215081807.png)
### ===
![20231215081825.png](attachments/JVM/20231215081825.png)

# JVM实践
## JVM 调优的参数在哪设置
- war包部署在tomcat中设置
  ![20231215082058.png](attachments/JVM/20231215082058.png)
- jar包部署在启动参数设置
  ![20231215082134.png](attachments/JVM/20231215082134.png)

## ===
![20231215082156.png](attachments/JVM/20231215082156.png)

## JVM调优参数
### 设置堆空间大小
![20231215082403.png](attachments/JVM/20231215082403.png)
### 虚拟机栈的位置
![20231215082445.png](attachments/JVM/20231215082445.png)
### 年轻代中Eden区和两个Survivor区的大小比例
![20231215082526.png](attachments/JVM/20231215082526.png)
### 年轻代晋升老年代阈值
![20231215082532.png](attachments/JVM/20231215082532.png)
### 设置垃圾回收收集器
![20231215082622.png](attachments/JVM/20231215082622.png)
## ===
![20231215082704.png](attachments/JVM/20231215082704.png)

## JVM调优工具
**命令工具**
### jps
**进程状态信息**
![20231215083049.png](attachments/JVM/20231215083049.png)
### jstack
**查看java进程内线程的堆栈信息**
![20231215083100.png](attachments/JVM/20231215083100.png)
### jmap
**查看堆转信息**
![20231215083430.png](attachments/JVM/20231215083430.png)
###  jhat
**堆转存储快照分析工具**
### jstat
**JVM统计监测工具**
**可视化工具**
![20231215083528.png](attachments/JVM/20231215083528.png)
### jconsole
**用于对jvm的内存、线程、类的监控**
![20231215083658.png](attachments/JVM/20231215083658.png)
### VisualVM
**能够监控线程、内存情况
![20231215083710.png](attachments/JVM/20231215083710.png)

## ===
![20231215083759.png](attachments/JVM/20231215083759.png)

## Java内存泄露的排查思路
![20231215083942.png](attachments/JVM/20231215083942.png)

![20231215084056.png](attachments/JVM/20231215084056.png)
![20231215084328.png](attachments/JVM/20231215084328.png)
![20231215084403.png](attachments/JVM/20231215084403.png)

![20231215084422.png](attachments/JVM/20231215084422.png)
## ====
![20231215084440.png](attachments/JVM/20231215084440.png)

## CPU飙高排查方案与思路
![20231215084525.png](attachments/JVM/20231215084525.png)
![20231215084917.png](attachments/JVM/20231215084917.png)
![20231215085000.png](attachments/JVM/20231215085000.png)

## ====
![20231215085012.png](attachments/JVM/20231215085012.png)

1.top
2.ps H -eo pid,tid,%cpu | grep 2266
3.jstack 2266
4.printf "%x\n" 2266
5.ls
6.cat Application.java