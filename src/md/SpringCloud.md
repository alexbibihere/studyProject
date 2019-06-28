# SpringCloud
SpringCloud是一个分布式的整体解决方案，SpringCloud为开发者提供了在分布式系统(配置管理，服务发现，熔断，路由，微代理  
控制总线，一次性token，全局锁，leader选举，分布式session，集群状态)中快速构建的工具，使用SpringCloud的开发者可用快速的启动服务或构建应用、
同时能够快速和云平台资源进行对接。
- SpringCloud分布式开发五大常用组件
  -   服务发现---Netflix Eureka
  -   客户端负载均衡---Netflix Ribbon
  -   断路器-----Netflix Hystrix
  -   服务网关----Netflix Zuul
  -   分布式配置---SpringCloud Config
  -   动态代理---Feign 
  
  
  
## SpringCloud整合项目
- eureka做注册中心
- ribbon做负载均衡
- feign做远程调用
- hystrix做断路器
- zuul做链路跟踪