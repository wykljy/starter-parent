# 自定义 springboot starter（步骤）
* 新建一个工程,命名为wangyakun-spring-boot-starter
(需要注意的是：自定义的starter 命名规则是xxx-spring-boot-starter，
官方给出的starter 的命名规则是spring-boot-starter-xxx)
* 在pom 文件中加入相应的依赖spring-boot-starter，spring-boot-configuration-processor
* 定义一个实体映射类配置信息，这里是MyEntity,加入注解
@ConfigurationProperties(prefix = "my.personal")，可以去读取以my.personal为
前缀的配置项了.
* 定义一个service,即获取对应方法的服务类，这里是MyService,
将之前的配置信息以成员属性的形式注入进去，添加对应服务类对外可供调用的方法，
这里是getPersonInfo，即为获取对应人员的信息(这里仅仅测试,自己可根据需要调整)
* 定义一个配置类,这里是MyConfiguration,需要注意以下几个注解:
@Configuration: 标注该类是一个配置类，类似于以前的xml文件
@EnableConfigurationProperties：用来开启对@ConfigurationProperties 注解配置Bean的支持，
告诉Spring Boot 能支持@ConfigurationProperties
@ConditionalOnWebApplication：web应用生效
* 最后就是在resources 目录下新建目录META-INF,创建spring.factories 文件:
org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.wangyakun.starter.wangyakunspringbootstarter.config.MyConfiguration
这里指向的就是刚才的配置类
* 将工程编译执行命令 mvn clean install -Dmaven.test.skip=true，一个崭新的starter
就出来了，然后新建测试工程，在pom中导入该starter即可调用对应的方法
 


