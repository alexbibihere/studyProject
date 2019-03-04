## Redis是一种内存型数据库，支持数据的持久化
1. 基础结构
  - Redis核心是单进程单线程服务，通过epoll、select等实现了IO多路复用，可以并发处理网络事件
2. 数据结构   
   Redis常用的五种数据结构:   
   - String[字符串]
   -    list[数组]
   -   set[集合]
   -    Hash[散列]
   -    zset[有序集合]
  