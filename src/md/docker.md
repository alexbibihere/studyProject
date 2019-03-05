# docker 虚拟容器技术

## 核心概念
-   docker主机(host):安装了Docker程序的机器;
- docker客户端(Client):连接docker主机进行操作;
- docker仓库(Registry):用来保存各种打包好的软件镜像;
- docker镜像(Images):软件打包好的镜像,放在docker仓库中;
- docker容器(Container):镜像启动后的实例称为容器；容器是独立运行的一个或一组应用



## docker常用命令
-  查看centos版本; **uname -r**
- 安装docker; **yum install docker**
- 启动docker; **systemctl start docker**
- 讲docker服务设为开机启动 **systemctl enable docker**
- 查看docker版本; **docker -v**
- 停止docker; **stop docker**
- 镜像检索; **docker search 关键字**
- 拉取镜像; **docker pull 镜像名：tag**
- 查看docker镜像; **docker images**
- 删除docker镜像; **docker rm image-id**
- 运行docker; **docker run --name xxxxx -d xxxx **
- 端口映射; **-p 6379:6379**
- 日志; **docker logs**
- 查看运行中的容器; **docker ps**