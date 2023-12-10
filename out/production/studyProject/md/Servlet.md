# Servlet

## Servlet的生命周期
- 加载、实例化、初始化、处理请求、服务结束 
 
 1.初始化阶段 ，调用init()方法  
 2.响应客户端请求阶段 ，调用Service()方法   
 3.终止阶段，调用destory()方法
 
 
## Servlet API中的forward()和redirect()的区别

- forward是服务器端的转向，redirect是客户端的转向
- 使用forward浏览器的地址不会改变，而使用redirect地址会改变
- forward是一次请求中完成，而redirect是重新发起请求