# JAVA常用面试题
## 集合
1.  ArrayList和Vector的区别
2.  HashMap和Hashtable的区别
3.  List和Map的区别
4.  Set里的元素是不能重复的，那么用什么方法来区分重复与否呢? 是用==还是equals()?
5.  Collection和Collections的区别
6.  说出ArrayList,LinkedList的存储性能和特性
7.  Enumeration和Iterator接口的区别
8.  ListIterator有什么特点
9.  并发集合类是什么？
10.  Java中HashMap的key值要是为类对象则该类需要满足什么条件？
11.  ArrayList集合加入1万条数据，应该怎么提高效率
12.  与Java集合框架相关的有哪些最好的实践


## Servlet+Tomcat面试题
1. Tomcat的缺省端口是多少，怎么修改
1. Tomcat 有哪几种Connector 运行模式(优化)？
1. Tomcat有几种部署方式
1. Servlet生命周期
1. get方式和post方式有何区别
1. doGet与doPost方法的两个参数是什么
1. 获取页面的元素的值有几种方式，分别说一下
1. request.getAttribute()和request.getParameter()区别
1. forward和redirect的区别
1. tomcat容器是如何创建servlet类实例？用到了什么原理
1. 什么是cookie？Session和cookie有什么区别？
1. Servlet安全性问题

## JSP面试题

1. jsp静态包含和动态包含的区别
1. jsp有哪些内置对象?作用分别是什么?
1. jsp和servlet的区别、共同点、各自应用的范围？
1. 属性作用域范围
1. 写出5种JSTL常用标签
1. 写一个自定义标签要继承什么类
1. JSP是如何被执行的？执行效率比SERVLET低吗？
1. 如何避免jsp页面自动生成session对象？
1. jsp的缺点？
1. 说出Servlet和CGI的区别？
1. 简述JSP的设计模式。

## JDBC
1. JDBC操作数据库的步骤 ？
1. JDBC中的Statement 和PreparedStatement，CallableStatement的区别？
1. JDBC中大数据量的分页解决方法?
1. 说说数据库连接池工作原理和实现方案？
1. Java中如何进行事务的处理?
1. 写出一段JDBC连接本机MySQL数据库的代码
1. JDBC是如何实现Java程序和JDBC驱动的松耦合的？
1. execute，executeQuery，executeUpdate的区别是什么？
1. JDBC的脏读是什么？哪种数据库隔离级别能防止脏读？
1. 什么是幻读，哪种隔离级别可以防止幻读？
1. JDBC的DriverManager是用来做什么的？
1. JDBC的ResultSet是什么？
1. 有哪些不同的ResultSet？
1. JDBC的DataSource是什么，有什么好处
1. JDBC中存在哪些不同类型的锁？
1. java.util.Date和java.sql.Date有什么区别？
1. 如果java.sql.SQLException: No suitable driver found该怎么办？
1. JDBC的RowSet是什么，有哪些不同的RowSet？
1. 什么是JDBC的最佳实践

## 数据库

1. 什么是存储过程？有哪些优缺点？
1. 三个范式是什么
1. 什么是视图？以及视图的使用场景有哪些？
1. drop、delete与truncate分别在什么场景之下使用？
1. 索引是什么？有什么作用以及优缺点？
1. 什么是事务？
1. 数据库的乐观锁和悲观锁是什么？
1. 超键、候选键、主键、外键分别是什么？
1. SQL 约束有哪几种？
1. 数据库运行于哪种状态下可以防止数据的丢失？
1. Mysql存储引擎
1. MyIASM和Innodb两种引擎所使用的索引的数据结构是什么？
1. varchar和char的区别
1. mysql有关权限的表都有哪几个
1. 数据表损坏的修复方式有哪些？
1. MySQL中InnoDB引擎的行锁是通过加在什么上完成
1. 数据库优化的思路
1. Oracle和Mysql的区别

## Http

1. Http与Https的区别：
1. 什么是Http协议无状态协议?怎么解决Http协议无状态协议?
1. URI和URL的区别
1. 常用的HTTP方法有哪些？
1. HTTP请求报文与响应报文格式
1. HTTPS工作原理
1. 一次完整的HTTP请求所经历的步骤
1. 常见的HTTP相应状态码
1. HTTP1.1版本新特性
1. HTTP优化方案

## 过滤器和监听器用法

1. 监听器有哪些作用和用法？
1. 过滤器有哪些作用和用法？
1. web.xml 的作用？
1. Servlet 3中的异步处理指的是什么？

## AJAX

1. 什么是AJAX，为什么要使用Ajax
1. AJAX应用和传统Web应用有什么不同？
1. 请介绍一下XMLhttprequest对象
1. 介绍一下XMLHttpRequest对象的常用方法和属性
1. Ajax的实现流程是怎样的？
1. AJAX请求总共有多少种CALLBACK
1. XMLHttpRequest对象在IE和Firefox中创建方式有没有不同。
1. AJAX有哪些有点和缺点？
1. 请解释一下 JavaScript 的同源策略。
1. 阐述一下异步加载JS。
1. 如何解决跨域问题?
1. Ajax 解决浏览器缓存问题？

## Hibernate

1. Hibernate工作原理及为什么要用？
1. Hibernate是如何延迟加载(懒加载)?
1. Hibernate中怎样实现类之间的关系?(如：一对多、多对多的关系)
1. hibernate的三种状态之间如何转换
1. 比较hibernate的三种检索策略优缺点
1. hibernate都支持哪些缓存策略
1. hibernate里面的sorted collection 和ordered collection有什么区别
1. 说下Hibernate的缓存机制
1. Hibernate的查询方式有几种
1. 如何优化Hibernate？
1. 谈谈Hibernate中inverse的作用
1. JDBC hibernate 和 ibatis 的区别
1. 在数据库中条件查询速度很慢的时候,如何优化?
1. 什么是SessionFactory,她是线程安全么
1. get和load区别
1. persist和save的区别
1. merge的含义
1. 主键生成策略有哪些
1. 简述hibernate中getCurrentSession和openSession区别
1. Hibernate中的命名SQL查询指的是什么?
1. 可不可以将Hibernate的实体类定义为final类?

## Mybatis

1. #{}和${}的区别是什么？
1. 当实体类中的属性名和表中的字段名不一样 ，怎么办 ？
1. 如何获取自动生成的(主)键值?
1. 在mapper中如何传递多个参数?
1. Mybatis动态sql是做什么的？都有哪些动态sql？能简述一下动态sql的执行原理不？
1. Mybatis的Xml映射文件中，不同的Xml映射文件，id是否可以重复？
1. 为什么说Mybatis是半自动ORM映射工具？它与全自动的区别在哪里？
1. 通常一个Xml映射文件，都会写一个Dao接口与之对应，请问，这个Dao接口的工作原理是什么？Dao接口里的方法，参数不同时，方法能重载吗？
1. Mybatis比IBatis比较大的几个改进是什么
1. 接口绑定有几种实现方式,分别是怎么实现的?
1. Mybatis是如何进行分页的？分页插件的原理是什么？
1. 简述Mybatis的插件运行原理，以及如何编写一个插件
1. Mybatis是否支持延迟加载？如果支持，它的实现原理是什么？
1. Mybatis都有哪些Executor执行器？它们之间的区别是什么？
1. MyBatis与Hibernate有哪些不同？
