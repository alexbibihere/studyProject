重置blog需安装软件 

blog待修改点 **微信扫码登录 消息队列 es全文检索、图片上传功能**


待学习知识点 springcloud dubbo +zookeeper 

多线程、分布式锁、分布式session

jdk8 lamda表达式、http知识点、学习写io流、

CollectionsUtils工具类的学习
- collect、filter等等


sql练习 牛客网刷题



Get请求方式不支持@RequestBody


## 做一个分布式的商城开发，在两个月之内


## 2019年6月23日20:32:51 天气热炸了


## 写一个网页版的聊天室 用websocket

## 学习数据库相关知识，索引以及更高级的知识



--------------------------

# blog linux 运行命令

## 启动docker
systemctl start docker 

## 启动jar包  
nohup java -jar xxx.jar &    

## tail -f nohup.out   输出日志

## docker ps -a   查看docker 运行中的容器

## netstat -antp   查看所有端口

docker stats nginx1
docker exec -it mysql bash
docker exec -it redis bash
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=root -d mysql
docker run -it -d --name mysql -p3306:3306 -e MYSQL_ROOT_PASSWORD=root mysql

redis-cli -h localhost -p 6379 -a 532313 本地启动redis
redis-server redis.conf
redis-server /usr/redis/redis.conf
redis-server /usr/redis-4.0.9/redis.conf

service mysqld restart 
mysql -r root -p

## vim 编辑文件
insert 进入编辑状态
：wq 保存文件并退出vi