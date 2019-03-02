## JSP全名为Java Server Page，java服务器页面，JSP是一种基于文本的程序，特点就是HTML和JSP代码共同存在
- JSP生命周期  
  - JSP也是Servlet，运行时只有一个实例，JSP初始化和销毁时也会调用Servlet的init()和destory()方法
 
## JSP内置对象  
  九个内置对象 
-  pageContext
- out  
- page
- request
-  response
-  config
-  session
- application
- exception  
  
## JSP的四个作用域
- page  
  -    page对象代表的就是当前页面【只在一个页面中保存属性，跳转页面无效】
- request  
  - http请求到服务器处理结束返回响应的过程【只在一次请求中保存属性，服务器跳转有效，浏览器跳转无效】
- session  
  -   有效范围，当前会话、打开到关闭的这个过程【在一个会话范围中有效，无论何种跳转都有效，关闭浏览器后无效】
- application 
  -    整个应用【在整个服务器中保存，所有用户都可以试用】
  

