# Gradle Sample
测试Gradle在项目中的使用，考虑在常规项目实际运用的场景下进行配置编辑

## Gradle相关核心点

- gradle父子项目中的结构
- gradle在父子项目中配置继承特点
- gradle自带提供的tasks测试
- gradle如何自定义task编写
- gradle父子项目时自定义task
- gradle如何构建java project\lib project\web project
- gradle中子项目相互引用
- gradle和springBoot结合构建web项目
- gradle项目linux中如何脚本话package发布

## 模块介绍

> gradle-test-dubbo-api

接口模块，通过maven的nexus方式发布管理公司内部jar；

> gradle-test-java

传统的java项目方式，java run main进行部署发布

> gradle-test-webapp

本地通过tomcat|jetty方式运行，以war方式进行部署发布

> gradle-test-jpa

编写以spring-boot-starter-data-jpa方式连接数据库

> gradle-test-bootapp

SpringBoot方式运行项目，并发布可执行jar方式部署

## 项目构建样例

> 本地开发环境，window为例

构建父项目  
gradle clean

> 自动化部署环境，linux为例

单独构建子项目  
gradle :gradle-test-java:run