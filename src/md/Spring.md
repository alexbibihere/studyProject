# Spring 面试题

## Spring 的事务 
- 编程式事务管理：编程方式管理事务，极大灵活性，难维护。

- 声明式事务管理：可以将业务代码和事务管理分离，用注解和xml配置来管理事务。


## IOC在项目中的作用
- ioc解决对象之间的依赖问题，把所有bean的依赖关系通过配置文件或者注解关联起来，降低了耦合度

## spring的配置文件的内容

- 开启事务注解驱动
- 事务管理器
- 开启注解功能，并配置扫描包
- 配置数据库
- 配置SQL会话工厂，别名，映射文件
- 不用编写Dao层的实现类


## spring下的注解

- 注册：@Controller @Service @Component

- 注入：@Autowired @Resource

- 请求地址：@RequestMapping

- 返回具体数据类型而非跳转：@ResponseBody

## Spring DI 的三种方式?

- 构造器注入：通过构造方法初始化
- setter方法注入：通过setter方法初始化
- 接口注入


## Spring主要使用了什么模式？
- 工厂模式：每个Bean的创建通过方法
-  单例模式：默认的每个Bean的作用域都是单例
-  代理模式：关于Aop的实现通过代理模式

## IOC，AOP的实现原理？
- IOC：通过反射机制生成对象注入
- AOP：动态代理