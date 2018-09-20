### 部署Maven项目到Jcenter
~/.custom_command_profile



>1. 创建各种账户并完成相关配置
>
	```
	github账户
	bintray账户，例如用户名：farubaba
	根据bintray中对repository和package的配置来配置maven的.settings文件
	执行：mvn help:system 可以查看maven安装路径：
	maven.conf=/usr/local/opt/maven/conf
	```
>1. 创建github仓库，仓库名： feature-root
>1. 创建maven项目，项目名：feature-root
>1. 上传maven项目到github仓库 (feature-root)
>1. 新建bintray仓库(repository)，仓库名：java
>1. 在上面创建的仓库：java中新建一个package（此处可以直接从github导入 feature-root）
>1. 配置maven的.settings文件
>
```
<servers>
	<server>
	    <id>bintray-farubaba-java</id>
	    <username>farubaba</username>
	    <password>36482d9793d75069e4b7b7这个是bintray的 key</password>
	</server>
</servers>  
<profiles>
   <profile>
       <repositories>
           <repository>
               <snapshots>
                   <enabled>false</enabled>
               </snapshots>
               <id>bintray-farubaba-java</id>
               <name>bintray</name>
               <url>https://dl.bintray.com/farubaba/java</url>
           </repository>
       </repositories>
       <pluginRepositories>
           <pluginRepository>
               <snapshots>
                   <enabled>false</enabled>
               </snapshots>
               <id>bintray-farubaba-java</id>
               <name>bintray-plugins</name>
               <url>https://dl.bintray.com/farubaba/java</url>
           </pluginRepository>
       </pluginRepositories>
       <id>bintray</id>
   </profile>
</profiles>
<activeProfiles>
   <activeProfile>bintray</activeProfile>
</activeProfiles>
```
>1. 配置pom.xml文件

>	配置一个bintray仓库repository：
>
	```
<distributionManagement>
		<repository>
		   <id>bintray-farubaba-java</id>
		   <name>farubaba-java</name>
		   <url>https://api.bintray.com/maven/farubaba/java/feature-root/;publish=1</url>
		</repository>
</distributionManagement>
```
>1. 发布项目到私有仓库

>	mvn deploy
	
>1. 申请发布项目到JCenter
>
>	在bintray中package的对应版本处有申请按钮，点击申请即可，一般几个小时候批准。
>
>1. 分别在Maven、Gradle、lvy中引用我们开发的库

### Maven简单项目结构

```java

src/main/java
src/main/resources
src/test/java
src/test/resources

不同目录下的资料文件，提供给测试类使用：PropertiesUtilTest.java
farubaba.properties		
src/main/resources/src_main_resources.properties

pom.xml

readme.MD

```

### 部署到Jcenter私有仓库

```
<distributionManagement>
	<repository>
	   <id>bintray-farubaba-java</id>
	   <name>farubaba-java</name>
	   <url>https://api.bintray.com/maven/farubaba/java/feature-root/;publish=1</url>
	</repository>
</distributionManagement>
```