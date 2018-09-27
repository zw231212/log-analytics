### 项目说明
  对外提供数据的服务项目
  ```
  以下都是按照时间来进行查询的，只有查询行为，不提供修改行为。
  1、统计浏览数、页面数、IP数、Bytes数、非浏览器数、文件数、404数、500数
  2、访问来源统计（referrer）
  3、访问时长与时间段
  4、访问者国家与城市
  5、操作系统与浏览器
  6、400与500类型的页面url
  7、访问的全部日志
  ```

运行方式
--------------
  （1）gradle build jar，然后运行jar(后期整合tomcat以及war包以及静态资源等问题后出现了问题)；
 
  （2）gradle build war，然后tomcat运行；
 
  （3）直接运行LogAPIApplication主函数；
  
  （4）IDEA tomcat中添加项目进行运行；
  
  在开发的时候注释掉default servlet，以便于在修改HTML等文件的时候需要重启；
  
### 数据模型说明

是否为每个数据源提供动态的mapper和接口文件的位置？
还是只是提供一个通用的额mapper文件存储的地址  ?
  
#### 更新说明：

#### API changes ：

#### added ：

#### bug fixed :

#### optimised :
