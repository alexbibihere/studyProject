# SpringMVC

## SpringMVC常用注解
- @Controller
- @RequestMapping
- @ResponseBody
- @RequestBody
- @PathVariable
- @RestController


## SpringMVC运行流程

spring mvc 先将请求发送给 DispatcherServlet。
DispatcherServlet 查询一个或多个 HandlerMapping，找到处理请求的 Controller。
DispatcherServlet 再把请求提交到对应的 Controller。
Controller 进行业务逻辑处理后，会返回一个ModelAndView。
Dispathcher 查询一个或多个 ViewResolver 视图解析器，找到 ModelAndView 对象指定的视图对象。
视图对象负责渲染返回给客户端。