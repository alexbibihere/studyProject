## JSP全名为Java Server Page，java服务器页面，JSP是一种基于文本的程序，特点就是HTML和JSP代码共同存在
- JSP生命周期  
  - JSP也是Servlet，运行时只有一个实例，JSP初始化和销毁时也会调用Servlet的init()和destory()方法
 
## JSP内置对象  
  九个内置对象 
- request 用户端请求，此请求会包含来自GET/POST请求的参数
- response 网页传回用户端的回应
-  pageContext 网页的属性都是在这里管理
-  session 与请求有关的会话期
- application 正在执行的内容
- out 用来传送回应的输出
-  config servlet的构架部件
- page JSP网页本身
- exception 针对错误网页，来捕捉的例外
  
## JSP的四个作用域
- page  
  -    page对象代表的就是当前页面【只在一个页面中保存属性，跳转页面无效】
- request  
  - http请求到服务器处理结束返回响应的过程【只在一次请求中保存属性，服务器跳转有效，浏览器跳转无效】
- session  
  -   有效范围，当前会话、打开到关闭的这个过程【在一个会话范围中有效，无论何种跳转都有效，关闭浏览器后无效】
- application 
  -    整个应用【在整个服务器中保存，所有用户都可以试用】
  
## session 和cookie的区别
session和cookie都是会话跟踪技术， cookie通过在客户端记录信息确定用户身份，
session通过在服务器端记录信息确定用户身份，
但是session的实现依赖于cookie，sessionId（session的唯一标识需要放在客户端）。

- cookie 数据存放在浏览器， session数据放在服务器上
- cookie 不安全，存放在本地容易被拿到进行cookie欺骗，考虑安全应当使用session
- session
  会在一定时间内保存在服务器上，当访问增多，会比较占用服务器的性能，考虑到服务器性能应该使用cookie
- cookie保存数据大小有限制
- 登录信息等重要信息存放session，其他信息如果需要保留 放在cookie(购物车)
  

