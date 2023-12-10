# 使用场景
![img_4.png](attachments/Redis/img_4.png)
# 缓存三兄弟（穿透、击穿、雪崩）、双写一致、持久化、数据过期策略、数据淘汰策略

## 缓存穿透
查询一个不存在的数据，mysql查询不到数据也不会直接写入缓存，就会导致每次请求都查数据库
### 解决方案一： 缓存空数据，查询返回的数据为空，仍把空结果进行缓存
- 优点简单，
- 缺点 消耗内存，可能会发生不一致的问题）
### 解决方案二： 布隆过滤器
-优点：内存占用较少，没有多余key
- 缺点： 实现复杂，存在误判
- 布隆过滤器实现方案
  -- Reddison
  -- Guava
- 存在误判率：数组越小误判率就越大，数据越大误判率就越小，但同时带来更大的内存消耗
- 一般设置在0.05
  ![img_5.png](attachments/Redis/img_5.png)
=========
  ![img_6.png](attachments/Redis/img_6.png)
## 缓存击穿
给某一个key设置了过期时间，当key过期的时候，恰好这时间点对这个key有大量的并发请求过来，这些并发请求可能会瞬间把DB压垮
### 解决方案一： 互斥锁  （强一致、性能差）
### 解决方案二： 逻辑过期 （高可用，性能优，不保证数据绝对一致）
![img_7.png](attachments/Redis/img_7.png)
=========

![img_8.png](attachments/Redis/img_8.png)
![img_9.png](attachments/Redis/img_9.png)
## 缓存雪崩
缓存雪崩是指在同一时段大量的缓存key同时失效 或者Redis服务宕机，导致大量请求到达数据库，带来巨大压力
### 解决方案
- 给不同的Key的TTL 添加随机值
- 利用Redis集群提高服务的可用性（哨兵模式、集群模式）
- 给缓存业务添加降级限流策略 （**降级可作为系统的保底策略，适用于  穿透 、击穿、雪崩**）
- 给业务添加多级缓存
=============
 ![img_9.png](attachments/Redis/img_9.png)

![img_10.png](attachments/Redis/img_10.png)

# 双写一致
## 双写一致性：当修改了数据库的数据也要同时更新缓存的数据，缓存和数据库的数据要保持一致
- 读操作： 缓存命中，直接返回； 缓存未命中查询数据库，写入缓存，设定超时时间
- 写操作： 延时双删
![Pasted image 20231209194215.png](attachments/Redis/Pasted image 20231209194215.png)

## 读写锁（强一致，性能不高）
![Pasted image 20231209195502.png](attachments/Redis/Pasted image 20231209195502.png)

读锁
![Pasted image 20231209195537.png](attachments/Redis/Pasted image 20231209195537.png)

写锁（排他锁）
![Pasted image 20231209195551.png](attachments/Redis/Pasted image 20231209195551.png)

## 异步通知保证数据的最终一致性
![Pasted image 20231209195848.png](attachments/Redis/Pasted image 20231209195848.png)

![Pasted image 20231209195934.png](attachments/Redis/Pasted image 20231209195934.png)

==================
![Pasted image 20231209200204.png](attachments/Redis/Pasted image 20231209200204.png)
![Pasted image 20231209200229.png](attachments/Redis/Pasted image 20231209200229.png)

# 持久化

## RDB
![Pasted image 20231209210632.png](attachments/Redis/Pasted image 20231209210632.png)
### RDB的执行原理
![Pasted image 20231209210940.png](attachments/Redis/Pasted image 20231209210940.png)


## AOF
全称为 Append Only File(追加文件)，Redis处理的每一个写命令都会记录在AOF文件，可以看做是命令日志文件
![Pasted image 20231209211336.png](attachments/Redis/Pasted image 20231209211336.png)

![Pasted image 20231209211439.png](attachments/Redis/Pasted image 20231209211439.png)

===============

![Pasted image 20231209211614.png](attachments/Redis/Pasted image 20231209211614.png)

# 数据过期策略

## 惰性删除
- 访问key的时候判断是否过期，如果过期，则删除
  ![Pasted image 20231209211944.png](attachments/Redis/Pasted image 20231209211944.png)

## 定期删除
- 定期检查一定量的key是否过期（SLOW模式+ FAST模式）
  ![Pasted image 20231209212112.png)(pic/Pasted image 20231209212112.png)
  ============
  ![Pasted image 20231209212241.png](attachments/Redis/Pasted image 20231209212241.png)

# 数据淘汰策略
![Pasted image 20231209212613.png](attachments/Redis/Pasted image 20231209212613.png)
![Pasted image 20231209212725.png](attachments/Redis/Pasted image 20231209212725.png)

================
![Pasted image 20231209212920.png](attachments/Redis/Pasted image 20231209212920.png)
# 分布式锁

## setnx

## redisson

![Pasted image 20231210105457.png](attachments/Redis/Pasted image 20231210105457.png)

# Redis 集群
## 主从复制
Redis搭建主从集群，一主多从 实现读写分离
主集群负责写操作，从集群负责读操作，
如果有写操作 ，则同步数据到从集群
全量同步 和增量同步
![Pasted image 20231210105745.png](attachments/Redis/Pasted image 20231210105745.png)


![Pasted image 20231210110118.png)(pic/Pasted image 20231210110118.png)

![Pasted image 20231210110224.png](attachments/Redis/Pasted image 20231210110224.png)

===============
![Pasted image 20231210111325.png](attachments/Redis/Pasted image 20231210111325.png)

## 哨兵模式
![Pasted image 20231210111840.png](attachments/Redis/Pasted image 20231210111840.png)

## 哨兵选主的规则核心
根据slave 的 offset值，值越大优先级越高

![Pasted image 20231210112231.png](attachments/Redis/Pasted image 20231210112231.png)


==============
![Pasted image 20231210112507.png](attachments/Redis/Pasted image 20231210112507.png)
## 分片集群

![Pasted image 20231210113028.png](attachments/Redis/Pasted image 20231210113028.png)



=======================

![Pasted image 20231210113338.png](attachments/Redis/Pasted image 20231210113338.png)

# Redis 为什么这么快

纯内存操作 ，单线程， 支持IO多路复用
![Pasted image 20231210113522.png](attachments/Redis/Pasted image 20231210113522.png)

IO多路复用
- select
- poll
- epoll
  ![Pasted image 20231210114931.png](attachments/Redis/Pasted image 20231210114931.png)

## Redis网络模型
![Pasted image 20231210115123.png](attachments/Redis/Pasted image 20231210115123.png)

================
