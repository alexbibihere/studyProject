# SpringCloud
Spring
  
## SpringCloud整合项目
- eureka做注册中心
- ribbon做负载均衡
- feign做远程调用
- hystrix做断路器
- zuul做链路跟踪



## SpringCloud F 版本后feign默认不开启hystrix
- 如果想使用feign的fallback方法 必须在配置文件里面开启hystrix