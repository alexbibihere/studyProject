   




一、Java 基础
1.JDK 和 JRE 有什么区别？
Jdk是java开发工具包
Jre是java运行环境
2.== 和 equals 的区别是什么？
equals是比较两个对象的值是否相等
== 是比较两个对象在内存中的引用是否相等，也就是比较两个对象是否为同一个对象
3.两个对象的 hashCode()相同，则 equals()也一定为 true，对吗？
不一定
4.final 在 java 中有什么作用？
final修饰的类叫最后类，不能被继承
final修饰的方法不能被重写，
final修饰的变量叫常量，常量必须初始化，初始化之后无法修改
5.java 中的 Math.round(-1.5) 等于多少？
-1
6.String 属于基础的数据类型吗？
不属于八大数据类型，byte、boolean、char、short、int、float、long、double
7.java 中操作字符串都有哪些类？它们之间有什么区别？
String、StringBuffer、StringBuilder
8.String str="i"与 String str=new String("i")一样吗？
不一样， 第一个存在常量池中、第二个存在堆内存中
9.如何将字符串反转？
调用StringBuffer的reverse()方法
10.String 类的常用方法都有那些？
11.抽象类必须要有抽象方法吗？
不需要
12.普通类和抽象类有哪些区别？
普通了不能包含抽象方法，抽象类可以包含抽象方法
抽象类不能直接实例化，普通类可以直接实例化
13.抽象类能使用 final 修饰吗？
不能 抽象类是让其他类继承的  final不能继承
14.接口和抽象类有什么区别？

15.java 中 IO 流分为几种？
输入流、输出流、字节流、字符流
16.BIO、NIO、AIO 有什么区别？
Bio：block IO 同步阻塞式io，传统io，特点是模式简单使用方便，并发处理能力低
NIO：New IO 同步非阻塞IO，传统io的升级，客户端和服务端通过channel(管道)通讯，实现了多路复用
AIO：Asynchronous IO 是Nio的升级，实现了异步非堵塞IO，异步IO的操作基于事件和回调机制。
17.Files的常用方法都有哪些？
二、容器
18.java 容器都有哪些？
Tomcat weblogic
19.Collection 和 Collections 有什么区别？
Collection是java集合
20.List、Set、Map 之间的区别是什么？
List底层是数组  无序的
Set 底层是链表  有序的
Map 底层是红黑树  key-value
21.HashMap 和 Hashtable 有什么区别？
Hashmap 是线程不安全的 
HashTable是线程安全的   
22.如何决定使用 HashMap 还是 TreeMap？
23.说一下 HashMap 的实现原理？
HashMap底层是红黑树
24.说一下 HashSet 的实现原理？
25.ArrayList 和 LinkedList 的区别是什么？
ArrayList底层是数组的 查询快，根据下标查找 ，增删慢 ，数据要移动消耗资源
LinkedList 底层是双向链表，查询慢  增删快
26.如何实现数组和 List 之间的转换？

27.ArrayList 和 Vector 的区别是什么？
ArrayList是线程不安全的， 
Vector是线程安全的
28.Array 和 ArrayList 有何区别？
29.在 Queue 中 poll()和 remove()有什么区别？
30.哪些集合类是线程安全的？
LinkedList
31.迭代器 Iterator 是什么？
32.Iterator 怎么使用？有什么特点？
33.Iterator 和 ListIterator 有什么区别？
34.怎么确保一个集合不能被修改？
三、多线程
35.并行和并发有什么区别？
并行是多个程序在一段时间区间内发生，并发是多个程序在一段时间内共同运行
36.线程和进程的区别？
线程是最小的运行单元，进程由多个线程组成
37.守护线程是什么？
守护线程是jvm
38.创建线程有哪几种方式？
继承Thread类、实现Runnable接口
39.说一下 runnable 和 callable 有什么区别？
40.线程有哪些状态？
运行、就绪、堵塞、挂起、死亡
41.sleep() 和 wait() 有什么区别？

42.notify()和 notifyAll()有什么区别？
43.线程的 run()和 start()有什么区别？
44.创建线程池有哪几种方式？
45.线程池都有哪些状态？
46.线程池中 submit()和 execute()方法有什么区别？
47.在 java 程序中怎么保证多线程的运行安全？
加锁
48.多线程锁的升级原理是什么？
49.什么是死锁？
多个线程同时抢占一个锁
50.怎么防止死锁？
线程等待
51.ThreadLocal 是什么？有哪些使用场景？
线程池
52.说一下 synchronized 底层实现原理？
53.synchronized 和 volatile 的区别是什么？
54.synchronized 和 Lock 有什么区别？
55.synchronized 和 ReentrantLock 区别是什么？
56.说一下 atomic 的原理？
四、反射
57.什么是反射？
58.什么是 java 序列化？什么情况下需要序列化？
59.动态代理是什么？有哪些应用？
60.怎么实现动态代理？
五、对象拷贝
61.为什么要使用克隆？
62.如何实现对象克隆？
63.深拷贝和浅拷贝区别是什么？
六、Java Web
64.jsp 和 servlet 有什么区别？
65.jsp 有哪些内置对象？作用分别是什么？
request
response
out
config
session
page
pageContext
exception
application
66.说一下 jsp 的 4 种作用域？
page
request
session
application
67.session 和 cookie 有什么区别？
68.说一下 session 的工作原理？
69.如果客户端禁止 cookie 能实现 session 还能用吗？
70.spring mvc 和 struts 的区别是什么？
71.如何避免 sql 注入？
72.什么是 XSS 攻击，如何避免？
73.什么是 CSRF 攻击，如何避免？
七、异常
74.throw 和 throws 的区别？
75.final、finally、finalize 有什么区别？
76.try-catch-finally 中哪个部分可以省略？
77.try-catch-finally 中，如果 catch 中 return 了，finally 还会执行吗？
78.常见的异常类有哪些？
八、网络
79.http 响应码 301 和 302 代表的是什么？有什么区别？
80.forward 和 redirect 的区别？
81.简述 tcp 和 udp的区别？
82.tcp 为什么要三次握手，两次不行吗？为什么？
83.说一下 tcp 粘包是怎么产生的？
84.OSI 的七层模型都有哪些？
85.get 和 post 请求有哪些区别？
86.如何实现跨域？
87.说一下 JSONP 实现原理？
九、设计模式
88.说一下你熟悉的设计模式？
89.简单工厂和抽象工厂有什么区别？
十、Spring/Spring MVC
90.为什么要使用 spring？
91.解释一下什么是 aop？
92.解释一下什么是 ioc？
93.spring 有哪些主要模块？
94.spring 常用的注入方式有哪些？
95.spring 中的 bean 是线程安全的吗？
96.spring 支持几种 bean 的作用域？
97.spring 自动装配 bean 有哪些方式？
98.spring 事务实现方式有哪些？
99.说一下 spring 的事务隔离？
100.说一下 spring mvc 运行流程？
101.spring mvc 有哪些组件？
102.@RequestMapping 的作用是什么？
103.@Autowired 的作用是什么？
十一、Spring Boot/Spring Cloud
104.什么是 spring boot？
105.为什么要用 spring boot？
106.spring boot 核心配置文件是什么？
107.spring boot 配置文件有哪几种类型？它们有什么区别？
108.spring boot 有哪些方式可以实现热部署？
109.jpa 和 hibernate 有什么区别？
110.什么是 spring cloud？
111.spring cloud 断路器的作用是什么？
112.spring cloud 的核心组件有哪些？
十二、Hibernate
113.为什么要使用 hibernate？
114.什么是 ORM 框架？
115.hibernate 中如何在控制台查看打印的 sql 语句？
116.hibernate 有几种查询方式？
117.hibernate 实体类可以被定义为 final 吗？
118.在 hibernate 中使用 Integer 和 int 做映射有什么区别？
119.hibernate 是如何工作的？
120.get()和 load()的区别？
121.说一下 hibernate 的缓存机制？
122.hibernate 对象有哪些状态？
123.在 hibernate 中 getCurrentSession 和 openSession 的区别是什么？
124.hibernate 实体类必须要有无参构造函数吗？为什么？
十三、Mybatis
125.mybatis 中 #{}和 ${}的区别是什么？
126.mybatis 有几种分页方式？
127.RowBounds 是一次性查询全部结果吗？为什么？
128.mybatis 逻辑分页和物理分页的区别是什么？
129.mybatis 是否支持延迟加载？延迟加载的原理是什么？
130.说一下 mybatis 的一级缓存和二级缓存？
131.mybatis 和 hibernate 的区别有哪些？
132.mybatis 有哪些执行器（Executor）？
133.mybatis 分页插件的实现原理是什么？
134.mybatis 如何编写一个自定义插件？
十四、RabbitMQ
135.rabbitmq 的使用场景有哪些？
136.rabbitmq 有哪些重要的角色？
137.rabbitmq 有哪些重要的组件？
138.rabbitmq 中 vhost 的作用是什么？
139.rabbitmq 的消息是怎么发送的？
140.rabbitmq 怎么保证消息的稳定性？
141.rabbitmq 怎么避免消息丢失？
142.要保证消息持久化成功的条件有哪些？
143.rabbitmq 持久化有什么缺点？
144.rabbitmq 有几种广播类型？
145.rabbitmq 怎么实现延迟消息队列？
146.rabbitmq 集群有什么用？
147.rabbitmq 节点的类型有哪些？
148.rabbitmq 集群搭建需要注意哪些问题？
149.rabbitmq 每个节点是其他节点的完整拷贝吗？为什么？
150.rabbitmq 集群中唯一一个磁盘节点崩溃了会发生什么情况？
151.rabbitmq 对集群节点停止顺序有要求吗？
十五、Kafka
152.kafka 可以脱离 zookeeper 单独使用吗？为什么？
153.kafka 有几种数据保留的策略？
154.kafka 同时设置了 7 天和 10G 清除数据，到第五天的时候消息达到了 10G，这个时候 kafka 将如何处理？
155.什么情况会导致 kafka 运行变慢？
156.使用 kafka 集群需要注意什么？
十六、Zookeeper
157.zookeeper 是什么？
服务注册中心
158.zookeeper 都有哪些功能？
159.zookeeper 有几种部署模式？
160.zookeeper 怎么保证主从节点的状态同步？
161.集群中为什么要有主节点？
162.集群中有 3 台服务器，其中一个节点宕机，这个时候 zookeeper 还可以使用吗？
163.说一下 zookeeper 的通知机制？
十七、MySql
164.数据库的三范式是什么？
165.一张自增表里面总共有 7 条数据，删除了最后 2 条数据，重启 mysql 数据库，又插入了一条数据，此时 id 是几？
166.如何获取当前数据库版本？
167.说一下 ACID 是什么？
168.char 和 varchar 的区别是什么？
169.float 和 double 的区别是什么？
170.mysql 的内连接、左连接、右连接有什么区别？
171.mysql 索引是怎么实现的？
172.怎么验证 mysql 的索引是否满足需求？
173.说一下数据库的事务隔离？
174.说一下 mysql 常用的引擎？
175.说一下 mysql 的行锁和表锁？
176.说一下乐观锁和悲观锁？
177.mysql 问题排查都有哪些手段？
178.如何做 mysql 的性能优化？
十八、Redis
179.redis 是什么？都有哪些使用场景？
Redis是key-value格式的缓存数据库，削峰、异步、解耦
Top榜单，首页不常更新的内容
180.redis 有哪些功能？
181.redis 和 memecache 有什么区别？
182.redis 为什么是单线程的？
183.什么是缓存穿透？怎么解决？
访问在redis中不存在的数据，请求直接访问数据库，
184.redis 支持的数据类型有哪些？
String、list、set、zset、hash
185.redis 支持的 java 客户端都有哪些？
Redisdesktopmanager
186.jedis 和 redisson 有哪些区别？
187.怎么保证缓存和数据库数据的一致性？
数据同步
188.redis 持久化有几种方式？
189.redis 怎么实现分布式锁？
190.redis 分布式锁有什么缺陷？
191.redis 如何做内存优化？
192.redis 淘汰策略有哪些？
193.redis 常见的性能问题有哪些？该如何解决？
十九、JVM
194.说一下 jvm 的主要组成部分？及其作用？
195.说一下 jvm 运行时数据区？
196.说一下堆栈的区别？
197.队列和栈是什么？有什么区别？
198.什么是双亲委派模型？
199.说一下类加载的执行过程？
200.怎么判断对象是否可以被回收？
201.java 中都有哪些引用类型？
202.说一下 jvm 有哪些垃圾回收算法？
203.说一下 jvm 有哪些垃圾回收器？
204.详细介绍一下 CMS 垃圾回收器？
205.新生代垃圾回收器和老生代垃圾回收器都有哪些？有什么区别？
206.简述分代垃圾回收器是怎么工作的？
207.说一下 jvm 调优的工具？
208.常用的 jvm 调优的参数都有哪些？

