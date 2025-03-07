# DistributedCrawler
字节青训营大数据项目二-简易分布式爬虫系统   

本项目是一个简易分布式爬虫系统，在Flink流式框架下并发地爬取豆瓣的影视作品信息，将其清洗和解析后存储到MySQL数据库中。
### 1. 项目部署

#### 1.1 环境配置

```
Windows11系统
java：jdk1.8
flink：1.13.0
redis：redis-5.0.14
mysql：8.0.33
```

#### 1.2 启动步骤

1. 根据当前电脑redis、mysql、RabbitMQ配置，修改\resources\static\application.yml，\resources\static\application-cache.yml,\resources\static\application-mq.yml,\resources\static\application-url.yml,\resources\static\application-xxl.yml配置文件。
2. 根据\scripts\douban.sql在mysql或者连接mysql的navicat中建立数据库和表。
3. 进入redis安装目录，打开cmd，运行redis-server.exe，保持窗口开启。
4. 运行SubjectsTest。

####本项目的Flink模块与爬虫模块未实现整合，Flink代码见Flink.txt。
