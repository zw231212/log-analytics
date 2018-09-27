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
 
 
###数据表与网页对照说明
```
基本字段说明：
  pages ：网页数；
  hits ：文件数
  bandwidth ：字节数
（1）摘要数据、按月历史统计数据和主机（相关的数据统计数据）对应表：general ；
（2）按日期统计数据对应表：daily
（3）按星期来统计数据对应表：
（4）每小时浏览次数：hours
（5）参观者的网域或国家：domain
（6）主机和最近参观日期、无法反解译的IP地址的数据对应表：visitors
（7）搜索引擎网站的机器人对应表：robot；
（8）每次参观所花时间：session ；
（9）文件类别：filetypes
（10）下载：download，暂缺
（11）url网址，也就是浏览的网页，还有入站处（entry不能为0），出站处（exit不为0）的数据对应表：pages
（12）操作系统、无法得知的操作系统数据对于表：os与unkos
（13）浏览器与无法得知的浏览器对应表数据：browser与unkbrowser
（14）链接网站的方法：origin
（15）用以搜索的短语和用以搜索的关键词：searchwords 和searchkeywords
（16）HTTP错误码：errors对应总表，error404对应各自错误的页面
```
 
  
#### 更新说明：

#### API changes ：

#### added ：

#### bug fixed :

#### optimised :
