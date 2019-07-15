## 工作流引擎
- BPM、activiti、flowable

--项目采用activity为主，涉及到流程转发，流程监控，流程分析

-- 写一个demo 看看具体activity是如何根据表数据去完成流程的流转的




## activiti 核心

- 七大接口 
RepositoryService：提供一系列管理流程部署和流程定义的API。
RuntimeService：在流程运行时对流程实例进行管理与控制。
TaskService：对流程任务进行管理，例如任务提醒、任务完成和创建任务等。
IdentityService：提供对流程角色数据进行管理的API，这些角色数据包括用户组、用户及它们之间的关系。
ManagementService：提供对流程引擎进行管理和维护的服务。
HistoryService：对流程的历史数据进行操作，包括查询、删除这些历史数据。
FormService：表单服务。



- 28张表