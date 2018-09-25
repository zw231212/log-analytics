### 项目说明
  日志的解析结果api。
 ```
 日志是通过awstats来进行解析的；
 而awstats的解析结果是由aw2sql来进行入库的，只是每次都是不同的数据库，而不是统一的数据库。
 最后dsdb模块要实现的就是每次传入的都是不同的数据库的名称，甚至有可能是不同的host，
 根据传递的参数的不同来加载获取数据库的连接。
 然后在api模块里面实现调用。加载获取不同数据库的数据。

```
### 数据模型说明
  
### 一些说明
  
##### 任务说明：

    
#### 框架任务：
    

#### 代码提交说明
    

#### 处理springboot中使用thymleaf需要重启的问题：
    1. 增加develtools依赖；
    2. 然后在进入settings->complier->make project automatically,打勾；
    3. 然后 Shift+Ctrl+Alt+/，选择Registry
    4. 找到complier.automake.allow.when.app.running 这样完成了不用不断重启的配置；

#### 更新说明：

#### API changes ：

#### added ：

#### bug fixed :

#### optimised :
