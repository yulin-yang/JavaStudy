# 一、Hello，World！

## 1、SpringBoot简介

### 回顾什么是Spring

- Spring是一个开源框架，或者称为“容器”。2003 年兴起的一个轻量级的Java 开发框架，作者：Rod Johnson  。音乐学博士
- **Spring是为了解决企业级应用开发的复杂性而创建的，简化开发。**

### Spring是如何简化Java开发的

为了降低Java开发的复杂性，Spring采用了以下4种关键策略：

1、基于POJO的轻量级和最小侵入性编程，所有东西都是bean；很多东西添加进来都只是扩展，而不会改变源程序

2、通过IOC，依赖注入（DI）和面向接口实现松耦合；

3、基于切面（AOP）和惯例进行声明式编程；

4、通过切面和模版（template）减少样式代码，RedisTemplate，xxxTemplate；

### 什么是SpringBoot

- 自动装配！！

- 学过javaweb的同学就知道，开发一个web应用，从最初开始接触Servlet结合Tomcat, 跑出一个Hello Wolrld程序，是要经历特别多的步骤；后来就用了框架Struts，再后来是SpringMVC，到了现在的SpringBoot，过一两年又会有其他web框架出现；你们有经历过框架不断的演进，然后自己开发项目所有的技术也在不断的变化、改造吗？建议都可以去经历一遍；
- 言归正传，什么是SpringBoot呢，就是一个javaweb的开发框架，和SpringMVC类似，对比其他javaweb框架的好处，官方说是简化开发，约定大于配置，  you can "just run"，能迅速的开发web 应用，几行代码开发一个http接口。
- 所有的技术框架的发展似乎都遵循了一条主线规律：从一个复杂应用场景 衍生 一种规范框架，人们只需要进行各种配置而不需要自己去实现它，这时候强大的配置功能成了优点；发展到一定程度之后，人们根据实际生产应用情况，选取其中实用功能和设计精华，重构出一些轻量级的框架；之后为了提高开发效率，嫌弃原先的各类配置过于麻烦，于是开始提倡“**约定大于配置**”，进而衍生出一些一站式的解决方案。
- 是的这就是Java企业级应用->J2EE->spring->springboot的过程。
- 随着 Spring 不断的发展，涉及的领域越来越多，项目整合开发需要配合各种各样的文件，慢慢变得不那么易用简单，违背了最初的理念，甚至人称配置地狱。Spring Boot 正是在这样的一个背景下被抽象出来的开发框架，目的为了让大家更容易的使用 Spring 、更容易的集成各种常用的中间件、开源软件；
- Spring Boot 基于 Spring 开发，Spirng Boot 本身并不提供 Spring 框架的核心特性以及扩展功能，只是用于快速、敏捷地开发新一代基于 Spring 框架的应用程序。也就是说，它并不是用来替代 Spring 的解决方案，而是和 Spring 框架紧密结合用于提升 Spring 开发者体验的工具。Spring Boot 以**约定大于配置的核心思想**，默认帮我们进行了很多设置，多数 Spring Boot 应用只需要很少的 Spring 配置。同时它集成了大量常用的第三方库配置（例如 Redis、MongoDB、Jpa、RabbitMQ、Quartz 等等），Spring Boot 应用中这些第三方库几乎可以零配置的开箱即用。
- 简单来说就是SpringBoot其实不是什么新的框架，它默认配置了很多框架的使用方式，就像maven整合了所有的jar包，spring boot整合了所有的框架 。
- Spring Boot 出生名门，从一开始就站在一个比较高的起点，又经过这几年的发展，生态足够完善，Spring Boot 已经当之无愧成为 Java 领域最热门的技术。

### **Spring Boot的主要优点：**

- 为所有Spring开发者更快的入门
- **开箱即用**，提供各种默认配置来简化项目配置
- 内嵌式容器简化Web项目
- 没有冗余代码生成和XML配置的要求

真的很爽，我们快速去体验开发个接口的感觉吧！



## 2、第一个SpringBoot程序

### 2.1、准备工作

我们将学习如何快速的创建一个Spring Boot应用，并且实现一个简单的Http请求处理。通过这个例子对Spring Boot有一个初步的了解，并体验其结构简单、开发快速的特性。

环境准备：

- jdk1.8
- Maven-3.6.1
- SpringBoot 最新版（因为3.0版本需要java17，此电脑为java8，所以这里用的2.79版本）
- IDEA
- 直接在pom.xml文件中修改版本，随后重新加载maven（报红错可以清楚IDE缓存）

![1678447184214](SpringBoot01：Hello,World！.assets/1678447184214-1706196415046-4.png)

### 2.2、创建基础项目说明

Spring官方提供了非常方便的工具让我们快速构建应用

Spring Initializr：https://start.spring.io/

**项目创建方式一：**在官网使用Spring Initializr 的 Web页面创建项目

1、打开  https://start.spring.io/

2、填写项目信息,添加springweb依赖（相当于自动配置web.xml和dispatchServlet）目前只需要勾上这一个依赖就可以

3、点击”Generate Project“按钮生成项目；下载此项目

4、解压项目包，并用IDEA以Maven项目导入（是import而不是open），一路下一步即可，直到项目导入完毕。

5、如果是第一次使用，可能速度会比较慢，包比较多、需要耐心等待一切就绪。

![1678440096173](SpringBoot01：Hello,World！.assets/1678440096173-1706196415046-5.png)

**项目创建方式二：**使用 IDEA 直接创建项目

1、创建一个新项目

2、选择spring initalizr ， 可以看到默认就是去官网的快速构建工具那里实现

3、填写项目信息

4、选择初始化的组件（初学勾选 Web 即可）

5、填写项目路径

6、等待项目构建成功

![1678449171493](SpringBoot01：Hello,World！.assets/1678449171493-1706196415047-6.png)

![1678440893822](SpringBoot01：Hello,World！.assets/1678440893822-1706196415047-7.png)

记得修改maven结构

![1678441473757](SpringBoot01：Hello,World！.assets/1678441473757-1706196415047-8.png)

**项目结构分析：**

通过上面步骤完成了基础项目的创建。就会自动生成以下文件。

1、程序的主启动类，相当于main方法，不能删也不能改，通过spring应用的入口。

2、一个 application.properties 配置文件，springboot的核心配置文件

3、一个 单元测试类

4、一个 pom.xml

假如遇到了maven下载问题，可以清楚IDE的缓存

![1678442680617](SpringBoot01：Hello,World！.assets/1678442680617-1706196415047-9.png)

可以直接启动项目，但因为目前什么也没有，所以启动后也什么都没有

![image-20240123182540278](SpringBoot01：Hello,World！.assets/image-20240123182540278-1706196415047-10.png)

### 2.3、pom.xml 分析

打开pom.xml，看看Spring Boot项目的依赖：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <!--父依赖-->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.9</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <!--项目的坐标-->
    <groupId>com.yang</groupId>
    <artifactId>helloWorld</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>helloWorld</name>
    <description>helloWorld</description>
    <properties>
        <java.version>8</java.version>
    </properties>
    <dependencies>
        <!-- web场景启动器 -->
        <!--web依赖：自动配置tomcat,dispatcherServlet，xml...-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <!--spring-boot-starter：所有的springboot依赖都是使用这个开头的-->
        <!-- springboot单元测试 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>

```

如上所示，主要有四个部分：

- 项目元数据：创建时候输入的Project Metadata部分，也就是Maven项目的基本元素，包括：groupId、artifactId、version、name、description等
- parent：继承`spring-boot-starter-parent`的依赖管理，控制版本与打包等内容
- dependencies：项目具体依赖，这里包含了`spring-boot-starter-web`用于实现HTTP接口（该依赖中包含了Spring MVC），官网对它的描述是：使用Spring MVC构建Web（包括RESTful）应用程序的入门者，使用Tomcat作为默认嵌入式容器。`spring-boot-starter-test`用于编写单元测试的依赖包。更多功能模块的使用将在后面逐步展开。
- build：构建配置部分。默认使用了`spring-boot-maven-plugin`，配合`spring-boot-starter-parent`就可以把Spring Boot应用打包成JAR来直接运行。

### 2.4、编写一个http接口

1、在主程序（Springboot01HelloWorldApplication）的同级目录下，新建一个controller包，一定要在**同级目录**下，否则识别不到

![image-20240123182747799](SpringBoot01：Hello,World！.assets/image-20240123182747799-1706196415048-11.png)

2、在包中新建一个HelloController类

```java
@RestController //为了让返回的结果是字符串所以是RestController
//或者可以用 requestmap + responsebody
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        //调用业务，接受前端参数
        return "Hello World";
    }
}
```

3、编写完毕后，从主程序启动项目，浏览器发起请求，看页面返回；控制台输出了 Tomcat 访问的端口号！

![image-20240123183444035](SpringBoot01：Hello,World！.assets/image-20240123183444035-1706196415048-12.png)

简单几步，就完成了一个web接口的开发，SpringBoot就是这么简单。我们没有配置dispatchServlet，也没有配置springboot的配置，

springboot的核心原理就是**自动装配**

所以我们常用它来建立我们的微服务项目！

**下面看一下都做了什么，**首先点开主程序的注解 `@SpringBootApplication`

可以看到里面有一个注解 `@SpringBootConfiguration`

![image-20240123183756617](SpringBoot01：Hello,World！.assets/image-20240123183756617-1706196415048-13.png)

继续点进去`@SpringBootConfiguration`,可以看到`@Configuration`

![image-20240123183858283](SpringBoot01：Hello,World！.assets/image-20240123183858283-1706196415048-14.png)

再点进去`@Configuration`，可以看到`@Component`，说明`@SpringBootConfiguration`这个类（程序的主启动入口）本来就是Spring的一个组件。

具体而言，`@Component` 注解通常用于标识那些不属于特定层（比如控制器、服务、存储库等）的普通Java类，使它们能够被Spring自动扫描并装配到应用程序的上下文中。

![image-20240123183943303](SpringBoot01：Hello,World！.assets/image-20240123183943303-1706196415048-15.png)

### 2.5、将项目打成jar包，点击 maven的 package

![1678448752381](SpringBoot01：Hello,World！.assets/1678448752381-1706196415049-16.png)

![1678448705717](SpringBoot01：Hello,World！.assets/1678448705717-1706196415049-17.png)

- 如果打包成功，则会在target目录下生成一个 jar 包

  ![1595397063721](SpringBoot01：Hello,World！.assets/1595397063721.png)

- 如果遇到以上②的错误，可以配置打包时跳过项目运行测试用例

  ```xml
  <!--
      在工作中,很多情况下我们打包是不想执行测试用例的
      可能是测试用例不完事,或是测试用例会影响数据库数据
      跳过测试用例执
  -->
  <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-surefire-plugin</artifactId>
      <configuration>
          <!--跳过项目运行测试用例-->
          <skipTests>true</skipTests>
      </configuration>
  </plugin>
  ```

- 打成了jar包后，就可以在任何地方运行了！OK

  ![1595397745294](SpringBoot01：Hello,World！.assets/1595397745294.png)

  浏览器运行结果（上图第⑤步）：

  ![1595396173505](SpringBoot01：Hello,World！.assets/1595396173505.png)



## **3、彩蛋**

1. 更改端口号

   > resource/application.properties

   ```properties
   # 更改项目的端口号
   server.port=8081
   ```

2. 如何更改启动时显示的字符拼成的字母，SpringBoot呢？也就是 banner 图案；

   只需一步：到项目下的 resources 目录下新建一个banner.txt 即可。

   图案可以到：https://www.bootschool.net/ascii 这个网站生成，然后拷贝到文件中即可！

   ```
   	![1595409428560](SpringBoot01：Hello,World！.assets/1595409428560.png)
   ```

**SpringBoot这么简单的东西背后一定有故事，我们之后去进行一波源码分析！**



# 二、运行原理初探

我们之前写的HelloSpringBoot，到底是怎么运行的呢

由于这是一个Maven项目，我们一般从pom.xml文件探究起；

## 1、父依赖

> **pom.xml**

- spring-boot-dependencies：核心依赖在父工程中！
- 我们在写或者引入一些Springboot依赖的时候，不需要指定版本，就因为有这些版本仓库

1、其中它主要是依赖**一个父项目**，主要是管理项目的资源过滤及插件！

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.7.9</version>
    <relativePath/> 
    <!-- lookup parent from repository -->
</parent>
```

2、点进去，发现`spring-boot-starter-parent`还有一个父依赖 `spring-boot-dependencies`

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.7.9</version>
</parent>
```

3、这里才是真正管理SpringBoot应用里面所有依赖版本的地方，SpringBoot的版本控制中心；帮我们配置好了需要的东西

**4、以后我们导入依赖默认是不需要写版本，就是因为有这些版本仓库；但是如果导入的包没有在依赖中管理着就需要手动配置版本了；**



## 2、启动器 spring-boot-starter

- 依赖

  ```xml
  <dependency>        								 
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter</artifactId>
  </dependency>
  ```

- **springboot-boot-starter-xxx**，说白了就是Springboot的启动场景

- 比如**spring-boot-starter-web**，他就会帮我们自动导入web的所有依赖

  ```xml
  <!--
  一开始创建项目的时候我们添加的spring-web依赖就是这个
  我们也可以在pom.xml中手动添加web启动器，不需要写版本号，因为直接继承父依赖-->
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
  </dependency>
  ```

- springboot会将所有的功能场景，都变成一个个的启动器

- 我们要使用什么功能，就只需要找到对应的启动器就好了`start`

## 3、主程序

### 3.1、默认的主启动类

```java
//@SpringBootApplication 来标注一个主程序类
//说明这是一个Spring Boot应用，删掉的话程序会报错
@SpringBootApplication
public class Springboot01HelloWorldApplication {
    //启动springboot应用，通过反射加载
    //以为是启动了一个方法，没想到启动了一个服务
    public static void main(String[] args) {
        SpringApplication.run(Springboot01HelloWorldApplication.class, args);
    }
}
```

但是**一个简单的启动类并不简单！**我们来分析一下这些注解都干了什么

### 3.2、注解（@SpringBootApplication）

- 作用：标注在某个类上说明这个类是**SpringBoot的主配置**

- SpringBoot就应该运行这个类的main方法来启动SpringBoot应用；

- 进入这个注解(ctrl+鼠标左键)：可以看到上面还有很多其他注解！

  ![1678510054262](SpringBoot01：Hello,World！.assets/1678510054262-1706196415050-18.png)

  ```java
  @SpringBootConfiguration
  @EnableAutoConfiguration
  @ComponentScan(
      excludeFilters = {@Filter(
      type = FilterType.CUSTOM,
      classes = {TypeExcludeFilter.class}
  ), @Filter(
      type = FilterType.CUSTOM,
      classes = {AutoConfigurationExcludeFilter.class}
  )}
  )
  public @interface SpringBootApplication {
      // ......
  }
  ```

#### @ComponentScan

- 这个注解在Spring中很重要 ,它对应XML配置中的元素。
- 作用：自动扫描并加载符合条件的组件或者bean ， 将这个bean定义加载到IOC容器中

#### @SpringBootConfiguration

- 作用：**SpringBoot的配置类**，标注在某个类上 ， 表示这是一个SpringBoot的配置类；

- 我们继续进去这个注解查看

  ```java
  @Configuration
  public @interface SpringBootConfiguration {}
  ```

  再点进去`@Configuration`会发现最后只剩下一个`@Component`

  @SpringBootApplication-->  @SpringBootConfiguration-->@Configuration-->@Component

- 这里的 **@Configuration**，说明这是一个==spring的配置类== ，配置类就是对应Spring的xml 配置文件；

- **@Component** 这就说明，启动类本身也是==Spring中的一个组件==而已，负责启动应用！

  > `@Component` 是Spring框架中的一个通用性注解，用于标识一个类为Spring容器中的一个组件（component）。组件是由Spring容器管理的对象，通过 `@Component` 注解，开发人员可以告诉Spring框

- 我们回到 SpringBootApplication 注解中继续看。

#### @EnableAutoConfiguration

- **开启自动配置功能**

  - 以前我们需要自己配置的东西，而现在SpringBoot可以自动帮我们配置 ；

  - @EnableAutoConfiguration告诉SpringBoot开启自动配置功能，这样自动配置才能生效；

  - 点进`@EnableAutoConfiguration`注解接续查看，有两个比较重要的注解

    ![1678512660090](SpringBoot01：Hello,World！.assets/1678512660090-1706196415050-19.png)

- **@AutoConfigurationPackage ：<font color=red>自动配置包</font>**

  ```java
  @Import({Registrar.class})
  	public @interface AutoConfigurationPackage {
  }
  ```

  - **@import** ：Spring底层注解@import ， 给容器中导入一个组件
  - **Registrar.class** 作用：<font color=red>自动配置包注册</font>，将主启动类的所在包及包下面所有子包里面的所有组件扫描到Spring容器 ；
  - 这个分析完了，退到上一步，继续看

- **@Import({AutoConfigurationImportSelector.class}) ：给容器导入组件 ；**

  - **AutoConfigurationImportSelector** ：==自动配置导入选择器==，那么它会导入哪些组件的选择器呢？我们点击去这个类看源码：

    ```java
    // 获取所有的配置
    List<String> configurations = this.getCandidateConfigurations(annotationMetadata, attributes);
    ```

  - 获得候选的配置

    > AutoConfigurationImportSelector.java

    - getAutoConfigurationEntry()方法获得自动配置的实体

    ![1678513172249](SpringBoot01：Hello,World！.assets/1678513172249-1706196415050-20.png)

    ![1678511341188](SpringBoot01：Hello,World！.assets/1678511341188-1706196415050-21.png)

    ```java
    protected List<String> getCandidateConfigurations(AnnotationMetadata metadata, AnnotationAttributes attributes) {
        // 和下面的getSpringFactoriesLoaderFactoryClass()方法对应
        //这里的getSpringFactoriesLoaderFactoryClass（）方法，返回的就是我们最开始看的启动自动导入配置文件的注解类；EnableAutoConfiguration
      List<String> configurations= SpringFactoriesLoader.loadFactoryNames(this.getSpringFactoriesLoaderFactoryClass(), this.getBeanClassLoader());
        
      
        //在这里第一次见到了spring.factories
        Assert.notEmpty(configurations, "No auto configuration classes found in META-INF/spring.factories. If you are using a custom packaging, make sure that file is correct.");
        return configurations;
    }
    
    //和上面的类的方法loadFactoryNames里面的第一个参数对应
    //这里的getSpringFactoriesLoaderFactoryClass（）方法返回的就是我们最开始看的启动自动导入配置文件的注解类；EnableAutoConfiguration
     protected Class<?> getSpringFactoriesLoaderFactoryClass() {
         return EnableAutoConfiguration.class;
     }
    ```

  - 这个方法`getCandidateConfigurations()`又调用了  `SpringFactoriesLoader` 类的静态方法！我们进入`SpringFactoriesLoader`类loadFactoryNames() 方法，<font color=red>获取所有的加载配置</font>

    ![1678514786345](SpringBoot01：Hello,World！.assets/1678514786345-1706196415051-22.png)

    ```java
    public static List<String> loadFactoryNames(Class<?> factoryClass, @Nullable ClassLoader classLoader) {
        String factoryClassName = factoryClass.getName();
        //这里它又调用了 loadSpringFactories 方法
        return (List)loadSpringFactories(classLoader).getOrDefault(factoryClassName, Collections.emptyList());
    }
    ```

  - 我们继续点击查看 loadSpringFactories 方法

    - 项目资源:`META-INF/spring.factories`

    - 系统资源:`META-INF/spring.factories`

    - 从这些资源中配置了所有的nextElement（自动配置），封装成properties

      ![1678514971144](SpringBoot01：Hello,World！.assets/1678514971144-1706196415051-23.png)

    ```java
    //将所有的资源加载到配置类中（将下面的抽离出来分析，第15行）
    Properties properties = PropertiesLoaderUtils.loadProperties(resource);
    ```

    ```java
    private static Map<String, List<String>> loadSpringFactories(@Nullable ClassLoader classLoader) {
        //获得classLoader ， 我们返回可以看到这里得到的就是EnableAutoConfiguration标注的类本身
        MultiValueMap<String, String> result = (MultiValueMap)cache.get(classLoader);
        if (result != null) {
            return result;
        } else {
            try {
                //去获取一个资源 "META-INF/spring.factories"
                Enumeration<URL> urls = classLoader != null ? classLoader.getResources("META-INF/spring.factories") : ClassLoader.getSystemResources("META-INF/spring.factories");
                LinkedMultiValueMap result = new LinkedMultiValueMap();
                //判断有没有更多的元素，将读取到的资源循环遍历，封装成为一个Properties
                while(urls.hasMoreElements()) {
                  URL url = (URL)urls.nextElement();
                    UrlResource resource = new UrlResource(url);
                    Properties properties = PropertiesLoaderUtils.loadProperties(resource);
                    Iterator var6 = properties.entrySet().iterator();
                    while(var6.hasNext()) {
                        Entry<?, ?> entry = (Entry)var6.next();
                        String factoryClassName = ((String)entry.getKey()).trim();
                        String[] var9 = StringUtils.commaDelimitedListToStringArray((String)entry.getValue());
                        int var10 = var9.length;
                        for(int var11 = 0; var11 < var10; ++var11) {
                            String factoryName = var9[var11];
                            result.add(factoryClassName, factoryName.trim());
                        }
                    }
                }
                cache.put(classLoader, result);
                return result;
            } catch (IOException var13) {
                throw new IllegalArgumentException("Unable to load factories from location [META-INF/spring.factories]", var13);
            }
        }
    }
    ```

  - 发现一个多次出现的文件：spring.factories，全局搜索它

### 3.3、spring.factories

我们根据源头打开spring.factories ， 看到了很多自动配置的文件；这就是自动配置根源所在！

![1595415587435](SpringBoot01：Hello,World！.assets/1595415587435.png)

**WebMvcAutoConfiguration**

我们在上面的自动配置类随便找一个打开看看，比如 ：`WebMvcAutoConfiguration`

![1595416894611](SpringBoot01：Hello,World！.assets/1595416894611.png)

可以看到这些一个个的都是JavaConfig配置类，而且都注入了一些Bean，可以找一些自己认识的类，看着熟悉一下！

所以，自动配置真正实现是从classpath中搜寻所有的`META-INF/spring.factories`配置文件 ，并将其中对应的 `org.springframework.boot.autoconfigure`. 包下的配置项，通过反射实例化为对应标注了` @Configuration的JavaConfig`形式的IOC容器配置类 ， 然后将这些都汇总成为一个实例并加载到IOC容器中。

## 4、结论：

1. SpringBoot在启动的时候从类路径下的`META-INF/spring.factories`中获取`EnableAutoConfiguration`指定的值
2. 将这些值作为自动配置类导入容器 ， 自动配置类就生效 ， 帮我们进行自动配置工作；
3. 以前我们需要手动配置的东西，现在springboot帮我们做了
4. 整个JavaEE，整体解决方案和自动配置的东西都在`springboot-autoconfigure.jar`中；
5. 它会把所有需要导入的组件，以类名的方式返回，这些组件就会被添加到容器中
6. 它会给容器中导入非常多的自动配置类 （xxxAutoConfiguration）, 就是给容器中导入这个场景需要的所有组件 ， 并自动配置，@Configuration（javaConfig） ；
7. 有了自动配置类 ， 免去了我们手动编写配置注入功能组件等的工作；

springboot的所有自动配置都在启动的时候扫描加载，所有的自动配置都在`META-INF/spring.factories`中，但是不一定所有的自动配置都会生效，要判断条件是否成立。只要导入了对应的start，就有了对应的启动器，自动配置的条件才成立。

**现在大家应该大概的了解了下，SpringBoot的运行原理，后面我们还会深化一次！**



## 5、启动

### 5.1、不简单的方法

我最初以为就是运行了一个main方法，没想到却开启了一个服务；

```java
@SpringBootApplication
public class Springboot01HellowordApplication {

    public static void main(String[] args) {
       	//该方法返回一个ConfigurableApplicationContext对象
 		//参数一：应用入口的类； 参数二：命令行参数  
        SpringApplication.run(Springboot01HellowordApplication.class, args);
    }

}
```

**SpringApplication.run分析**

- 分析该方法主要分两部分
- 一是SpringApplication的实例化，
- 二是run方法的执行；

### 5.2、SpringApplication

**这个类主要做了以下四件事情：**

1. 推断应用的类型是普通的java项目还是Web项目(有没有配置springMVC和tomcat)
2. 查找并加载所有可用初始化器 ， 设置到initializers属性中
3. 找出所有的应用程序监听器，设置到listeners属性中
4. **推断并设置main方法的定义类，找到运行的主类（最重要）**

**查看构造器**：

```java
public SpringApplication(ResourceLoader resourceLoader, Class... primarySources) {
    // ......
    this.webApplicationType = WebApplicationType.deduceFromClasspath();
    this.setInitializers(this.getSpringFactoriesInstances();
    this.setListeners(this.getSpringFactoriesInstances(ApplicationListener.class));
    this.mainApplicationClass = this.deduceMainApplicationClass();
}
```

### 5.3、run方法流程分析

![img](SpringBoot01：Hello,World！.assets/format,png.png)

跟着源码和这幅图就可以一探究竟了！

### 5.4、关于SpringBoot，谈谈关于你的理解;

- 自动装配
- run()
- 全面接管SpringMVC的配置



# 三、yaml配置（spring-02-configer

## 1、yaml语法学习

### 配置文件

SpringBoot使用一个全局的配置文件 ， 配置文件名称是固定的只能是`application`，但有两种方式去配置

>  1、application.properties

- 语法结构 ：key=value

  ```
  server.port=8081
  ```

>  2、application.yaml

- 语法结构 ：key：``空格`` value

  ![1678518981866](SpringBoot01：Hello,World！.assets/1678518981866-1706196415051-24.png)

  ![1678519041316](SpringBoot01：Hello,World！.assets/1678519041316-1706196415051-25.png)

`properties`只能保存键值对，但是`yaml`可以保存对象、数组等

**配置文件的作用 ：**修改SpringBoot自动配置的默认值，因为SpringBoot在底层都给我们自动配置好了；

比如我们可以在配置文件中修改Tomcat 默认启动的端口号！测试一下！

```yaml
server:
  port: 8081
```

### YAML

### yaml概述

- YAML是 "YAML Ain't a Markup Language" （YAML不是一种标记语言）的递归缩写。在开发的这种语言时，YAML 的意思其实是："Yet Another Markup Language"（仍是一种标记语言）

- 这种语言以**数据**作为中心，而不是以标记语言为重点！

- 以前的配置文件，大多数都是使用xml来配置；比如一个简单的端口配置，我们来对比下yaml和xml

  - 传统xml配置：

    ```xml
    <server>
        <port>8081<port>
    </server>
    ```

  - yaml配置：

    ```yaml
    server：
      prot: 8080
    ```

### yaml基础语法

说明：语法要求严格！

1. 空格不能省略
2. 以``缩进``来控制层级关系，只要是左边对齐的一列数据都是同一个层级的。
3. 属性和值的大小写都是十分敏感的。

**字面量：普通的值  [ 数字，布尔值，字符串  ]**

- 字面量直接写在后面就可以 ， 字符串默认不用加上双引号或者单引号；`k: v`

  注意：

  - <font color=red>“ ” 双引号</font>，不会转义字符串里面的特殊字符 ， 特殊字符会作为本身想表示的意思；

    比如 ：name: "kuang \n shen"   输出 ：kuang  换行   shen

  - <font color=red>'' 单引号</font>，会转义特殊字符 ， 特殊字符最终会变成和普通字符一样输出

    比如 ：name: ‘kuang \n shen’   输出 ：kuang  \n   shen

**对象、Map（键值对）**

```yaml
#对象、Map格式
k: 
    v1:
    v2:
```

在下一行来写对象的属性和值得关系，注意缩进；比如：

```yaml
# 相当于student.name = qinjiang  studnet.age = 3
student:
    name: qinjiang
    age: 3
```

行内写法

```yaml
student: {name: qinjiang,age: 3}
```

**数组（ List、set ）**

用 - 值表示数组中的一个元素,比如：

```yaml
pets:
 - cat
 - dog
 - pig
```

行内写法

```yaml
pets: [cat,dog,pig]
```

**修改SpringBoot的默认端口号**

配置文件中添加，端口号的参数，就可以切换端口；

```yaml
server:
  port: 8082
```

## 2、注入配置文件

- yaml文件更强大的地方在于，他可以给我们的实体类(对象、键值对、数组等)直接注入匹配值！

### yaml注入配置文件

1. 在springboot项目中的resources目录下新建一个文件 application.yaml

2. 在和主类Springboot02ConfigApplication的**同级目录**下新建一个package `pojo`，编写一个实体类 Dog；

   ```java
   @Component  //注册bean到容器中
   public class Dog {
       private String name;
       private Integer age;
       
       //有参无参构造、get、set方法、toString()方法  
   }
   ```
   
3. 思考，我们原来是如何给bean注入属性值的！@Value，给狗狗类测试一下：

   ```java
   @Component //注册bean
   public class Dog {
       @Value("阿黄")
       private String name;
       @Value("18")
       private Integer age;
   }
   ```

4. 在SpringBoot的测试类下注入狗狗输出一下；

   ```java
   @SpringBootTest
   class Springboot02ConfigApplicationTests {
   
       @Autowired
       //@Autowired 是Spring框架中用于进行自动装配（Autowired）的注解。
       //它可以用在构造方法、setter方法、字段或方法上，将相应的依赖对象自动注入到被标注的类中。
       private Dog dog;
   
       @Test
       void contextLoads() {
           System.out.println(dog);
       }
   
   }
   ```

   结果成功输出，@Value注入成功，这是我们原来的办法对吧。

   ![1595466913174](SpringBoot01：Hello,World！.assets/1595466913174.png)

   > 最开始的时候我们会直接new一个对象，后来可以通过`@Value`来注入，以后我们可以通过`yaml`来注入。

5. 我们在编写一个复杂一点的实体类：Person 类

   ```java
   @Component //注册bean到容器中
   public class Person {
       private String name;
       private Integer age;
       private Boolean happy;
       private Date birth;
       private Map<String,Object> maps;
       private List<Object> lists;
       private Dog dog;
       
       //有参无参构造、get、set方法、toString()方法  
   }
   ```

6. 我们来使用yaml配置的方式进行注入，大家写的时候注意区别和优势，我们编写一个yaml配置！

   ```yaml
   person:
     name: qinjiang
     age: 3
     happy: false
     birth: 2000/01/01
     maps: {k1: v1,k2: v2}
     lists:
      - code
      - girl
      - music
     dog:
       name: 旺财
       age: 1
   ```

7. 我们刚才已经把person这个对象的所有值都写好了，我们现在来注入到我们的类中！

   ```java
   /*
   @ConfigurationProperties作用：
   将配置文件中配置的每一个属性的值，映射到这个组件中；
   告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
   参数 prefix = “person” : 将配置文件中的person下面的所有属性一一对应
   */
   @Component
   @ConfigurationProperties(prefix = "person")
   public class Person {
       private String name;
       private Integer age;
       private Boolean happy;
       private Date birth;
       private Map<String,Object> maps;
       private List<Object> lists;
       private Dog dog;
   
       //有参无参构造、get、set方法、toString()方法
   }
   
   ```

8. IDEA 提示，springboot配置注解处理器没有找到，让我们看文档，我们可以查看文档，找到一个依赖！

   - 注解@ConfigurationProperties(prefix = "person")![1595464671197](SpringBoot01：Hello,World！.assets/1595464671197.png)

     点击 open Decumentation进入官网![1595465051557](SpringBoot01：Hello,World！.assets/1595465051557.png)

   - 在pom中导入依赖

     ~~~xml
     <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-configuration-processor</artifactId>
         <optional>true</optional>
     </dependency>
     ~~~
   
9. 确认以上配置都OK之后，我们去测试类中测试一下：

   ```java
   @SpringBootTest
   class Springboot02ConfigApplicationTests {
       @Autowired
       private Person person;
       @Test
       void contextLoads() {
           System.out.println(person);
       }
   }
   ```
   
   结果：所有值全部注入成功！

   ![1595467734622](SpringBoot01：Hello,World！.assets/1595467734622.png)

**yaml配置注入到实体类完全OK！**

### 加载指定的配置文件

- **@PropertySource ：**加载指定的配置文件；
- **@configurationProperties**：默认从全局配置文件中获取值；

1. 我们去在resources目录下新建一个**person.properties**文件

   ```properties
   name=kuangshen
   ```

2. 然后在我们的代码中指定加载person.properties文件

   ```java
   //指定配置文件
   @PropertySource(value = "classpath:person.properties")
   @Component //注册bean
   public class Person {
   
       //通过el表达式取出指定配置文件的值
       @Value("${name}")
       private String name;
   
       ......  
   }
   ```

3. 再次输出测试一下：指定配置文件绑定成功！

   ![1595467980925](SpringBoot01：Hello,World！.assets/1595467980925.png)

### 配置文件占位符

配置文件还可以编写占位符生成随机数

```yaml
person:
  name: qinjiang${random.uuid}
  age: ${random.int}
  happy: false
  birth: 2020/07/13
  maps: {k1: v1,k2: v2}
  lists:
    - code
    - music
    - girl
  dog:
    #如果person.hello有内容则是其内容，否则是hello
    name: ${person.hell:hello}_旺财
    age: 3
```



### 回顾properties配置

- 我们上面采用的yaml方法都是最简单的方式，开发中最常用的；
- 也是springboot所推荐的！
- 那我们来唠唠其他的实现方式，道理都是相同的；写还是那样写；配置文件除了yml还有我们之前常用的properties ， 我们没有讲，我们来唠唠！

<font color=red>【注意】</font>`properties`配置文件在写中文的时候，会有<font color=red>乱码 </font>， 我们需要去IDEA中设置编码格式为UTF-8；settings-->FileEncodings 中配置；

![1678521830328](SpringBoot01：Hello,World！.assets/1678521830328-1706196415051-26.png)

![1595468231075](SpringBoot01：Hello,World！.assets/1595468231075.png)

### 对比小结

@Value这个使用起来并不友好！我们需要为每个属性单独注解赋值，比较麻烦；我们来看个功能对比图

|                | @ConfigurationProperties | @Value     |
| -------------- | ------------------------ | ---------- |
| 功能           | 批量注入配置文件中的属性 | 一个个指定 |
| 松散绑定       | 支持                     | 不支持     |
| SpEL           | 不支持                   | 支持       |
| JSR303数据校验 | 支持                     | 不支持     |
| 复杂类型封装   | 支持                     | 不支持     |

1. `@ConfigurationProperties`只需要写一次即可 ， @Value则需要每个字段都添加

2. ==松散绑定==：这个什么意思呢? 比如我的yml中dog对象属性写的last-name，这个和lastName是一样的， 也就是说我的Dog类中属性命名为lastName也是可以的。- 后面跟着的字母默认是大写的。这就是松散绑定。可以测试一下。但是如果使用`@Value`的方式则必须一一对应。

3. JSR303数据校验 ， 这个就是我们可以在字段是增加一层过滤器验证 ， 可以保证数据的合法性

   ```java
   @Validated //数据校验，其中包含有很多格式
   public class Dog {
   
       //例如声明name属性必须是一个email格式
       //如果不是email格式会报错
       @Email()
       private String name;
       private Integer age;
   }
   ```

4. 复杂类型封装，yml中可以封装对象 ， 使用`@Value`就不支持

**结论：**

- 配置yml和配置properties都可以获取到值 ， **<font color=red>强烈推荐 yml</font>**；
- 如果我们在某个业务中，只需要获取配置文件中的某个值，可以使用一下 `@value`；
- 如果说，我们专门编写了一个**JavaBean来和配置文件进行一一映射**，就直接**@configurationProperties**，不要犹豫！比如我们写了一个javabean来配置mybatis的一些配置文件，是写死的东西，则直接使用cp计科



# 四、JSR303和多环境切换

## 1、JSR303数据校验

### 先看看如何使用

Springboot中可以用@validated来校验数据，如果数据异常则会统一抛出异常，方便异常中心统一处理。我们这里来写个注解让我们的name只能支持Email格式；

1、添加validation启动器

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

2、@Email添加

```java
@Component //注册bean
@ConfigurationProperties(prefix = "person")
@Validated  //数据校验
public class Person {
    @Email(message="邮箱格式错误") //name必须是邮箱格式
    private String name;
}
```

运行结果 ：default message [不是一个合法的电子邮件地址];

![1595480159290](SpringBoot01：Hello,World！.assets/1595480159290.png)

**使用数据校验，可以保证数据的正确性；** 

### 常见参数

```java
@NotNull(message="名字不能为空")
private String userName;
@Max(value=120,message="年龄最大不能查过120")
private int age;
@Email(message="邮箱格式错误")
private String email;

空检查
@Null       验证对象是否为null
@NotNull    验证对象是否不为null, 无法查检长度为0的字符串
@NotBlank   检查约束字符串是不是Null还有被Trim的长度是否大于0,只对字符串,且会去掉前后空格.
@NotEmpty   检查约束元素是否为NULL或者是EMPTY.
    
Booelan检查
@AssertTrue     验证 Boolean 对象是否为 true  
@AssertFalse    验证 Boolean 对象是否为 false  
    
长度检查
@Size(min=, max=) 验证对象（Array,Collection,Map,String）长度是否在给定的范围之内  
@Length(min=, max=) string is between min and max included.

日期检查
@Past       验证 Date 和 Calendar 对象是否在当前时间之前  
@Future     验证 Date 和 Calendar 对象是否在当前时间之后  
@Pattern    验证 String 对象是否符合正则表达式的规则

.......等等
除此以外，我们还可以自定义一些数据校验规则
```

![1595480813196](SpringBoot01：Hello,World！.assets/1595480813196.png)

## 2、多环境切换

profile是Spring对不同环境提供不同配置功能的支持，可以通过激活不同的环境版本，实现快速切换环境；（不同位置的优先级如下图）

### 多配置文件

我们在主配置文件编写的时候，文件名可以是 `application-{profile}.properties/yml `, 用来指定多个环境版本；

**例如：**

application-test.properties 代表测试环境配置

application-dev.properties 代表开发环境配置

但是Springboot并不会直接启动这些配置文件，它**默认使用application.properties主配置文件**；

![1595484043622](SpringBoot01：Hello,World！.assets/1595484043622-1706196415041-2.png)

我们需要通过一个配置来选择需要激活的环境：

```yaml
#比如在配置文件中指定使用dev环境，我们可以通过设置不同的端口号进行测试；
#我们启动SpringBoot，就可以看到已经切换到dev下的配置了；
spring.profiles.active=dev
```

### yaml的多文档块

和properties配置文件中一样，但是使用yml去实现不需要创建多个配置文件，更加方便了 !

```yaml
server:
  port: 8081
#选择要激活哪个环境块
spring:
  profiles:
    active: test

---
server:
  port: 8083
spring:
  profiles: dev #配置环境的名称


---

server:
  port: 8084
spring:
  profiles: test  #配置环境的名称
```

**注意：如果yml和properties同时都配置了端口，并且没有激活其他环境 ， 默认会使用properties配置文件的！**

### 配置文件加载位置

**外部加载配置文件的方式十分多，我们选择最常用的即可，在开发的资源文件中进行配置！**

官方外部配置文件说明参考文档[https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/spring-boot-features.html#boot-features-logging-color-coded-output](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/spring-boot-features.html#boot-features-logging-color-coded-output)

![1595484511936](SpringBoot01：Hello,World！.assets/1595484511936.png)

springboot 启动会扫描以下位置的application.properties或者application.yml文件作为Spring boot的默认配置文件：

![1595482583892](SpringBoot01：Hello,World！.assets/1595482583892.png)

```
优先级1：项目路径下的config文件夹配置文件
优先级2：项目路径下配置文件
优先级3：资源路径下的config文件夹配置文件
优先级4：资源路径下配置文件
```

优先级由高到底，高优先级的配置会覆盖低优先级的配置；

**SpringBoot会从这四个位置全部加载主配置文件；互补配置；**

我们在最低级的配置文件中设置一个项目访问路径的配置来测试互补问题；

```yaml
#配置项目的访问路径
server.servlet.context-path=/ss
```

### 拓展，运维小技巧

指定位置加载配置文件

我们还可以通过`spring.config.location`来改变默认的配置文件位置

项目打包好以后，我们可以使用命令行参数的形式，启动项目的时候来指定配置文件的新位置；

这种情况，一般是后期运维做的多，相同配置，外部指定的配置文件优先级最高

```yaml
java -jar spring-boot-config.jar --spring.config.location=F:/application.properties
```

# 五、自动配置原理

配置文件到底能写什么？怎么写？----联系----`spring.factories`

SpringBoot官方文档中有大量的配置，我们无法全部记住,官网：[https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/appendix-application-properties.html#core-properties](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/appendix-application-properties.html#core-properties)

![1595493746481](SpringBoot01：Hello,World！.assets/1595493746481.png)

## 1、分析自动配置原理

总体而言，Spring Boot自动装配的原理基于==条件化配置==和==类路径扫描==

1. SpringBoot启动的时候加载主配置类，开启了自动配置功能` @EnableAutoConfiguration`

2. @EnableAutoConfiguration 作用

   - 利用EnableAutoConfigurationImportSelector给容器中导入一些组件

   - 可以查看selectImports()方法的内容,他返回了一个autoConfigurationEnty,来自`this.getAutoConfigurationEntry(autoConfigurationMetadata,annotationMetadata);`这个方法我们继续来跟踪：

   - 这个方法有一个值：`List<String> configurations = getCandidateConfigurations(annotationMetadata, attributes);`叫做获取候选的配置 ，我们点击继续跟踪

     - `SpringFactoriesLoader.loadFactoryNames()`

     - 扫描所有jar包类路径下`META-INF/spring.factories`

       ![image-20240126005720255](SpringBoot01：Hello,World！.assets/image-20240126005720255.png) 

     - 把扫描到的这些文件的内容包装成properties对象

     - 从properties中获取到EnableAutoConfiguration.class类（类名）对应的值，然后把他们添加在容器中

   - 在类路径下,`META-INF/spring.factories`里面配置的所有EnableAutoConfiguration的值加入到容器中：

     ```java
     # Initializers
     org.springframework.context.ApplicationContextInitializer=\
     org.springframework.boot.autoconfigure.SharedMetadataReaderFactoryContextInitializer,\
     org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener
     
     # Application Listeners
     org.springframework.context.ApplicationListener=\
     org.springframework.boot.autoconfigure.BackgroundPreinitializer
     
     # Auto Configuration Import Listeners
     org.springframework.boot.autoconfigure.AutoConfigurationImportListener=\
     org.springframework.boot.autoconfigure.condition.ConditionEvaluationReportAutoConfigurationImportListener
     
     # Auto Configuration Import Filters
     org.springframework.boot.autoconfigure.AutoConfigurationImportFilter=\
     org.springframework.boot.autoconfigure.condition.OnBeanCondition,\
     org.springframework.boot.autoconfigure.condition.OnClassCondition,\
     org.springframework.boot.autoconfigure.condition.OnWebApplicationCondition
     
     # Auto Configure
     org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
     org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration,\
     org.springframework.boot.autoconfigure.aop.AopAutoConfiguration,\
     org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration,\
     org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration,\
     org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration,\
     org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration,\
     org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration,\
     org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration,\
     org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration,\
     org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration,\
     org.springframework.boot.autoconfigure.couchbase.CouchbaseAutoConfiguration,\
     org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveDataAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.couchbase.CouchbaseDataAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.couchbase.CouchbaseReactiveDataAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.couchbase.CouchbaseReactiveRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.couchbase.CouchbaseRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRestClientAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.ldap.LdapRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.mongo.MongoReactiveRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.neo4j.Neo4jRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.solr.SolrRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.r2dbc.R2dbcDataAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.r2dbc.R2dbcRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.r2dbc.R2dbcTransactionManagerAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.redis.RedisReactiveAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration,\
     org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration,\
     org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientAutoConfiguration,\
     org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration,\
     org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration,\
     org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration,\
     org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration,\
     org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration,\
     org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration,\
     org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration,\
     org.springframework.boot.autoconfigure.hazelcast.HazelcastJpaDependencyAutoConfiguration,\
     org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration,\
     org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration,\
     org.springframework.boot.autoconfigure.influx.InfluxDbAutoConfiguration,\
     org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration,\
     org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration,\
     org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration,\
     org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,\
     org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration,\
     org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration,\
     org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration,\
     org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration,\
     org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration,\
     org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration,\
     org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration,\
     org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration,\
     org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration,\
     org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration,\
     org.springframework.boot.autoconfigure.jooq.JooqAutoConfiguration,\
     org.springframework.boot.autoconfigure.jsonb.JsonbAutoConfiguration,\
     org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration,\
     org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration,\
     org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapAutoConfiguration,\
     org.springframework.boot.autoconfigure.ldap.LdapAutoConfiguration,\
     org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration,\
     org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration,\
     org.springframework.boot.autoconfigure.mail.MailSenderValidatorAutoConfiguration,\
     org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration,\
     org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration,\
     org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration,\
     org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration,\
     org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration,\
     org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration,\
     org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration,\
     org.springframework.boot.autoconfigure.rsocket.RSocketMessagingAutoConfiguration,\
     org.springframework.boot.autoconfigure.rsocket.RSocketRequesterAutoConfiguration,\
     org.springframework.boot.autoconfigure.rsocket.RSocketServerAutoConfiguration,\
     org.springframework.boot.autoconfigure.rsocket.RSocketStrategiesAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.rsocket.RSocketSecurityAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyAutoConfiguration,\
     org.springframework.boot.autoconfigure.sendgrid.SendGridAutoConfiguration,\
     org.springframework.boot.autoconfigure.session.SessionAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.oauth2.client.reactive.ReactiveOAuth2ClientAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration,\
     org.springframework.boot.autoconfigure.security.oauth2.resource.reactive.ReactiveOAuth2ResourceServerAutoConfiguration,\
     org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration,\
     org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration,\
     org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration,\
     org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration,\
     org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration,\
     org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration,\
     org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.reactive.error.ErrorWebFluxAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration,\
     org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration,\
     org.springframework.boot.autoconfigure.websocket.reactive.WebSocketReactiveAutoConfiguration,\
     org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration,\
     org.springframework.boot.autoconfigure.websocket.servlet.WebSocketMessagingAutoConfiguration,\
     org.springframework.boot.autoconfigure.webservices.WebServicesAutoConfiguration,\
     org.springframework.boot.autoconfigure.webservices.client.WebServiceTemplateAutoConfiguration
     
     # Failure analyzers
     org.springframework.boot.diagnostics.FailureAnalyzer=\
     org.springframework.boot.autoconfigure.diagnostics.analyzer.NoSuchBeanDefinitionFailureAnalyzer,\
     org.springframework.boot.autoconfigure.flyway.FlywayMigrationScriptMissingFailureAnalyzer,\
     org.springframework.boot.autoconfigure.jdbc.DataSourceBeanCreationFailureAnalyzer,\
     org.springframework.boot.autoconfigure.jdbc.HikariDriverConfigurationFailureAnalyzer,\
     org.springframework.boot.autoconfigure.r2dbc.ConnectionFactoryBeanCreationFailureAnalyzer,\
     org.springframework.boot.autoconfigure.session.NonUniqueSessionRepositoryFailureAnalyzer
     
     # Template availability providers
     org.springframework.boot.autoconfigure.template.TemplateAvailabilityProvider=\
     org.springframework.boot.autoconfigure.freemarker.FreeMarkerTemplateAvailabilityProvider,\
     org.springframework.boot.autoconfigure.mustache.MustacheTemplateAvailabilityProvider,\
     org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAvailabilityProvider,\
     org.springframework.boot.autoconfigure.thymeleaf.ThymeleafTemplateAvailabilityProvider,\
     org.springframework.boot.autoconfigure.web.servlet.JspTemplateAvailabilityProvider
     
     ```

     每一个这样的 xxxAutoConfiguration类都是容器中的一个**组件，都加入到容器中；用他们来做自动配置；**

3. 每一个自动配置类进行自动配置功能；

4. 我们以**HttpEncodingAutoConfiguration（Http编码自动配置）**为例解释自动配置原理；

   ```java
   //表示这是一个配置类，和以前编写的配置文件一样，也可以给容器中添加组件；
   @Configuration 
      
   //启动指定类的ConfigurationProperties功能；
     //进入这个HttpProperties查看，将配置文件中对应的值和HttpProperties绑定起来；
     //并把HttpProperties加入到ioc容器中
   @EnableConfigurationProperties({HttpProperties.class}) 
      
   //Spring底层@Conditional注解
     //根据不同的条件判断，如果满足指定的条件，整个配置类里面的配置就会生效；
     //这里的意思就是判断当前应用是否是web应用，如果是，当前配置类生效
   @ConditionalOnWebApplication(
       type = Type.SERVLET
   )
      
   //判断当前项目有没有这个类CharacterEncodingFilter；SpringMVC中进行乱码解决的过滤器；
   @ConditionalOnClass({CharacterEncodingFilter.class})
      
   //判断配置文件中是否存在某个配置：spring.http.encoding.enabled；
     //如果不存在，判断也是成立的
     //即使我们配置文件中不配置spring.http.encoding.enabled=true，也是默认生效的；
   @ConditionalOnProperty(
       prefix = "spring.http.encoding",
       value = {"enabled"},
       matchIfMissing = true
   )
      
   public class HttpEncodingAutoConfiguration {
       //他已经和SpringBoot的配置文件映射了
       private final Encoding properties;
       //只有一个有参构造器的情况下，参数的值就会从容器中拿
       public HttpEncodingAutoConfiguration(HttpProperties properties) {
           this.properties = properties.getEncoding();
       }
      
       //给容器中添加一个组件，这个组件的某些值需要从properties中获取
       @Bean
       @ConditionalOnMissingBean //判断容器没有这个组件？
       public CharacterEncodingFilter characterEncodingFilter() {
           CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
           filter.setEncoding(this.properties.getCharset().name());
           filter.setForceRequestEncoding(this.properties.shouldForce(org.springframework.boot.autoconfigure.http.HttpProperties.Encoding.Type.REQUEST));
           filter.setForceResponseEncoding(this.properties.shouldForce(org.springframework.boot.autoconfigure.http.HttpProperties.Encoding.Type.RESPONSE));
           return filter;
       }
       //。。。。。。。
   }
   ```

**一句话总结 ：根据当前不同的条件判断，决定这个配置类是否生效！**

- 一但这个配置类生效；这个配置类就会给容器中添加各种组件；

- 这些组件的属性是从对应的properties类中获取的，这些类里面的每一个属性又是和配置文件绑定的；

  例如我们在配置文件`application.yaml`中配置端口号

  ```yaml
  server:
    port: 8080
  ```

  可以看到会有一个`Serverproperties.java`文件，其中的每一个属性值都和配置文件中server.xxx一一对应

- 所有在配置文件中能配置的属性都是在xxxxProperties类中封装着；

- 配置文件能配置什么就可以参照某个功能对应的这个属性类

  ```java
  //从配置文件中获取指定的值和bean的属性进行绑定
  @ConfigurationProperties(prefix = "spring.http") 
  public class HttpProperties {
      // .....
  }
  ```

  > application.yml

  ![1678697033329](SpringBoot01：Hello,World！.assets/1678697033329-1706196415052-27.png)

  然后我们再去看与其对应的文件`ServerProperties.java`

  > Serverproperties.java

  ![1678697120869](SpringBoot01：Hello,World！.assets/1678697120869-1706196415052-28.png)

我们去配置文件里面试试前缀，看提示！

![1595493884773](SpringBoot01：Hello,World！.assets/1595493884773.png)

**这就是自动装配的原理！**



## 2、精髓

1. SpringBoot启动会加载大量的自动配置类

2. 我们看我们需要的功能有没有在SpringBoot默认写好的自动配置类当中；

3. 我们再来看这个自动配置类中到底配置了哪些组件；（只要我们要用的组件存在在其中，我们就不需要再手动配置了）

4. 给容器中自动配置类添加组件的时候，会从properties类中获取某些属性（也就是默认值）。我们只需要在配置文件中指定这些属性的值即可；

   **xxxxAutoConfigurartion：自动配置类；**给容器中添加组件

   **xxxxProperties:封装配置文件中相关属性；**通过`application.yaml`配置文文件可以修改

## 3、@Conditional

了解完自动装配的原理后，我们来关注一个细节问题，**自动配置类必须在一定的条件下才能生效；**

**@Conditional派生注解（<font color=red>Spring注解版原生的@Conditional作用</font>）**

作用：必须是@Conditional指定的条件成立，才给容器中添加组件，配置配里面的所有内容才生效；

| @Conditional扩展注解            | 作用(判断是否满足当前指定条件)                   |
| ------------------------------- | ------------------------------------------------ |
| @ConditionalOnJava              | 系统的java版本是否符合要求                       |
| @ConditionalOnJava              | 容器中存在指定Bean ;                             |
| @ConditionalOnMissingBean       | 容器中不存在指定Bean ;                           |
| @ConditionalOnExpression        | 满足SpEL表达式指定                               |
| @ConditionalOnClass             | 系统中有指定的类                                 |
| @ConditionalOnMissingClass      | 系统中没有指定的类                               |
| @ConditionalOnSingleCandidate   | 容器中只有一个指定的Bean ,或者这个Bean是首选Bean |
| @ConditionalOnProperty          | 系统中指定的属性是否有指定的值                   |
| @ConditionalOnResource          | 类路径下是否存在指定资源文件                     |
| @ConditionalOnWebApplication    | 当前是web环境                                    |
| @ConditionalOnNotWebApplication | 当前不是web环境                                  |
| @ConditionalOnJndi              | JNDI存在指定项                                   |

**那么多的自动配置类，必须在一定的条件下才能生效；也就是说，我们加载了这么多的配置类，但不是所有的都生效了。**

## 4、自动配置类是否生效

**我们可以在application.properties通过启用 `debug=true`属性；**

**在控制台打印自动配置报告，这样我们就可以很方便的知道哪些自动配置类生效；**

```yaml
# application.yaml  开启springboot的调试类
debug=true 
```

- **Positive matches:（自动配置类启用的：正匹配）**
- **Negative matches:（没有启动，没有匹配成功的自动配置类：负匹配）**
- **Unconditional classes: （没有条件的类）**
- **【演示：查看输出的日志】**

# 六、自定义Starter

我们分析完毕了源码以及自动装配的过程，我们可以尝试自定义一个启动器来玩玩！

### 说明

启动器模块是一个 空 jar 文件，仅提供辅助性依赖管理，这些依赖可能用于自动装配或者其他类库；

**命名归约：**

官方命名：

- 前缀：spring-boot-starter-xxx
- 比如：spring-boot-starter-web....

自定义命名：

- xxx-spring-boot-starter
- 比如：mybatis-spring-boot-starter

### 编写启动器

1. 在IDEA中新建一个空项目 spring-boot-starter-diy

2. 新建一个普通Maven模块：kuang-spring-boot-starter

4. 新建一个Springboot模块：kuang-spring-boot-starter-autoconfigure

6. 点击apply即可，基本结构

8. 在我们的 starter 中 导入  autoconfigure 的依赖！

   ```xml
   <!-- 启动器 -->
   <dependencies>
       <!--  引入自动配置模块 -->
       <dependency>
           <groupId>com.kuang</groupId>
           <artifactId>kuang-spring-boot-starter-autoconfigure</artifactId>
           <version>0.0.1-SNAPSHOT</version>
       </dependency>
   </dependencies>
   ```

6. 将 autoconfigure 项目下多余的文件都删掉，Pom中只留下一个 starter，这是所有的启动器基本配置！

11. 我们编写一个自己的服务

    ```java
    package nuc.ss;
    
    public class HelloService {
    
        HelloProperties helloProperties;
    
        public HelloProperties getHelloProperties() {
            return helloProperties;
        }
    
        public void setHelloProperties(HelloProperties helloProperties) {
            this.helloProperties = helloProperties;
        }
    
        public String sayHello(String name){
            return helloProperties.getPrefix() + name + helloProperties.getSuffix();
        }
    
    }
    ```

12. 编写`HelloProperties` 配置类

    ```java
    package nuc.ss;
    
    import org.springframework.boot.context.properties.ConfigurationProperties;
    
    // 前缀 kuang.hello
    @ConfigurationProperties(prefix = "kuang.hello")
    public class HelloProperties {
    
        private String prefix;
        private String suffix;
    
        public String getPrefix() {
            return prefix;
        }
    
        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }
    
        public String getSuffix() {
            return suffix;
        }
    
        public void setSuffix(String suffix) {
            this.suffix = suffix;
        }
    }
    ```

13. 编写我们的自动配置类并注入bean，测试！

    ```java
    package nuc.ss;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
    import org.springframework.boot.context.properties.EnableConfigurationProperties;
    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    
    @Configuration
    @ConditionalOnWebApplication //web应用生效
    @EnableConfigurationProperties(HelloProperties.class)
    public class HelloServiceAutoConfiguration {
    
        @Autowired
        HelloProperties helloProperties;
    
        @Bean
        public HelloService helloService(){
            HelloService service = new HelloService();
            service.setHelloProperties(helloProperties);
            return service;
        }
    
    }
    ```

14. 在resources编写一个自己的 `META-INF\spring.factories`

    ```factories
    # Auto Configure
    org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
    nuc.ss.HelloServiceAutoConfiguration
    ```

11. 编写完成后，可以安装到maven仓库中！



### 新建项目测试自定义启动器

1. 新建一个SpringBoot 项目

2. 导入我们自己写的启动器

   ```xml
   <dependency>
       <groupId>nuc.ss</groupId>
       <artifactId>ss-spring-boot-starter</artifactId>
       <version>1.0-SNAPSHOT</version>
   </dependency>
   ```

3. 编写一个 `HelloController`  进行测试我们自己的写的接口！

   ```java
   package nuc.ss.controller;
   
   @RestController
   public class HelloController {
   
       @Autowired
       HelloService helloService;
   
       @RequestMapping("/hello")
       public String hello(){
           return helloService.sayHello("zxc");
       }
   
   }
   ```

4. 编写配置文件 `application.properties`

   ```prop
   ss.hello.prefix="ppp"
   ss.hello.suffix="sss"
   ```

5. 启动项目进行测试，结果成功 !

**学完的东西一定要多下去实践！**



# 七、web开发 springboot-03-web

## 1、Web开发探究

其实SpringBoot的东西用起来非常简单，因为SpringBoot最大的特点就是**自动装配**。

> 自动装配是Spring Boot框架的一个重要特点，它指的是Spring容器在启动时，根据类路径、依赖关系和配置等信息，自动地配置和组装应用程序的组件，无需手动进行繁琐的配置。

**使用SpringBoot的步骤：**

1、创建一个SpringBoot应用，选择我们需要的模块，SpringBoot就会默认将我们的需要的模块自动配置好

2、手动在配置文件中配置部分配置项目就可以运行起来了

3、专注编写业务代码，不需要考虑以前那样 一大堆的配置了。

要熟悉掌握开发，之前学习的自动配置的原理一定要搞明白！

比如SpringBoot到底帮我们配置了什么？我们能不能修改？我们能修改哪些配置？我们能不能扩展？

- 向容器中自动配置组件 ：xxx.Autoconfiguration
- 自动配置类，封装配置文件的内 xxx.Properties

没事就找找类，看看自动装配原理！

**分以下几步解决web开发问题**

1. 静态资源处理：html、css等东西
2. 首页：index首页
3. 之前的web我们用jsp写，现在我们要学习模板引擎，thymeleaf
4. 装配扩展springmvc
5. 增删改查

接下来一步一步解决

## 2、静态资源处理

### 静态资源映射规则

**首先，我们搭建一个普通的SpringBoot项目**，然后写一个`controller`验证一下项目是可以启动的。

在springboot-03-web项目下的com.yang.controller包中新建一个`HelloController.java`

```java
@RestController //保证不会跳到视图层，只返回字符串
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello world";
    }
}
```

启动项目，在地址栏输入`http://localhost:8080/hello`，界面显示`Hello world!`

![image-20240126011515798](SpringBoot01：Hello,World！.assets/image-20240126011515798.png) 

写请求非常简单，那我们要引入我们前端资源，我们项目中有许多的静态资源，比如css，js等文件，这个SpringBoot怎么处理呢？

如果我们是一个web应用，我们的main下会有一个webapp，我们以前都是将所有的页面导在这里面的，对吧！但是我们现在的pom呢，打包方式是为jar的方式，那么这种方式SpringBoot能不能来给我们写页面呢？当然是可以的，但是SpringBoot对于静态资源放置的位置，是有规定的！

**我们先来聊聊这个静态资源映射规则：**

- SpringBoot中，SpringMVC的web配置都在 `WebMvcAutoConfiguration.java` 这个配置类里面；

  - 我们可以双击`shift`来查找这个配置类

- 我们可以去看看 `WebMvcAutoConfigurationAdapter `中有很多配置方法；

- 有一个方法：`addResourceHandlers` 添加资源处理

  在`addResourceHandlers`方法中开头要判断我们是否自己配置了资源管理，如何配置自己的？ 到WebMvcProperties配置文件中查看会有一个`private String staticPathPattern = "/**";`，我们可以根据这个`staticPathPattern`在`application.yaml`中自定义资源管理的路径。
  
  ```java
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
      if (!this.resourceProperties.isAddMappings()) {
          // 如果我们自已配置的有资源处理的话，则禁用默认资源处理，如何配置自己的？ 到WebMvcProperties配置文件中配置
          logger.debug("Default resource handling disabled");
          return;
      }
      // 缓存控制
      Duration cachePeriod = this.resourceProperties.getCache().getPeriod();
      CacheControl cacheControl = this.resourceProperties.getCache().getCachecontrol().toHttpCacheControl();
      // webjars 配置
      if (!registry.hasMappingForPattern("/webjars/**")) {
          customizeResourceHandlerRegistration(registry.addResourceHandler("/webjars/**")
                                               .addResourceLocations("classpath:/META-INF/resources/webjars/")
                                               .setCachePeriod(getSeconds(cachePeriod)).setCacheControl(cacheControl));
      }
      // 静态资源配置
      String staticPathPattern = this.mvcProperties.getStaticPathPattern();
      if (!registry.hasMappingForPattern(staticPathPattern)) {
          customizeResourceHandlerRegistration(registry.addResourceHandler(staticPathPattern)
                                               .addResourceLocations(getResourceLocations(this.resourceProperties.getStaticLocations()))
                                               .setCachePeriod(getSeconds(cachePeriod)).setCacheControl(cacheControl));
      }
  }
  ```
  
  读一下源代码：比如所有的` /webjars/**` ， 都需要去 `classpath:/META-INF/resources/webjars/` 找对应的资源；

### 什么是webjars 呢？

Webjars本质就是以jar包的方式引入我们的静态资源 ， 我们以前要导入一个静态资源文件，直接以`maven`的形式导入即可。可以在webjars官网查看。

#### 第一种静态资源映射规则

使用SpringBoot需要使用Webjars，我们可以去搜索一下：

网站：[https://www.webjars.org](https://www.webjars.org) 

要使用jQuery，我们只要要引入jQuery对应版本的pom依赖即可！

```xml
<dependency>
    <groupId>org.webjars</groupId>
    <artifactId>jquery</artifactId>
    <version>3.4.1</version>
</dependency>
```

导入完毕，查看webjars目录结构，并访问Jquery.js文件！

![1595506633980](SpringBoot01：Hello,World！.assets/1595506633980.png)

访问：只要是静态资源，SpringBoot就会去对应的路径寻找资源，我们这里访问：http://localhost:8080/webjars/jquery/3.4.1/jquery.js

![1595506019658](SpringBoot01：Hello,World！.assets/1595506019658.png)

#### 第二种静态资源映射规则

1、那我们项目中要是使用自己的静态资源该怎么导入呢？我们看下一行代码；

![1595516976999](SpringBoot01：Hello,World！.assets/1595516976999.png)

2、我们去找`staticPathPattern`发现第二种映射规则 ：/** , 访问当前的项目任意资源，它会去找 `resourceProperties` 这个类，我们可以点进去看一下分析：

```java
// 进入方法
public String[] getStaticLocations() {
    return this.staticLocations;
}
// 找到对应的值
private String[] staticLocations = CLASSPATH_RESOURCE_LOCATIONS;
// 找到路径
private static final String[] CLASSPATH_RESOURCE_LOCATIONS = { 
    "classpath:/META-INF/resources/",
  	"classpath:/resources/", 
    "classpath:/static/", 
    "classpath:/public/" 
};
```

3、ResourceProperties 可以设置和我们静态资源有关的参数；这里面指向了它会去寻找资源的文件夹，即上面数组的内容。

==这里的`classpath`指的是`src/main/resources`==

4、所以得出结论，以下四个目录存放的静态资源可以被我们识别：

```java
"classpath:/META-INF/resources/"
"classpath:/resources/"
"classpath:/static/"
"classpath:/public/"
```

5、我们可以在resources根目录下新建对应的文件夹，都可以存放我们的静态文件；优先级的排序是按照`CLASSPATH_RESOURCE_LOCATION`数组中的顺序来的

![1595517831392](SpringBoot01：Hello,World！.assets/1595517831392.png)

6、比如我们访问 http://localhost:8080/1.js , 他就会去这些文件夹中寻找对应的静态资源文件；

![1595517869049](SpringBoot01：Hello,World！.assets/1595517869049.png)

#### 自定义静态资源路径

我们也可以自己通过配置文件来指定一下，哪些文件夹是需要我们放静态资源文件的，在application.properties中配置；

```properties
spring.resources.static-locations=classpath:/coding/,classpath:/ss/
```

![1595518276475](SpringBoot01：Hello,World！.assets/1595518276475.png)

#### 总结

1. 在springboot，我们可以使用以下方式处理静态资源
   - webjars，映射到 `localhost:8080/webjars/`
   - public，static，/**，resources ，这些直接映射到 `localhost:8080/`
2. 优先级：resources > static（默认） > public

## 3、首页处理

静态资源文件夹说完后，我们继续向下看源码！可以看到一个欢迎页的映射，就是我们的首页！

> WebMvcAutoConfiguration.java

```java
@Bean
public WelcomePageHandlerMapping welcomePageHandlerMapping(ApplicationContext applicationContext,
                                                           FormattingConversionService mvcConversionService, ResourceUrlProvider mvcResourceUrlProvider) {
    WelcomePageHandlerMapping welcomePageHandlerMapping = new WelcomePageHandlerMapping(
        new TemplateAvailabilityProviders(applicationContext), applicationContext, getWelcomePage(),
        this.mvcProperties.getStaticPathPattern());
    welcomePageHandlerMapping.setInterceptors(getInterceptors(mvcConversionService, mvcResourceUrlProvider));
    welcomePageHandlerMapping.setCorsConfigurations(getCorsConfigurations());
    return welcomePageHandlerMapping;
}
```

点进去`getWelcomPage()方法`继续看

```java
private Optional<Resource> getWelcomePage() {
    String[] locations = getResourceLocations(this.resourceProperties.getStaticLocations());
    // ::是java8 中新引入的运算符
    // Class::function的时候function是属于Class的，应该是静态方法。
    // this::function的funtion是属于这个对象的。
    // 简而言之，就是一种语法糖而已，是一种简写
    return Arrays.stream(locations).map(this::getIndexHtml).filter(this::isReadable).findFirst();
}
// 欢迎页就是一个location下的的 index.html 而已
private Resource getIndexHtml(String location) {
    return this.resourceLoader.getResource(location + "index.html");
}
```

截图说明

![1595550098734](SpringBoot01：Hello,World！.assets/1595550098734.png)

- 欢迎页，静态资源文件夹下的所有 index.html 页面；被 /** 映射。意思就是必须在`src/main/resources`的子目录中，如`public、static、resources`，但是不能直接将`index.html`放置在`src/main/resources`目录下。这就是`/**`的含义。

- 比如我访问  http://localhost:8080/ ，就会找静态资源文件夹下的 index.html

- 新建一个 index.html ，在我们上面的3个目录中任意一个；然后访问测试  http://localhost:8080/  看结果！

  ![1595550394178](SpringBoot01：Hello,World！.assets/1595550394178.png)

1、**<font color=red>关于网站图标说明</font>**：

**欢迎页面(Welcome Page)**

> Spring Boot supports both static and templated welcome pages. It first looks for an `index.html` file in the configured static content locations. If one is not found, it then looks for an `index template`. If either is found, it is automatically used as the welcome page of the application.

**自定义应用图标（Custom Facicon）**

> Spring Boot looks for a `favicon.ico` in the configured static content locations and the root of the classpath (in that order). If such a file is present, it is automatically used as the favicon of the application.

2、<font color=red>首页图标</font>

**2.2.x之前的版本（<font color=red>如2.1.7</font>）springboot是这样**

与其他静态资源一样，Spring Boot在配置的静态内容位置中查找 favicon.ico。如果存在这样的文件，它将自动用作应用程序的favicon。

1. 关闭SpringBoot默认图标

   > application.yml

   ```properties
   #关闭默认图标
   spring.mvc.favicon.enabled=false
   ```

2. 自己放一个图标在静态资源目录下，我放在 public 目录下

   ![1595554357772](SpringBoot01：Hello,World！.assets/1595554357772.png)

3. 清除浏览器缓存`Ctrl + F5`！刷新网页，发现图标已经变成自己的了！

**2.2.x之后的版本（<font color=red>如2.3.0</font>）直接执行2和3就可以了**

![1595554118099](../../ssm)

# 八、Thymeleaf模板引擎

## 1、模板引擎

- 前端交给我们的页面，是html页面。如果是我们以前开发，我们需要把他们转成jsp页面，jsp好处就是当我们查出一些数据转发到JSP页面以后，我们可以用jsp轻松实现数据的显示，及交互等。
- jsp支持非常强大的功能，包括能写Java代码，但是呢，我们现在的这种情况，SpringBoot这个项目首先是以jar的方式，不是war，像第二，我们用的还是嵌入式的Tomcat，所以呢，**他现在默认是不支持jsp的**。
- 那不支持jsp，如果我们直接用纯静态页面的方式，那给我们开发会带来非常大的麻烦，那怎么办呢？

**SpringBoot推荐你可以来使用模板引擎：**

模板引擎，我们其实大家听到很多，其实jsp就是一个模板引擎，还有用的比较多的freemarker，包括SpringBoot给我们推荐的Thymeleaf，模板引擎有非常多，但再多的模板引擎，他们的思想都是一样的，什么样一个思想呢我们来看一下这张图：

![1595555521951](SpringBoot01：Hello,World！.assets/1595555521951.png)

模板引擎的作用就是我们来写一个页面模板，比如有些值呢，是动态的，我们写一些表达式。而这些值，从哪来呢，就是我们在后台封装一些数据。然后把这个模板和这个数据交给我们模板引擎，模板引擎按照我们这个数据帮你把这表达式解析、填充到我们指定的位置，然后把这个数据最终生成一个我们想要的内容给我们写出去，这就是我们这个模板引擎，不管是jsp还是其他模板引擎，都是这个思想。只不过呢，就是说不同模板引擎之间，他们可能这个语法有点不一样。其他的我就不介绍了，我主要来介绍一下SpringBoot给我们推荐的Thymeleaf模板引擎，这模板引擎呢，是一个高级语言的模板引擎，他的这个语法更简单。而且呢，功能更强大。

我们呢，就来看一下这个模板引擎，那既然要看这个模板引擎。首先，我们来看SpringBoot里边怎么用。

## 2、Thymeleaf

### 引入Thymeleaf

怎么引入呢，对于springboot来说，什么事情不都是一个start的事情嘛，我们去在项目中引入一下。给大家三个网址：

- Thymeleaf 官网：[https://www.thymeleaf.org/](https://www.thymeleaf.org/)
- Thymeleaf 在Github 的主页：[https://github.com/thymeleaf/thymeleaf](https://github.com/thymeleaf/thymeleaf)
- Spring官方文档：找到我们对应的版本[https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#using-boot-starter ](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#using-boot-starter )

找到对应的pom依赖：可以适当点进源码看下本来的包！

```xml
<!--thymeleaf-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

Maven会自动下载jar包，我们可以去看下下载的东西；

> 如果爆红了可以在maven中刷新一下依赖![image-20240129115311280](SpringBoot01：Hello,World！.assets/image-20240129115311280.png)



### Thymeleaf分析

前面呢，我们已经引入了Thymeleaf，那这个要怎么使用呢？

我们首先得按照SpringBoot的自动配置原理看一下我们这个Thymeleaf的自动配置规则，在按照那个规则，我们进行使用。

我们去找一下Thymeleaf的自动配置类：`ThymeleafProperties.java`

```java
@ConfigurationProperties(
    prefix = "spring.thymeleaf"
)
public class ThymeleafProperties {
    private static final Charset DEFAULT_ENCODING;
    //默认前缀
    public static final String DEFAULT_PREFIX = "classpath:/templates/";
    //默认后缀
    public static final String DEFAULT_SUFFIX = ".html";
    private boolean checkTemplate = true;
    private boolean checkTemplateLocation = true;
    private String prefix = "classpath:/templates/";
    private String suffix = ".html";
    private String mode = "HTML";
    private Charset encoding;
}
```

我们可以在其中看到默认的前缀和后缀！

只需要把我们的html页面放在类路径的templates目录下，thymeleaf就可以帮我们自动渲染了。

使用thymeleaf什么都不需要配置，只需要将他放在指定的文件夹下即可！

**<font color=red>测试</font>**

1. 在com.yang.controller目录下编写一个TestController.java

   ```java
   @Controller
   public class TestController {
       
       @RequestMapping("/test")
       public String test(){
           //return 一个"test"后会自动加上前缀和后缀
           //classpath:/templates/test.html
           return "test";
       }
       
   }
   ```

2. 编写一个测试页面  test.html 放在 templates 目录下

   ```html
   <!DOCTYPE html>
   <html lang="en">
   <head>
       <meta charset="UTF-8">
       <title>Title</title>
   </head>
   <body>
   <h1>Test页面</h1>
   </body>
   </html>
   ```

3. 启动项目请求测试

![image-20240129120429185](SpringBoot01：Hello,World！.assets/image-20240129120429185.png) 

### Thymeleaf 语法学习

要学习语法，还是参考官网文档最为准确，我们找到对应的版本看一下；

Thymeleaf 官网：[https://www.thymeleaf.org/](https://www.thymeleaf.org/ ) ， 简单看一下官网！我们去下载Thymeleaf的官方文档！在线文档：[https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)

#### Thymeleaf入门

**我们做个最简单的练习 ：我们需要查出一些数据，在页面中展示**

1. 修改测试请求，增加数据传输；

   ```java
   @RequestMapping("/test2")
   public String test2(Model model){
       //return 一个"test"后会自动加上前缀和后缀
       //classpath:/templates/test.html
       model.addAttribute("msg","hello,springboot");
       return "test";
   }
   ```

2. 我们要使用thymeleaf，需要在html文件中导入命名空间的约束，方便提示。

   我们可以去官方文档的#3中看一下命名空间拿来过来：

   ```
    xmlns:th="http://www.thymeleaf.org"
   ```

3. 我们去编写下前端页面

   ```html
   <!DOCTYPE html>
   <!--命名空间-->
   <html lang="en" xmlns:th="http://www.thymeleaf.org">
   <head>
       <meta charset="UTF-8">
       <title>狂神说</title>
   </head>
   <body>
   <h1>测试页面</h1>
   
   <!--th:text就是将div中的内容设置为它指定的值，和之前学习的Vue一样-->
   <div th:text="${msg}"></div>
   </body>
   </html>
   ```

4. 启动测试！

   ![image-20240129121101839](SpringBoot01：Hello,World！.assets/image-20240129121101839.png)

   

**OK，入门搞定，我们来认真研习一下Thymeleaf的使用语法！**

#### Thymeleaf语法

**1、我们可以使用任意的 th:attr 来替换Html中原生属性的值！**

**2、我们能写哪些表达式呢？**

```shell
Simple expressions:（表达式语法）
Variable Expressions: ${...}：获取变量值；OGNL；
    1）、获取对象的属性、调用方法
    2）、使用内置的基本对象：#18
         #ctx : the context object.
         #vars: the context variables.
         #locale : the context locale.
         #request : (only in Web Contexts) the HttpServletRequest object.
         #response : (only in Web Contexts) the HttpServletResponse object.
         #session : (only in Web Contexts) the HttpSession object.
         #servletContext : (only in Web Contexts) the ServletContext object.

    3）、内置的一些工具对象：
　　　　　　#execInfo : information about the template being processed.
　　　　　　#uris : methods for escaping parts of URLs/URIs
　　　　　　#conversions : methods for executing the configured conversion service (if any).
　　　　　　#dates : methods for java.util.Date objects: formatting, component extraction, etc.
　　　　　　#calendars : analogous to #dates , but for java.util.Calendar objects.
　　　　　　#numbers : methods for formatting numeric objects.
　　　　　　#strings : methods for String objects: contains, startsWith, prepending/appending, etc.
　　　　　　#objects : methods for objects in general.
　　　　　　#bools : methods for boolean evaluation.
　　　　　　#arrays : methods for arrays.
　　　　　　#lists : methods for lists.
　　　　　　#sets : methods for sets.
　　　　　　#maps : methods for maps.
　　　　　　#aggregates : methods for creating aggregates on arrays or collections.
==================================================================================

  Selection Variable Expressions: *{...}：选择表达式：和${}在功能上是一样；
  Message Expressions: #{...}：获取国际化内容
  Link URL Expressions: @{...}：定义URL；
  Fragment Expressions: ~{...}：片段引用表达式

Literals（字面量）
      Text literals: 'one text' , 'Another one!' ,…
      Number literals: 0 , 34 , 3.0 , 12.3 ,…
      Boolean literals: true , false
      Null literal: null
      Literal tokens: one , sometext , main ,…
      
Text operations:（文本操作）
    String concatenation: +
    Literal substitutions: |The name is ${name}|
    
Arithmetic operations:（数学运算）
    Binary operators: + , - , * , / , %
    Minus sign (unary operator): -
    
Boolean operations:（布尔运算）
    Binary operators: and , or
    Boolean negation (unary operator): ! , not
    
Comparisons and equality:（比较运算）
    Comparators: > , < , >= , <= ( gt , lt , ge , le )
    Equality operators: == , != ( eq , ne )
    
Conditional operators:条件运算（三元运算符）
    If-then: (if) ? (then)
    If-then-else: (if) ? (then) : (else)
    Default: (value) ?: (defaultvalue)
    
Special tokens:
    No-Operation: _
```

**练习测试：**

1、 我们编写一个Controller，放一些数据

```java
@RequestMapping("/test2")
public String test2(Map<String,Object> map){
    //存入数据
    map.put("msg","<h1>Hello</h1>");
    map.put("users", Arrays.asList("qinjiang","kuangshen"));
    //classpath:/templates/test.html
    return "test";
}
```

2、测试页面取出数据

```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>
    <h1>Test页面</h1>
    <!--不转义-->
    <div th:text="${msg}"></div>
    <!--转义-->
    <div th:utext="${msg}"></div>

    <hr>
	<!--遍历数据-->
	<!--th:each每次遍历都会生成当前这个标签：官网#9-->
    <h3 th:each="user:${users}" th:text="${user}"></h3>
    <hr>
     <!--行内写法：官网#12-->
    <h3 th:each="user:${users}">[[ ${user} ]]</h3>
</div>
</body>
</html>
```

3、启动项目测试！

![1595560097876](SpringBoot01：Hello,World！.assets/1595560097876.png)

**我们看完语法，很多样式，我们即使现在学习了，也会忘记，所以我们在学习过程中，需要使用什么，根据官方文档来查询，才是最重要的，要熟练使用官方文档！**





# 九、MVC自动配置原理

## 1、官网阅读

在进行项目编写前，我们还需要知道一个东西，就是SpringBoot对我们的SpringMVC还做了哪些配置，包括如何扩展，如何定制。

只有把这些都搞清楚了，我们在之后使用才会更加得心应手。途径一：源码分析，途径二：官方文档！

地址 ：https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/#web.servlet.spring-mvc.auto-configuration

```java
Spring MVC Auto-configuration
// Spring Boot为Spring MVC提供了自动配置，它可以很好地与大多数应用程序一起工作。
Spring Boot provides auto-configuration for Spring MVC that works well with most applications.
// 自动配置在Spring默认设置的基础上添加了以下功能：
The auto-configuration adds the following features on top of Spring’s defaults:
// 包含视图解析器
Inclusion of ContentNegotiatingViewResolver and BeanNameViewResolver beans.
// 支持静态资源文件夹的路径，以及webjars
Support for serving static resources, including support for WebJars 
// 自动注册了Converter：
// 转换器，这就是我们网页提交数据到后台自动封装成为对象的东西，比如把"1"字符串自动转换为int类型。后台需要的是一个User对象，我们只需要传入User的各个属性值，例如id和name，会自动封装为User对象
// Formatter：【格式化器，比如页面给我们了一个2019-8-10，它会给我们自动格式化为Date对象】
Automatic registration of Converter, GenericConverter, and Formatter beans.
// HttpMessageConverters
// SpringMVC用来转换Http请求和响应的的，比如我们要把一个User对象转换为JSON字符串，可以去看官网文档解释；
Support for HttpMessageConverters (covered later in this document).
// 定义错误代码生成规则的
Automatic registration of MessageCodesResolver (covered later in this document).
// 首页定制
Static index.html support.
// 图标定制
Custom Favicon support (covered later in this document).
// 初始化数据绑定器：帮我们把请求数据绑定到JavaBean中！
Automatic use of a ConfigurableWebBindingInitializer bean (covered later in this document).

/*
如果您希望保留Spring Boot MVC功能，并且希望添加其他MVC配置（拦截器、格式化程序、视图控制器和其他功能），则可以添加自己
的@configuration类，类型为webmvcconfiguer，但不添加@EnableWebMvc。如果希望提供
RequestMappingHandlerMapping、RequestMappingHandlerAdapter或ExceptionHandlerExceptionResolver的自定义
实例，则可以声明WebMVCregistrationAdapter实例来提供此类组件。
*/
If you want to keep Spring Boot MVC features and you want to add additional MVC configuration 
(interceptors, formatters, view controllers, and other features), you can add your own 
@Configuration class of type WebMvcConfigurer but without @EnableWebMvc. If you wish to provide 
custom instances of RequestMappingHandlerMapping, RequestMappingHandlerAdapter, or 
ExceptionHandlerExceptionResolver, you can declare a WebMvcRegistrationsAdapter instance to provide such components.

// 如果您想完全控制Spring MVC，可以添加自己的@Configuration，并用@EnableWebMvc进行注释。
If you want to take complete control of Spring MVC, you can add your own @Configuration annotated with @EnableWebMvc.
```

我们来仔细对照，看一下它怎么实现的，它告诉我们SpringBoot已经帮我们自动配置好了SpringMVC，然后自动配置了哪些东西呢？



## 2、内容协商视图解析器

**ContentNegotiatingViewResolver**

- springboot自动配置了ViewResolver，就是我们之前学习的SpringMVC的视图解析器；

- 即根据方法的返回值取得视图对象（View），然后由视图对象决定如何渲染（转发，重定向）。

- 我们去看看这里的源码：我们找到 `WebMvcAutoConfiguration` ， 然后搜索`ContentNegotiatingViewResolver`这个方法

  ```java
  @Bean
  @ConditionalOnBean(ViewResolver.class)
  @ConditionalOnMissingBean(name = "viewResolver", value = ContentNegotiatingViewResolver.class)
  public ContentNegotiatingViewResolver viewResolver(BeanFactory beanFactory) {
      ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
      resolver.setContentNegotiationManager(beanFactory.getBean(ContentNegotiationManager.class));
      // ContentNegotiatingViewResolver使用所有其他视图解析器来定位视图，因此它应该具有较高的优先级
      resolver.setOrder(Ordered.HIGHEST_PRECEDENCE);
      return resolver;
  }
  ```

- 我们可以点进`ContentNegotiatingViewResolver`这个类看看！找到对应的解析视图的方法 `resolveViewName`；

  ```java
  @Nullable // 注解说明：@Nullable 即参数可为null
  public View resolveViewName(String viewName, Locale locale) throws Exception {
      RequestAttributes attrs = RequestContextHolder.getRequestAttributes();
      Assert.state(attrs instanceof ServletRequestAttributes, "No current ServletRequestAttributes");
      List<MediaType> requestedMediaTypes = this.getMediaTypes(((ServletRequestAttributes)attrs).getRequest());
      if (requestedMediaTypes != null) {
          // 获取候选的视图对象，从spring的bean里获取所有的viewResolver
          List<View> candidateViews = this.getCandidateViews(viewName, locale, requestedMediaTypes);
          // 选择一个最适合的视图对象，然后把这个对象返回
          View bestView = this.getBestView(candidateViews, requestedMediaTypes, attrs);
          if (bestView != null) {
              return bestView;
          }
      }
      // .....
  }
  ```

- 我们继续点进去看，他是怎么获得候选的视图的呢？

  getCandidateViews中看到他是把所有的视图解析器拿来，进行while循环，挨个解析！

  ```java
  Iterator var5 = this.viewResolvers.iterator();
  ```

  所以得出结论：**ContentNegotiatingViewResolver 这个视图解析器就是用来组合所有的视图解析器的** 

- 我们再去研究下他的组合逻辑，看到有个属性viewResolvers，看看它是在哪里进行赋值的！

  ```java
  protected void initServletContext(ServletContext servletContext) {
      // 这里它是从beanFactory工具中获取容器中的所有视图解析器
      // ViewRescolver.class 把所有的视图解析器来组合的
      Collection<ViewResolver> matchingBeans = BeanFactoryUtils.beansOfTypeIncludingAncestors(this.obtainApplicationContext(), ViewResolver.class).values();
      ViewResolver viewResolver;
      if (this.viewResolvers == null) {
          this.viewResolvers = new ArrayList(matchingBeans.size());
      }
  }
  ```
  
- 既然它是在容器中去找视图解析器，我们是否可以猜想，我们就可以去实现一个视图解析器了呢？

**自定义视图解析器**

我们可以自己给容器中去添加一个视图解析器；这个类就会帮我们自动的将它组合进来；**我们去实现一下**

1. 我们在我们的主程序中去写一个视图解析器来试试；

   ```java
   //com.yang.config.MyMvcConfig
   //扩展 springmvc      DispatchServlet
   @Configuration
   public class MyMvcConfig implements WebMvcConfigurer {
       // public interface ViewResolver 实现了视图解析器接口的类，我们就可以吧它看做视图解析器
   
       @Bean
       public ViewResolver myViewResolver() {
           return new MyViewResolver();
       }
       // 自定义了一个自己的视图解析器
       public static class MyViewResolver implements ViewResolver {
   
           public View resolveViewName(String s, Locale locale) throws Exception {
               return null;
           }
       }
   }
   ```

2. 我们给 DispatcherServlet 中的 doDispatch方法 加个断点进行调试一下，因为所有的请求都会走到这个方法中

   ![1595564720595](SpringBoot01：Hello,World！.assets/1595564720595.png)

3. 我们启动我们的项目，然后随便访问一个页面，看一下Debug信息；

   找到this(<font color=red>就是DispatcherServlet</font>)

   ![1595564823239](SpringBoot01：Hello,World！.assets/1595564823239.png)

   找到视图解析器（<font color=red>viewResolvers</font>），我们看到我们自己定义的就在这里了；

   ![1595564942873](SpringBoot01：Hello,World！.assets/1595564942873.png)

- 所以说，我们如果想要使用自己定制化的东西，我们只需要给容器中添加这个组件就好了！剩下的事情SpringBoot就会帮我们做了！而前文我们所说的在获取视图解析器的时候springboot会先获取所有的候选视图，上图就是展示的所有视图解析器，从中获取一个最合适的。

## 3、转换器和格式化器

- 在`WebMvcAutoConfiguration`中找到格式化转换器：

  ```java
  @Bean
  @Override
  public FormattingConversionService mvcConversionService() {
      // 拿到配置文件中的格式化规则
      WebConversionService conversionService = new WebConversionService(this.mvcProperties.getDateFormat());
      addFormatters(conversionService);
      return conversionService;
  }
  ```
  
- 点击去：可以看到在我们的Properties文件中，我们可以进行自动配置它！

  - 2.2.x之前版本

    ```java
    public String getDateFormat() {
        return this.dateFormat;
    }
    
    /**Date format to use. For instance, `dd/MM/yyyy`. 默认的 */
    private String dateFormat;
    ```
    
  - 2.2.x之后的版本

  ```java
  public String getDateFormat() {
      return this.format.getDate();
  }
  
  public String getDate() {
      return this.date;
  }
  
  /**
  	* Date format to use, for example `dd/MM/yyyy`.默认的
  */
  private String date;
  ```
  
- 如果配置了自己的格式化方式，就会注册到Bean中生效，我们可以在配置文件中配置日期格式化的规则：

  - 2.2.x版本之前的

    配置文件

    ```properties
    # 配置文件
    spring.mvc.date-format=
    ```

    源码

    ```java
    @Deprecated
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
    ```

  - 2.2.x版本之后的

    配置文件

    ```properties
    spring.mvc.date=
    ```

    源码

    ```java
    @Deprecated
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getTime() {
        return this.time;
    }
    ```


其余的就不一一举例了，大家可以下去多研究探讨即可！



## 4、修改SpringBoot的默认配置

- 这么多的自动配置，原理都是一样的，通过这个WebMVC的自动配置原理分析，我们要学会一种学习方式，通过源码探究，得出结论；这个结论一定是属于自己的，而且一通百通。

- SpringBoot的底层，大量用到了这些设计细节思想，所以，没事需要多阅读源码！得出结论；

- SpringBoot在自动配置很多组件的时候，先看容器中有没有用户自己配置的（如果用户自己配置@bean），如果有就用用户配置的，如果没有就用自动配置的；

- 如果有些组件可以存在多个，比如我们的视图解析器，就将用户配置的和自己默认的组合起来！

- **扩展使用SpringMVC**  官方文档如下：

  If you want to keep Spring Boot MVC features and you want to add additional MVC configuration (interceptors, formatters, view controllers, and other features), you can add your own `@Configuration` class of type `WebMvcConfigurer` <font color=red>**but without** `@EnableWebMvc`</font>. If you wish to provide custom instances of `RequestMappingHandlerMapping`, `RequestMappingHandlerAdapter`, or `ExceptionHandlerExceptionResolver`, you can declare a WebMvcRegistrationsAdapter instance to provide such components.

- 我们要做的就是编写一个`@Configuration`注解类，并且类型要为`WebMvcConfigurer`，还不能标注`@EnableWebMvc`注解；我们去自己写一个；

- 我们新建一个包叫config，写一个类MyMvcConfig；

  ```java
  // 如果我们要扩展springmvc，官方建议我们这样去做@Configuration
  //类型要求为WebMvcConfigurer，这是一个接口，所以我们实现其接口
  //扩展 springmvc      DispatchServlet
  //@EnableWebMvc //这玩意就是导入了一个类，DelegatingWebMvcConfiguration，从容器中获取所有的webMvcConfig
  @Configuration
  public class MyMvcConfig implements WebMvcConfigurer {
  
      @Override
      public void addViewControllers(ViewControllerRegistry registry) {
          // 浏览器发送/test2 ， 就会跳转到test页面；
          registry.addViewController("/test2").setViewName("test");
      }
  }
  ```

- 我们去浏览器访问一下：

  ![1595584684727](SpringBoot01：Hello,World！.assets/1595584684727.png)

**确实也跳转过来了！所以说，我们要扩展SpringMVC，官方就推荐我们这么去使用，既保SpringBoot留所有的自动配置，也能用我们扩展的配置！**

我们可以去分析一下原理：

1. `WebMvcAutoConfiguration` 是 SpringMVC的自动配置类，里面有一个类`WebMvcAutoConfigurationAdapter`

2. 这个类上有一个注解，在做其他自动配置时会导入：`@Import(EnableWebMvcConfiguration.class)`

3. 我们点进`EnableWebMvcConfiguration`这个类看一下，它继承了一个父类：`DelegatingWebMvcConfiguration`

   这个父类中有这样一段代码：

   ```java
   public class DelegatingWebMvcConfiguration extends WebMvcConfigurationSupport {
       private final WebMvcConfigurerComposite configurers = new WebMvcConfigurerComposite();
       
     // 从容器中获取所有的webmvcConfigurer
       @Autowired(required = false)
       public void setConfigurers(List<WebMvcConfigurer> configurers) {
           if (!CollectionUtils.isEmpty(configurers)) {
               this.configurers.addWebMvcConfigurers(configurers);
           }
       }
   }
   ```

4. 我们可以在这个类中去寻找一个我们刚才设置的viewController当做参考，发现它调用了一个

   ```java
   protected void addViewControllers(ViewControllerRegistry registry) {
       this.configurers.addViewControllers(registry);
   }
   ```

5. 我们点进去看一下

   ```java
   public void addViewControllers(ViewControllerRegistry registry) {
       Iterator var2 = this.delegates.iterator();
   
       while(var2.hasNext()) {
           // 将所有的WebMvcConfigurer相关配置来一起调用！包括我们自己配置的和Spring给我们配置的
           WebMvcConfigurer delegate = (WebMvcConfigurer)var2.next();
           delegate.addViewControllers(registry);
       }
   }
   ```

**得出结论**：所有的`WebMvcConfiguration`都会被作用，不止Spring自己的配置类，我们自己的配置类当然也会被调用；




## 5、全面接管SpringMVC

- 官方文档：

  ```
  If you want to take complete control of Spring MVC
  you can add your own @Configuration annotated with @EnableWebMvc.
  ```

- 全面接管即：SpringBoot对SpringMVC的自动配置不需要了，所有都是我们自己去配置！

- 只需在我们的配置类中要加一个`@EnableWebMvc`。

- 我们看下如果我们全面接管了SpringMVC了，我们之前SpringBoot给我们配置的静态资源映射一定会无效，我们可以去测试一下；

- 不加注解之前，访问首页：

  ![1595587645715](SpringBoot01：Hello,World！.assets/1595587645715.png)

- 给配置类加上注解：`@EnableWebMvc`

  我们发现所有的SpringMVC自动配置都失效了！回归到了最初的样子；

  ![1595587533039](SpringBoot01：Hello,World！.assets/1595587533039.png)

**当然，我们开发中，不推荐使用全面接管SpringMVC**

思考问题？为什么加了一个注解，自动配置就失效了！我们看下源码：

1. 这里发现它是导入了一个类，我们可以继续进去看

   ```java
   @Import({DelegatingWebMvcConfiguration.class})
   public @interface EnableWebMvc {
   }
   ```

2. 它继承了一个父类 WebMvcConfigurationSupport

   ```java
   public class DelegatingWebMvcConfiguration extends WebMvcConfigurationSupport {
     // ......
   }
   ```

3. 我们来回顾一下Webmvc自动配置类

   ```java
   @Configuration(proxyBeanMethods = false)
   @ConditionalOnWebApplication(type = Type.SERVLET)
   @ConditionalOnClass({ Servlet.class, DispatcherServlet.class, WebMvcConfigurer.class })
   // 这个注解的意思就是：容器中没有这个组件的时候，这个自动配置类才生效。如果我们在自定义配置中添加了 @EnableWebMvc，那么所有的自动配置类都会失效
   @ConditionalOnMissingBean(WebMvcConfigurationSupport.class)
   @AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE + 10)
   @AutoConfigureAfter({ DispatcherServletAutoConfiguration.class, TaskExecutionAutoConfiguration.class,
       ValidationAutoConfiguration.class })
   public class WebMvcAutoConfiguration {
       
   }
   ```

   

**总结：**

- `@EnableWebMvc`将`WebMvcConfigurationSupport`组件导入进来了；

- 导入的`WebMvcConfigurationSupport`只是SpringMVC最基本的功能！
- **在springboot中，有非常多的xxxxconfigure帮助我们进行扩展配置，只要看到这个东西就要注意了**



# 十、员工管理系统

## 1、准备工作

### 1.1、实体类

新建com.yang.pojo包，新建两个实体类`Department`和`Employee`

```java
/*Department.java*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;
    private String departmentName;
}
```

```java
/*Employee.java*/
@Data
//@AllArgsConstructor //这里我们注销掉有参构造，自己写一个构造方法，目的是为了模拟日期是自动生成的
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender; // 0：女 1：男
    private Department department;
    private Date birth; //注意这里导入的是java.util.Date，不是sql.Date

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        //日期设置为默认的
        this.birth = new Date();
    }
}
```

导入`lombok`插件需要在`pom.xml`配置文件中导入依赖，随后等待`maven`刷新，如果不刷新可以重新部署

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
```

### 1.2、模拟数据库

这里我们暂时先不连接数据库，而是用`map`集合的方式模拟数据库

新建com.yang.dao，新建`DepartmentDao`和`EmployeeDao`

```java
//DepartmentDao.java
@Repository //dao层注解
public class DepartmentDao {
    //使用map集合模拟数据库
    private static Map<Integer, Department> departments = null;

    //模拟创建表
    static {
        departments = new HashMap<Integer, Department>();
        departments.put(101,new Department(101, "教学部"));
        departments.put(102,new Department(102, "市场部"));
        departments.put(103,new Department(103, "教研部"));
        departments.put(104,new Department(104, "运营部"));
        departments.put(105,new Department(105, "后勤部"));
    }

    //获取所有部门信息
    public Collection<Department> getDepartments(){
        return departments.values();
    }

    //根据id获取部门
    public Department getDepartmentById(Integer id) {
        return departments.get(id);
    }
}
```



```java
@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employees = null;

    //自动装配
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(101, new Employee(1001, "AA", "AA123@qq.com", 1, new Department(101, "教学部")));
        employees.put(101, new Employee(1002, "AA", "AA123@qq.com", 1, new Department(102, "市场部")));
        employees.put(101, new Employee(1002, "AA", "AA123@qq.com", 1, new Department(103, "教研部")));
        employees.put(101, new Employee(1003, "AA", "AA123@qq.com", 1, new Department(104, "运营部")));
        employees.put(101, new Employee(1004, "AA", "AA123@qq.com", 1, new Department(105, "后勤部")));
    }

    //添加员工 首先设置id自增
    private static Integer initId = 1005;

    public void addEmployee(Employee employee) {
        if(employee.getId() == null) {
            employee.setId(initId++);
        }
        //设置department
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);

    }

    //获取所有员工
    public Collection<Employee> getEmployee(){
        return employees.values();
    }
    //根据id查询员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }
    //删除员工
    public void removeById(Integer id) {
        employees.remove(id);
    }
}
```

## 2、首页管理

接下来我们设置一下首页，由于导入了`thymeleaf`模板，所以我们可以将静态资源放置在`classpath:templates`目录下，此处的`classpath`指的是`main/src/resources`。

### 2,1、旧方法（不推荐）

我们先按照以往的方法进行操作。

新建包`com.yang.controller`，新建类`IndexController`

```java
//IndexController.java
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
```

然后启动springboot程序，在地址栏输入`localhost:8080/index`，会展示首页内容

![image-20240313161927821](SpringBoot01：Hello,World！.assets/image-20240313161927821.png) 

### 2.2、推荐方法

前面我们学习了可以修改springboot的默认配置，针对首页这种根目录下的而配置，我们最好是写在配置文件中

```java
//MyConfig.java
@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);
        registry.addViewController("/index2").setViewName("index");
        //可以设置多个
        registry.addViewController("/index3").setViewName("index");
    }
}
```

这个时候我们就可以删除掉`IndexController`了

### 2.3、导入thymeleaf引擎

要导入thymeleaf引擎首先需要导入命名空间

```html
<html lang="en" xmlns:th="http://www.thymeleaf.org">
```

当我们在html中使用thymeleaf语法导入链接时，例如这样

```html
<link th:href="@{/css/bootstrap.min.css}" rel="stylesheet">
```

此处的`@{/...}`表示的就是根目录





## 3、页面国际化

有的时候，我们的网站会去涉及中英文甚至多语言的切换，这时候我们就需要学习国际化了！

### 3.1、准备工作

先在IDEA中统一设置properties的编码问题！

![1595594403624](SpringBoot01：Hello,World！.assets/1595594403624.png)

编写国际化配置文件，抽取页面需要显示的国际化页面消息。我们可以去登录页面查看一下，哪些内容我们需要编写国际化的配置！

### 3.2、配置文件编写

1. 我们在resources资源文件下新建一个i18n（internationalization缩写）目录，存放国际化配置文件

2. 建立一个`login.properties`文件，还有一个`login_zh_CN.properties`；发现IDEA自动识别了我们要做国际化操作；文件夹变了！

   ![1595604595071](SpringBoot01：Hello,World！.assets/1595604595071.png)

3. 我们可以在这上面去新建一个文件；

   ![1595604664699](SpringBoot01：Hello,World！.assets/1595604664699.png)

   弹出如下页面：我们再添加一个英文的；

   ![1595605422294](SpringBoot01：Hello,World！.assets/1595605422294.png)

   这样就快捷多了！

   ![1595605442883](SpringBoot01：Hello,World！.assets/1595605442883.png)

4. **接下来，我们就来编写配置，我们可以看到idea下面有另外一个视图；**

   ![1595605469344](SpringBoot01：Hello,World！.assets/1595605469344.png)

   这个视图我们点击 + 号就可以直接添加属性了；我们新建一个login.tip，可以看到边上有三个文件框可以输入

   ![1595605530046](SpringBoot01：Hello,World！.assets/1595605530046.png)

   然后依次添加其他页面内容即可！

   ![1595605552329](SpringBoot01：Hello,World！.assets/1595605552329.png)

   然后去查看我们的配置文件；

   login.properties ：

   默认

    ```shell
   login.btn=登录
   login.password=密码
   login.remember=记住我
   login.tip=请登录
   login.username=用户名
    ```

   英文：

   ```shell
   login.btn=Sign in
   login.password=Password
   login.remember=Remember me
   login.tip=Please sign in
   login.username=Username
   ```

   中文：

   ```shell
   login.btn=登录
   login.password=密码
   login.remember=记住我
   login.tip=请登录
   login.username=用户名
   ```

   OK，配置文件步骤搞定！

### 3.3、配置文件生效探究

我们去看一下SpringBoot对国际化的自动配置！这里又涉及到一个类：`MessageSourceAutoConfiguration`

里面有一个方法，这里发现SpringBoot已经自动配置好了管理我们国际化资源文件的组件 `ResourceBundleMessageSource`；

```java
// 获取 properties 传递过来的值进行判断
@Bean
public MessageSource messageSource(MessageSourceProperties properties) {
    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    if (StringUtils.hasText(properties.getBasename())) {
        // 设置国际化文件的基础名（去掉语言国家代码的）
        messageSource.setBasenames(
            StringUtils.commaDelimitedListToStringArray(
                                       StringUtils.trimAllWhitespace(properties.getBasename())));
    }
    if (properties.getEncoding() != null) {
        messageSource.setDefaultEncoding(properties.getEncoding().name());
    }
    messageSource.setFallbackToSystemLocale(properties.isFallbackToSystemLocale());
    Duration cacheDuration = properties.getCacheDuration();
    if (cacheDuration != null) {
        messageSource.setCacheMillis(cacheDuration.toMillis());
    }
    messageSource.setAlwaysUseMessageFormat(properties.isAlwaysUseMessageFormat());
    messageSource.setUseCodeAsDefaultMessage(properties.isUseCodeAsDefaultMessage());
    return messageSource;
}
```

我们真实 的情况是放在了i18n目录下，所以我们要去配置文件`application.properties`中配置这个messages的路径；

```properties
spring.messages.basename=i18n.login
```

### 3.4、配置页面国际化值

去页面获取国际化的值，查看Thymeleaf的文档，找到message取值操作为：`#{}`。我们去页面测试下：

IDEA还有提示，非常智能的！

![1595606566975](SpringBoot01：Hello,World！.assets/1595606566975.png)

我们可以去启动项目，访问一下，发现已经自动识别为中文的了！

![1595606666498](SpringBoot01：Hello,World！.assets/1595606666498.png)

**但是我们想要更好！可以根据按钮自动切换中文英文！**

### 3.5、配置国际化解析

在Spring中有一个国际化的Locale （区域信息对象）；里面有一个叫做`LocaleResolver `（获取区域信息对象）的解析器！

我们去我们webmvc自动配置文件，寻找一下！看到SpringBoot默认配置：

```java
@Bean
@ConditionalOnMissingBean
@ConditionalOnProperty(prefix = "spring.mvc", name = "locale")
public LocaleResolver localeResolver() {
    // 容器中没有就自己配，有的话就用用户配置的
    if (this.mvcProperties.getLocaleResolver() == WebMvcProperties.LocaleResolver.FIXED) {
        return new FixedLocaleResolver(this.mvcProperties.getLocale());
    }
    // 接收头国际化分解
    AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
    localeResolver.setDefaultLocale(this.mvcProperties.getLocale());
    return localeResolver;
}
```

`AcceptHeaderLocaleResolver` 这个类中有一个方法

```java
public Locale resolveLocale(HttpServletRequest request) {
    Locale defaultLocale = this.getDefaultLocale();
    // 默认的就是根据请求头带来的区域信息获取Locale进行国际化
    if (defaultLocale != null && request.getHeader("Accept-Language") == null) {
        return defaultLocale;
    } else {
        Locale requestLocale = request.getLocale();
        List<Locale> supportedLocales = this.getSupportedLocales();
        if (!supportedLocales.isEmpty() && !supportedLocales.contains(requestLocale)) {
            Locale supportedLocale = this.findSupportedLocale(request, supportedLocales);
            if (supportedLocale != null) {
                return supportedLocale;
            } else {
                return defaultLocale != null ? defaultLocale : requestLocale;
            }
        } else {
            return requestLocale;
        }
    }
}
```

那假如我们现在想点击链接让我们的国际化资源生效，就需要让我们自己的Locale生效！

我们去自己写一个自己的`LocaleResolver`，可以在链接上携带区域信息！

修改一下前端页面的跳转连接：

```html
<!-- 这里传入参数不需要使用 ？使用 （key=value）-->
<a class="btn btn-sm" th:href="@{/index.html(l='zh_CN')}">中文</a>
<a class="btn btn-sm" th:href="@{/index.html(l='en_US')}">English</a>
```

我们去写一个处理的组件类！

   ```java
package nuc.ss.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

//可以在链接上携带区域信息
public class MyLocaleResolver implements LocaleResolver {

    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        String language = request.getParameter("l");
        Locale locale = Locale.getDefault(); // 如果没有获取到就使用系统默认的
        //如果请求链接不为空
        if (!StringUtils.isEmpty(language)){
            //分割请求参数
            String[] split = language.split("_");
            //国家，地区
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
   ```

为了让我们的区域化信息能够生效，我们需要再配置一下这个组件！在我们自己的`MvcConfig`下添加`bean`；

```java
@Bean
public LocaleResolver localeResolver(){
    return new MyLocaleResolver();
}
```

**我们重启项目，来访问一下，发现点击按钮可以实现成功切换！搞定收工！**

![1595666066757](SpringBoot01：Hello,World！.assets/1595666066757.png)

### 小结：

1. 首页配置：

   - 注意点，所有页面的静态资源都需要使用thymeleaf接管
   - url：`@{}`
2. 页面国际化

   - 我们需要配置i18n文件
- 我们如果需要在项目中进行按钮自动切换，我们需要定义一个组件`LocalResolver`
   - 记得将自己写的组件配置到spring容器`@Bean`
- 国际化消息：`#{}`



## 4、登录功能实现

登录功能的实现依靠表单，首先我们在`index.html`修改表单的跳转

```html
<form class="form-signin" th:action="@{/user/login}">
    <img class="mb-4" th:src="@{/img/bootstrap-solid.svg}" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal" th:text="#{login.tip}">Please sign in</h1>
    <!--如果msg的消息不为空，则显示这个消息-->
    <p style="color: red" th:text="${msg}" th:if="${not #strings.isEmpty({msg})}"></p>
    <input type="text" name="username" class="form-control" th:placeholder="#{login.username}" required="" autofocus="">
    <input type="password" name="password" class="form-control" th:placeholder="#{login.password}" required="">
    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"  th:text="#{login.remember}">
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit"  th:text="#{login.btn}">Sign in</button>
    <p class="mt-5 mb-3 text-muted">© 2017-2018</p>
    <!-- 这里传入参数不需要使用 ？使用 （key=value）-->
    <a class="btn btn-sm" th:href="@{/index.html(l='zh_CN')}">中文</a>
    <a class="btn btn-sm" th:href="@{/index.html(l='en_US')}">English</a>
</form>
```

然后在`com.yang.controller`文件夹下新建`LoginController`。

```java
@Controller
// @ResponseBody 在写具体业务前先用ResponseBody测试一下业务是否能正常跳转
public class LoginController {
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HtttpSession session,
                        Model model){
        //具体的业务，如果用户名不为空并且密码为123456则跳转到首页
        if(!StringUtils.isEmpty(username) && "123456".equals(password)) {
            //将用户名写入session
            session.setAttribute("LoginUser", username);			
            //return "dashboard"; //如果这里直接是dashboard则在网址栏中很奇怪，所以用重定向
            //重定向
            return "redirect:/main.html";
        }else {
            //登录失败
            //并且将msg打印在首页
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }
}
```

接下来我们在首页`index.html`添加上显示提示信息的位置，为了不让一开始进入登录界面就显示`用户名或密码错误`这几个字，利用公式进行判断，只有当`msg`不为空的时候才显示。

```html
<p style="color: red" th:text="${msg}" th:if="${not #strings.isEmpty({msg})}"></p>
```

![image-20240319143556019](SpringBoot01：Hello,World！.assets/image-20240319143556019.png) 



登陆成功后页面重定向到`main`，为了让`main.html`显示的是`dashboard.html`，在我们的配置文件中进行修改，在`config`文件夹下的`MyConfig`中做如下添加

```java
public class MyConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        WebMvcConfigurer.super.addViewControllers(registry);
        //可以设置多个
        registry.addViewController("index.html").setViewName("index");
        //添加资源映射，当访问main.html的时候显示 dashboard.html内容
        registry.addViewController("main.html").setViewName("dashboard");
    }
```

此时网址栏显示的结果如下

![image-20240319143840224](SpringBoot01：Hello,World！.assets/image-20240319143840224.png) 

## 5、登录拦截

前面登录功能存在的问题在于，假如我们不登录，直接在地址栏输入`localhost:8080/main`，也能跳转到首页，这是不正确的。

应该是在登录后才能进入首页，此时我们需要设置登录拦截。在`com.yang.config`文件夹下新建 `LoginHandlerInterceptor`

```java
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从session中获取当前用户登录信息
        Object loginUser = request.getSession().getAttribute("loginUser");
        //当前用户没有登录
        if(null==loginUser) {
            //回到首页并显示信息
            request.setAttribute("msg", "当前用户未登录");
            //转发
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else {
            return true;
        }
    }
}
```

要让拦截器生效，需要将其注册到`InterceptorRegistry`中。这可以通过实现WebMvcConfigurer接口并重写addInterceptors方法来实现。

以下是一个简单的注册示例：在`MyMvcConfig.java`中注册拦截器。在注册拦截器时，可以通过``addPathPatterns`和`excludePathPatterns`方法来配置拦截器的拦截规则。`addPathPatterns`方法用于指定需要拦截的请求路径，`excludePathPatterns`方法用于指定不需要拦截的请求路径。在下面示例中，我们配置了拦截器拦截所有请求，但排除了首页、登录和静态资源。

```java
// /*表示当前目录全部文件， /**同时包含了子文件
public void addInterceptors(InterceptorRegistry registry) {
    //excludePathPatterns表示不拦截哪些信息
    registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
        .excludePathPatterns("/","/index.html","/user/login","/css/*","/js/*","/img/*");
}
```

最后登录成功后我们将用户名显示在主页上。从session中取出用户名

```html
<a>[[${session.loginUser}]]</a>
```

![image-20240319160931519](SpringBoot01：Hello,World！.assets/image-20240319160931519.png) 



## 6、提取公共页面

公共页面的提取原理很简单，一个网页的顶部和侧边栏往往是可以复用的，我们把这些内容写在一起，在需要的时候直接拿过来用，例如。

![image-20240319174354179](SpringBoot01：Hello,World！.assets/image-20240319174354179.png) 

我们可以在resources下新建commons文件夹，新建`commons.html`，然后将侧边栏和顶部栏的代码放进去，并使用thymeleaf的`th:fragment`标签分别设置

```html
<!--顶部导航栏-->
<nav th:fragment="topbar">

<!--侧边栏-->
<nav th:fragment="sidebar">
```

随后在需要的地方直接将其插入，例如在list.html中我们插入顶部导航栏和侧边栏。

```html
<!--list.html-->
<!--顶部导航栏 -->
<!--thymeleaf的组件，~{commons::main}，其中commons表示页面路径，main表示组件id-->
<div th:replace="~{commons/commons::topbar}"></div>

<!--侧边栏-->
<!--(active='list.html')表示传递参数，以 (key=value)的形式，为了实现高亮-->
<div th:replace="~{commons/commons::sidebar(active='list.html')}"></div>
```

那么接下来的问题是我们想实现侧边栏按钮被选中时的高亮，我们使用thymeleaf的三元表达式，在commons.html文件中对侧边栏修改属性。`active`参数用来表示链接是否高亮。我们可以在list.html中对调用侧边栏的代码设置一个参数，参考上面传入的`active`参数。告诉侧边栏现在处在哪个界面，然后在commons.html中对当前链接进行三元组判断。

```html
<!--如果当前是list.html则高亮，否则不高亮-->
<a th:class="${active=='list.html'?'nav-link active':'nav-link'}" th:href="@{/emps}">
```



## 7、展示员工信息

我们先在前端页面设置跳转链接，当点击侧边栏 `员工管理`的时候展示所有员工信息

```html
<a th:class="${active=='list.html'?'nav-link active':'nav-link'}" th:href="@{/emps}">
```

在com.yang.controller文件夹下新建`EmployeeController`，处理员工相关的业务。

```java
//EmployeeController.java

@Controller
public class EmployeeController {

    //自动装配，原本应该是调用service层，但是这里我们没有service层，直接调用dao层。
    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getEmployees();
        //将emps存储起来
        model.addAttribute("emps", employees);
        return "emp/list";
    }
}
```

然后在list.html中遍历所有的员工

```html
<table class="table table-striped table-sm">
    <thead>
        <tr>
            <th>id</th>
            <th>lastName</th>
            <th>email</th>
            <th>gender</th>
            <th>department</th>
            <th>birth</th>
            <th>操作</th>
        </tr>
    </thead>
    <tbody>
        <tr th:each="emp:${emps}">
            <td th:text="${emp.getId()}"></td>
            <td th:text="${emp.getLastName()}"></td>
            <td th:text="${emp.getEmail()}"></td>
            <td th:text="${emp.getGender()==0?'女':'男'}"></td>
            <td th:text="${emp.department.getDepartmentName()}"></td>    
            <!--对日期进行格式化操作-->
            <td th:text="${#dates.format(emp.getBirth(),'yyyy-MM-dd HH:mm:ss')}"></td>
            <td>
                <a class="btn btn-sm btn-primary" th:href="@{/emp/}+${emp.getId()}">编辑</a>
                <a class="btn btn-sm btn-danger" th:href="@{/delemp/}+${emp.getId()}">删除</a>
            </td>
        </tr>
    </tbody>
</table>
```

## 8、添加员工

首先在前端界面编辑添加员工的按钮，当我们点击`添加员工`时跳转到添加员工的界面，随后进行员工信息的输入和提交。

```html
<!--此处是一个get请求-->
<h2><a class="btn btn-sm btn-success" th:href="@{/emp}">添加员工</a></h2>
```

当我们点击`添加员工`按钮后，资源映射到`/emp`，到EmploeeController中添加相关业务

```java
@Controller
public class EmployeeController {

    //自动装配
    @Autowired
    DepartmentDao departmentDao;

    @GetMapping("/emp")
    public String toAddPage(Model model){
        //查询出所有的部门，为了在添加员工的时候使得部门可选
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments",departments);
        //跳转到添加员工界面 resources/emp/add.html
        return "emp/add";
    }
}
```

然后在`resources/emp`文件夹下新建`add.html`，主要为一个form表单，表单跳转的路径为`emp`，只不过提交方式为post方式。这里用到的是restful风格

```html
<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
    <!--post方法，这里跳转的链接和员工管理跳转的一样，只不过一个是get一个是post-->
    <form th:action="@{/emp}" method="post">
        <div class="form-group">
            <!--这里的name要和pojo中的每个属性一一对应，springboot才能正确封装-->
            <label>LastName</label>
            <input type="text" name="lastName" class="form-control" placeholder="海绵宝宝">
        </div>
        <div class="form-group">
            <label>Email</label>
            <input type="email" name="email" class="form-control" placeholder="1176244270@qq.com">
        </div>
        <div class="form-group">
            <label>Gender</label><br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" value="1">
                <label class="form-check-label">男</label>
            </div>
        </div>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="gender" value="0">
            <label class="form-check-label">女</label>
        </div>
        <div class="form-group">
            <label>department</label>
            <select class="form-control" name="department.id">
                <!--我们在controller接收的是一个Employee，所以我们需要提交的是其中的一个属性-->
                <option th:each="dept:${departments}" th:text="${dept.getDepartmentName()}" th:value="${dept.getId()}">1</option>
            </select>
        </div>
        <div class="form-group">
            <label>Birth</label>
            <input type="text" name="birth" class="form-control" placeholder="2020/07/25 18:00:00">
        </div>
        <button type="submit" class="btn btn-primary">添加</button>
    </form>
				</main>
```

点击提交按钮后跳转到EmployeeController写业务

```java
@PostMapping("/emp")
public String addEmp(Employee employee){

    System.out.println("save==>"+employee);
    employeeDao.save(employee);  
    //添加员工成功后，重定向到查询所有员工界面并列出所有员工
    return "redirect:emps";
}
```

员工添加完成。需要注意的一点是在我们进行日期添加的时候只能输入`1999/10/23`格式的，而不能是`1999-10-23`格式，如果希望是后者，那么需要在`application.properties`中修改。

```properties
# 但是修改为这种配置后，就不能再输入 1999/10/23，只能是 1999-10-23
spring.mvc.format.date=yyyy-mm-dd 
```

## 9、修改员工信息

首先我们编写前端代码，对每一条员工信息都加上编辑按钮。当点击编辑按钮的时候跳转到更新员工信息界面，同时需要将员工的`id`作为参数传递。注意这里的组件必须是`a`标签，不能是`button`标签，否则不会跳转

```html
<a class="btn btn-sm btn-primary" th:href="@{/emp/}+${emp.getId()}">编辑</a>
```

![image-20240402192744389](SpringBoot01：Hello,World！.assets/image-20240402192744389.png) 

随后跳转到`EmployeeController`，编写跳转到更新页面的业务，在这里我们首先根据从前端界面传来的id，查询出对应的员工类，并查询出所有的部门信息用于后续展示。封装后跳转到更新界面。

```java
@GetMapping("/emp/{id}")
//@PathVariable用于将方法参数绑定到URI模板变量，例如这里将id参数绑定到上面url中的id
public String toUpdateEmp(@PathVariable("id")Integer id, Model model){
    Employee employee = employeeDao.getEmployeeById(id);
    Collection<Department> departments = departmentDao.getDepartments();
    model.addAttribute("departments",departments);
    model.addAttribute("emp", employee);
    return "emp/update";
}
```

update.html的界面类似于添加员工界面，只不过我们需要将当前选中员工的信息展示出来。

> updata.html

```html
<!--post方法，这里跳转的链接和员工管理跳转的一样，只不过一个是get一个是post-->
<form th:action="@{/updateEmp}" method="post">
    <!--hidden域用来传入id，是为了对同一个id的员工信息进行修改，避免自增添加新的员工-->
    <input type="hidden" name="id" th:value="${emp.getId()}">
    <div class="form-group">
        <label>LastName</label>
        <input type="text" th:value="${emp.getLastName()}" name="lastName" class="form-control" placeholder="海绵宝宝">
    </div>
    <div class="form-group">
        <label>Email</label>
        <input type="email" th:value="${emp.getEmail()}" name="email" class="form-control" placeholder="1176244270@qq.com">
    </div>
    <div class="form-group">
        <label>Gender</label><br>
        <div class="form-check form-check-inline">
            <input th:checked="${emp.getGender()==1}" class="form-check-input" type="radio" name="gender" value="1">
            <label class="form-check-label">男</label>
        </div>
    </div>
    <div class="form-check form-check-inline">
        <input th:checked="${emp.getGender()==0}" class="form-check-input" type="radio" name="gender" value="0">
        <label class="form-check-label">女</label>
    </div>
    <div class="form-group">
        <label>department</label>
        <select class="form-control" name="department.id">
            <!--我们在controller接收的是一个Employee，所以我们需要提交的是其中的一个属性-->
            <option th:selected="${dept.getId()==emp.getDepartment.getId()}" th:each="dept:${departments}" th:text="${dept.getDepartmentName()}" th:value="${dept.getId()}">1</option>
        </select>
    </div>
    <div class="form-group">
        <label>Birth</label>
        <input type="text" th:value="${#dates.format(emp.getBirth(),'yyyy-MM-dd HH:mm:ss')}" name="birth" class="form-control" placeholder="2020/07/25 18:00:00">
    </div>
    <button type="submit" class="btn btn-primary">修改</button>
</form>
```

当我们修改好员工信息后点击提交按钮，跳转到业务层。需要注意的是这里我们修改员工信息使用的是和添加员工相同的底层，为了避免我们新添加一个员工，所以在前端界面我们传入了员工的`id`

```java
@PostMapping("/updateEmp")
public String updataEmp(Employee employee){    
    employeeDao.save(employee);
    return "redirect:/emps";
}
```

## 10、删除员工信息

我们先编写前端代码

```html
<a class="btn btn-sm btn-danger" th:href="@{/delemp/}+${emp.getId()}">删除</a>
```

当我们单击删除按钮的时候，跳转到业务层，然后直接删除员工。

```java
@GetMapping("/delemp/{id}")
public String deleEmp(@PathVariable("id") Integer id){
    Employee employee = employeeDao.getEmployeeById(id);
    employeeDao.removeById(id);
    return "redirect:/emps";
}
```

## 11、注销

先编写前端代码

```html
<a class="nav-link" th:href="@{/user/logout}">注销</a>
```

点击注销后，跳转到LoginController，清除session中的所有信息，并且返回登录界面。

```java
//注销
@RequestMapping("/user/logout")
public String logOut(HttpSession session){
    //清楚session
    session.invalidate();
    return "redirect:/index.html";
}
```

## 12、聊聊如何写一个网站













# 十一、整合JDBC

## SpringData简介

- 对于数据访问层，无论是 SQL(关系型数据库) 还是 NOSQL(非关系型数据库)，Spring Boot 底层都是采用 Spring Data 的方式进行统一处理。
- Spring Boot 底层都是采用 Spring Data 的方式进行统一处理各种数据库，Spring Data 也是 Spring 中与 Spring Boot、Spring Cloud 等齐名的知名项目。
- Sping Data 官网：[https://spring.io/projects/spring-data](https://spring.io/projects/spring-data)
- 数据库相关的启动器 ：可以参考官方文档：[https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#using-boot-starter](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#using-boot-starter)



## 整合JDBC

### 创建测试项目测试数据源

1. 我去新建一个项目测试：springboot-05-data ; 引入相应的模块！基础模块

   ![image-20240409144740513](SpringBoot01：Hello,World！.assets/image-20240409144740513.png) 

2. 项目建好之后，发现自动帮我们导入了如下的启动器：

   ```xml
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-jdbc</artifactId>
   </dependency>
   <dependency>
       <groupId>mysql</groupId>
       <artifactId>mysql-connector-java</artifactId>
       <scope>runtime</scope>
   </dependency>
   ```

3. 编写yaml配置文件连接数据库；

   ```yaml
   spring:
     datasource:
       username: root
       password: root
       #?serverTimezone=UTC解决时区的报错
       url: jdbc:mysql://localhost:3306/mybatis?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8
       driver-class-name: com.mysql.cj.jdbc.Driver
   ```

   我们可以在这里设置属性，相应的就一定有一个 `xxx.properties`，再相应的会有一个`xxxAutoConfiguration`用来自动配置。

4. 配置完这一些东西后，我们就可以直接去使用了，因为SpringBoot已经默认帮我们进行了自动配置；去测试类测试一下

   ```java
   @SpringBootTest
   class SpringbootDataJdbcApplicationTests {
   
       //DI注入数据源
       @Autowired(required=false) ////如果允许对象为null，设置required = false,默认为true
       DataSource dataSource;
   
       @Test
       public void contextLoads() throws SQLException { //抛出异常
           //看一下默认数据源
           System.out.println(dataSource.getClass());
           //获得连接
           Connection connection = dataSource.getConnection();
           System.out.println(connection);
           //关闭连接
           connection.close();
       }
   }
   ```

   `DataSource`是一个接口，用于表示数据源，通常用于连接数据库。`DataSource`接口定义了一些方法，比如获取数据库连接、释放数据库连接等。在Spring Boot中，`DataSource`通常是通过配置文件或者注解来配置的，然后通过依赖注入的方式注入到需要使用的地方。

结果：我们可以看到他默认给我们配置的数据源为 : `class com.zaxxer.hikari.HikariDataSource` ， 我们并没有手动配置

我们来全局搜索一下，找到数据源的所有自动配置都在 ：`DataSourceAutoConfiguration`文件：

```java
@Import(
    {Hikari.class, Tomcat.class, Dbcp2.class, Generic.class, DataSourceJmxConfiguration.class}
)
protected static class PooledDataSourceConfiguration {
    protected PooledDataSourceConfiguration() {
    }
}
```

这里导入的类都在 `DataSourceConfiguration` 配置类下，可以看出 Spring Boot 2.2.5 默认使用HikariDataSource 数据源，而以前版本，如 Spring Boot 1.5 默认使用 org.apache.tomcat.jdbc.pool.DataSource 作为数据源；

**<font color=red>HikariDataSource 号称 Java WEB 当前速度最快的数据源，相比于传统的 C3P0 、DBCP、Tomcat jdbc 等连接池更加优秀；</font>**

**可以使用 spring.datasource.type 指定自定义的数据源类型，值为 要使用的连接池实现的完全限定名。**



关于数据源我们并不做介绍，有了数据库连接，显然就可以 CRUD 操作数据库了。但是我们需要先了解一个对象 JdbcTemplate

### JDBCTemplate

1. 有了数据源(com.zaxxer.hikari.HikariDataSource)，然后可以拿到数据库连接(java.sql.Connection)，有了连接，就可以使用原生的 JDBC 语句来操作数据库；
2. 即使不使用第三方第数据库操作框架，如 MyBatis等，Spring 本身也对原生的JDBC 做了轻量级的封装，即**JdbcTemplate**。
3. 数据库操作的所有 CRUD 方法都在 JdbcTemplate 中。
4. Spring Boot 不仅提供了默认的数据源，同时默认已经配置好了 JdbcTemplate 放在了容器中，程序员只需自己注入即可使用
5. JdbcTemplate 的自动配置是依赖 org.springframework.boot.autoconfigure.jdbc 包下的 JdbcTemplateConfiguration 类

**JdbcTemplate主要提供以下几类方法：**

- execute方法：可以用于执行任何SQL语句，一般用于执行DDL语句；
- update方法及batchUpdate方法：update方法用于执行新增、修改、删除等语句；batchUpdate方法用于执行批处理相关语句；
- query方法及queryForXXX方法：用于执行查询相关语句；
- call方法：用于执行存储过程、函数相关语句。

### 测试

编写一个Controller，注入 jdbcTemplate，编写测试方法进行访问测试；

```java
@RestController //需要添加web依赖 也就是在pom.xml中添加starter
public class JDBCController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    // 查询数据库的所有信息
    // 没有实体类，获取数据库的东西，怎么获取？ Map
    @GetMapping("/userList")
    public List<Map<String,Object>> userList() {
        String sql = "select * from user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

    @GetMapping("/addUser")
    public String addUser() {
        String sql = "insert into mybatis.user(id, name, pwd) values(7,'小明','123456')";
        jdbcTemplate.update(sql);
        return "update-ok";
    }

    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id) {
        String sql = "update mybatis.user set name  = ?,pwd = ? where id = " + id;
        //封装
        Object[] objects = new Object[2];

        objects[0] = "小明2";
        objects[1] = "aaaaaaa";

        jdbcTemplate.update(sql,objects);
        return "update-ok";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        String sql = "delete from mybatis.user where id = ?";
        jdbcTemplate.update(sql,id);
        return "update-ok";
    }
}

```

测试请求，结果正常；

到此，CURD的基本操作，使用 JDBC 就搞定了。



# 十二、集成Druid

## Druid简介

- Java程序很大一部分要操作数据库，为了提高性能操作数据库的时候，又不得不使用数据库连接池。

- Druid 是阿里巴巴开源平台上一个数据库连接池实现，结合了 C3P0、DBCP 等 DB 池的优点，同时加入了日志监控。

- Druid 可以很好的监控 DB 池连接和 SQL 的执行情况，天生就是针对监控而生的 DB 连接池。

- Druid已经在阿里巴巴部署了超过600个应用，经过一年多生产环境大规模部署的严苛考验。

- Spring Boot 2.0 以上默认使用 Hikari 数据源，可以说 Hikari 与 Driud 都是当前 Java Web 上最优秀的数据源，我们来重点介绍 Spring Boot 如何集成 Druid 数据源，如何实现数据库监控。

- Github地址：https://github.com/alibaba/druid/

**com.alibaba.druid.pool.DruidDataSource 基本配置参数如下：**

|           **配置**            |      **缺省值**       | **说明**                                                     |
| :---------------------------: | :-------------------: | ------------------------------------------------------------ |
|             name              |                       | 配置这个属性的意义在于，如果存在多个数据源，监控的时候可以通过名字来区分开来。 如果没有配置，将会生成一个名字，格式是：“DataSource-” + System.identityHashCode(this) |
|            jdbcUrl            |                       | 连接数据库的url，不同数据库不一样。例如： mysql : jdbc:mysql://10.20.153.104:3306/druid2 oracle : jdbc:oracle:thin:@10.20.149.85:1521:ocnauto |
|           username            |                       | 连接数据库的用户名                                           |
|           password            |                       | 连接数据库的密码。如果你不希望密码直接写在配置文件中，可以使用ConfigFilter。详细看这里：[https://github.com/alibaba/druid/wiki/%E4%BD%BF%E7%94%A8ConfigFilter](https://github.com/alibaba/druid/wiki/%E4%BD%BF%E7%94%A8ConfigFilter) |
|        driverClassName        |    根据url自动识别    | 这一项可配可不配，如果不配置druid会根据url自动识别dbType，然后选择相应的driverClassName(建议配置下) |
|          initialSize          |           0           | 初始化时建立物理连接的个数。初始化发生在显示调用init方法，或者第一次getConnection时 |
|           maxActive           |           8           | 最大连接池数量                                               |
|            maxIdle            |           8           | 已经不再使用，配置了也没效果                                 |
|            minIdle            |                       | 最小连接池数量                                               |
|            maxWait            |                       | 获取连接时最大等待时间，单位毫秒。配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，如果需要可以通过配置useUnfairLock属性为true使用非公平锁。 |
|    poolPreparedStatements     |         false         | 是否缓存preparedStatement，也就是PSCache。PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。 |
|   maxOpenPreparedStatements   |          -1           | 要启用PSCache，必须配置大于0，当大于0时，poolPreparedStatements自动触发修改为true。在Druid中，不会存在Oracle下PSCache占用内存过多的问题，可以把这个数值配置大一些，比如说100 |
|        validationQuery        |                       | 用来检测连接是否有效的sql，要求是一个查询语句。如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会其作用。 |
|    validationQueryTimeout     |                       | 单位:秒，检测连接是否有效的超时时间。底层调用jdbc<br/>Statement对象的void setQueryTimeout(int seconds)方法 |
|         testOnBorrow          |         true          | 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能 |
|         testOnReturn          |         false         | 归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能 |
|         testWhileIdle         |         false         | 建议配置为true，不影响性能，并且保证安全性。申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效 |
| timeBetweenEvictionRunsMillis | 1分钟<br/>( 1.0.14 )  | 有两个含义： 1) Destroy线程会检测连接的间隔时间 2) testWhileIdle的判断依据，详细看testWhileIdle属性的说明 |
|    numTestsPerEvictionRun     |                       | 不再使用，一个DruidDataSource只支持一个EvictionRun           |
|  minEvictableIdleTimeMillis   | 30分钟<br/>( 1.0.14 ) | 连接保持空闲而不被驱逐的最长时间                             |
|      connectionInitSqls       |                       | 物理连接初始化的时候执行的sql                                |
|        exceptionSorter        |  根据dbType自动识别   | 当数据库抛出一些不可恢复的异常时，抛弃连接                   |
|            filters            |                       | 属性类型是字符串，通过别名的方式配置扩展插件，常用的插件有： 监控统计用的filter:stat日志用的filter:log4j防御sql注入的filter:wall |
|         proxyFilters          |                       | 类型是List<com.alibaba.druid.filter.Filter>，如果同时配置了filters和proxyFilters，是组合关系，并非替换关系 |



## 配置数据源

1. 添加上 Druid 数据源依赖，这个依赖可以从Maven仓库官网[<font color=red>Maven Respository</font>](https://mvnrepository.com/artifact/com.alibaba/druid)中获取

   ```xml
   <dependency>
       <groupId>com.alibaba</groupId>
       <artifactId>druid</artifactId>
       <version>1.1.23</version>
   </dependency>
   ```

   ![image-20200727215315060](SpringBoot01：Hello,World！.assets/image-20200727215315060.png)

2. 切换数据源；之前已经说过 Spring Boot 2.0 以上默认使用 `com.zaxxer.hikari.HikariDataSource `数据源，但可以通过 `spring.datasource.type` 指定数据源。

   ```yaml
   spring:
     datasource:
       username: root
       password: 123456
       url: jdbc:mysql://localhost:3306/springboot?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8
       driver-class-name: com.mysql.cj.jdbc.Driver
       type: com.alibaba.druid.pool.DruidDataSource # 自定义数据源
   ```

3. 数据源切换之后，在测试类中注入 DataSource，然后获取到它，输出一看便知是否成功切换；

   ![image-20200727222109497](SpringBoot01：Hello,World！.assets/image-20200727222109497.png)

4. 切换成功！既然切换成功，就可以设置数据源连接初始化大小、最大连接数、等待时间、最小连接数 等设置项；可以查看源码

   ```yaml
   spring:
     datasource:
       username: root
       password: 123456
       #?serverTimezone=UTC解决时区的报错
       url: jdbc:mysql://localhost:3306/springboot?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8
       driver-class-name: com.mysql.cj.jdbc.Driver
       type: com.alibaba.druid.pool.DruidDataSource
   
       #Spring Boot 默认是不注入这些属性值的，需要自己绑定
       #druid 数据源专有配置
       initialSize: 5
       minIdle: 5
       maxActive: 20
       maxWait: 60000
       timeBetweenEvictionRunsMillis: 60000
       minEvictableIdleTimeMillis: 300000
       validationQuery: SELECT 1 FROM DUAL
       testWhileIdle: true
       testOnBorrow: false
       testOnReturn: false
       poolPreparedStatements: true
   
       #配置监控统计拦截的filters，stat:监控统计、log4j：日志记录、wall：防御sql注入
       #如果允许时报错  java.lang.ClassNotFoundException: org.apache.log4j.Priority
       #则导入 log4j 依赖即可，Maven 地址：https://mvnrepository.com/artifact/log4j/log4j
       filters: stat,wall,log4j
       maxPoolPreparedStatementPerConnectionSize: 20
       useGlobalDataSourceStat: true
       connectionProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500
   ```

5. 导入Log4j 的依赖

   ```xml
   <!-- https://mvnrepository.com/artifact/log4j/log4j -->
   <dependency>
       <groupId>log4j</groupId>
       <artifactId>log4j</artifactId>
       <version>1.2.17</version>
   </dependency>
   ```

6. 现在需要程序员自己为 DruidDataSource 绑定全局配置文件中的参数，再添加到容器中，而不再使用 Spring Boot 的自动生成了；我们需要 自己添加 DruidDataSource 组件到容器中，并绑定属性；

   ```java
   package nuc.ss.config;
   
   import com.alibaba.druid.pool.DruidDataSource;
   import org.springframework.boot.context.properties.ConfigurationProperties;
   import org.springframework.context.annotation.Bean;
   import org.springframework.context.annotation.Configuration;
   import javax.sql.DataSource;
   
   @Configuration
   public class DruidConfig {
   
       /*
          将自定义的 Druid数据源添加到容器中，不再让 Spring Boot 自动创建
          绑定全局配置文件中的 druid 数据源属性到 com.alibaba.druid.pool.DruidDataSource从而让它们生效
          @ConfigurationProperties(prefix = "spring.datasource")：作用就是将 全局配置文件中
          前缀为 spring.datasource的属性值注入到 com.alibaba.druid.pool.DruidDataSource 的同名参数中
        */
       @ConfigurationProperties(prefix = "spring.datasource")
       @Bean
       public DataSource druidDataSource() {
           return new DruidDataSource();
       }
   
   }
   ```
   
7. 去测试类中测试一下；看是否成功！

   ```java
   @SpringBootTest
   class SpringbootDataJdbcApplicationTests {
   
       //DI注入数据源
       @Autowired
       DataSource dataSource;
   
       @Test
       public void contextLoads() throws SQLException {
           //看一下默认数据源
           System.out.println(dataSource.getClass());
           //获得连接
           Connection connection =   dataSource.getConnection();
           System.out.println(connection);
   
           DruidDataSource druidDataSource = (DruidDataSource) dataSource;
           System.out.println("druidDataSource 数据源最大连接数：" + druidDataSource.getMaxActive());
           System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSource.getInitialSize());
   
           //关闭连接
           connection.close();
       }
   }
   ```

8. 输出结果 ：可见配置参数已经生效！

   ![image-20200727233746228](SpringBoot01：Hello,World！.assets/image-20200727233746228.png)

## 配置Druid数据源监控

Druid 数据源具有监控的功能，并提供了一个 web 界面方便用户查看，类似安装 路由器 时，人家也提供了一个默认的 web 页面。

所以第一步需要设置 Druid 的后台管理页面，比如 登录账号、密码 等；配置后台管理；

```java
//配置 Druid 监控管理后台的Servlet；
//springboot内置了servlet容器，所以我们没办法像以前使用web.xml一样，而改用ServletRegistrationBean的方法
@Bean
public ServletRegistrationBean statViewServlet() {
    ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

    // 这些参数可以在 com.alibaba.druid.support.http.StatViewServlet 
    // 的父类 com.alibaba.druid.support.http.ResourceServlet 中找到
    Map<String, String> initParams = new HashMap<>();
    initParams.put("loginUsername", "root"); //后台管理界面的登录账号
    initParams.put("loginPassword", "admin"); //后台管理界面的登录密码

    //后台允许谁可以访问
    //initParams.put("allow", "localhost")：表示只有本机可以访问
    //initParams.put("allow", "")：为空或者为null时，表示允许所有访问
    initParams.put("allow", "");
    //deny：Druid 后台拒绝谁访问
    //initParams.put("kuangshen", "192.168.1.20");表示禁止此ip访问

    //设置初始化参数
    bean.setInitParameters(initParams);
    return bean;
}
```

配置完毕后，我们可以选择访问 ：[http://localhost:8080/druid/login.html](http://localhost:8080/druid/login.html)

![image-20200727233409312](SpringBoot01：Hello,World！.assets/image-20200727233409312.png)

进入之后

![image-20200727233436583](SpringBoot01：Hello,World！.assets/image-20200727233436583.png)

**配置 Druid web 监控 filter 过滤器**

```java
//配置 Druid 监控 之  web 监控的 filter
//WebStatFilter：用于配置Web和Druid数据源之间的管理关联监控统计
@Bean
public FilterRegistrationBean webStatFilter() {
    FilterRegistrationBean bean = new FilterRegistrationBean();
    bean.setFilter(new WebStatFilter());

    //exclusions：设置哪些请求进行过滤排除掉，从而不进行统计
    Map<String, String> initParams = new HashMap<>();
    initParams.put("exclusions", "*.js,*.css,/druid/*,/jdbc/*");
    bean.setInitParameters(initParams);

    //"/*" 表示过滤所有请求
    bean.setUrlPatterns(Arrays.asList("/*"));
    return bean;
}
```

# 十三、整合Mybatis

官方文档：[http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/](http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)

Maven仓库地址：[https://mvnrepository.com/artifact/org.mybatis.spring.boot/mybatis-spring-boot-starter/2.1.3](https://mvnrepository.com/artifact/org.mybatis.spring.boot/mybatis-spring-boot-starter/2.1.3)

![image-20200728083023851](SpringBoot01：Hello,World！.assets/image-20200728083023851.png)

## 整合测试

1. 导入 MyBatis 所需要的依赖

   ```xml
   <dependency>
       <groupId>org.mybatis.spring.boot</groupId>
       <artifactId>mybatis-spring-boot-starter</artifactId>
       <version>2.1.3</version>
   </dependency>
   ```

2. 配置数据库连接信息（不变）

   ```yaml
   spring:
     datasource:
       username: root
       password: root
       #?serverTimezone=UTC解决时区的报错
       url: jdbc:mysql://localhost:3306/mybatis?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8
       driver-class-name: com.mysql.cj.jdbc.Driver  #选择cj.jd
       type: com.alibaba.druid.pool.DruidDataSource
   
       #Spring Boot 默认是不注入这些属性值的，需要自己绑定
       #druid 数据源专有配置
       initialSize: 5
       minIdle: 5
       maxActive: 20
       maxWait: 60000
       timeBetweenEvictionRunsMillis: 60000
       minEvictableIdleTimeMillis: 300000
       validationQuery: SELECT 1 FROM DUAL
       testWhileIdle: true
       testOnBorrow: false
       testOnReturn: false
       poolPreparedStatements: true
   
       #配置监控统计拦截的filters，stat:监控统计、log4j：日志记录、wall：防御sql注入
       #如果允许时报错  java.lang.ClassNotFoundException: org.apache.log4j.Priority
       #则导入 log4j 依赖即可，Maven 地址：https://mvnrepository.com/artifact/log4j/log4j
       filters: stat,wall,log4j
       maxPoolPreparedStatementPerConnectionSize: 20
       useGlobalDataSourceStat: true
       connectionProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500
   ```

3. **测试数据库是否连接成功！**

4. **创建实体类，导入 Lombok！**

   `User.java`

   ```java
   package nuc.ss.pojo;
   
   import lombok.AllArgsConstructor;
   import lombok.Data;
   import lombok.NoArgsConstructor;
   
   @Data
   @AllArgsConstructor
   @NoArgsConstructor
   public class User {
       private int id;
       private String name;
       private String pwd;
   }
   ```

5. **创建mapper目录以及对应的 Mapper 接口**

   `UserMapper.java`

   ```java
   package nuc.ss.mapper;
   
   import nuc.ss.pojo.User;
   import org.apache.ibatis.annotations.Mapper;
   import org.springframework.stereotype.Repository;
   import java.util.List;
   
   // 这个注解表示了这是一个 mybatis 的 mapper 类
   @Mapper
   @Repository
   public interface UserMapper {
   
       List<User> queryUserList();
   
       User queryUserById(int id);
   
       int addUser(User user);
   
       int updateUser(User user);
   
       int deleteUser(int id);
   }
   ```

6. **对应的Mapper映射文件**

   `UserMapper.xml`

   ```xml
   <?xml version="1.0" encoding="UTF-8" ?>
   <!DOCTYPE mapper
           PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
           "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
   <!--namespace=绑定一个对应的Dao/Mapper接口-->
   <mapper namespace="com.yang.mapper.UserMapper">
       
       <select id="queryUserList" resultType="User">
           select * from mybatis.user;
       </select>
   
       <select id="queryUserById" resultType="User">
           select * from mybatis.user where id = #{id};
       </select>
   
       <insert id="addUser" parameterType="User">
           insert into mybatis.user (id, name, pwd) values (#{id},#{name},#{pwd});
       </insert>
   
       <update id="updateUser" parameterType="User">
           update mybatis.user set name=#{name},pwd = #{pwd} where id = #{id};
       </update>
   
       <delete id="deleteUser" parameterType="int">
           delete from mybatis.user where id = #{id}
       </delete>
   </mapper>
   ```

7. **maven配置资源过滤问题**

   ```xml
   <resources>
       <resource>
           <directory>src/main/java</directory>
           <includes>
               <include>**/*.xml</include>
           </includes>
           <filtering>true</filtering>
       </resource>
   </resources>
   ```

8. **编写部门的 UserController 进行测试！**

   ```java
   @RestController
   public class UserController {
       @Autowired
       private UserMapper userMapper;
   
       @GetMapping("/queryUserList")
       public List<User> queryUserList() {
           List<User> userList = userMapper.queryUserList();
   
           for (User user : userList) {
               System.out.println(user);
           }
   
           return userList;
       }
       
        //添加一个用户
       @GetMapping("/addUser")
       public String addUser() {
           userMapper.addUser(new User(7,"阿毛","123456"));
           return "ok";
       }
   
       //修改一个用户
       @GetMapping("/updateUser")
       public String updateUser() {
           userMapper.updateUser(new User(7,"阿毛","123456"));
           return "ok";
       }
   
       @GetMapping("/deleteUser")
       public String deleteUser() {
           userMapper.deleteUser(7);
   
           return "ok";
       }
   }
   ```

**启动项目访问进行测试！**



# 十四、SpringSecurity

## 安全简介

1、在 Web 开发中，安全一直是非常重要的一个方面。安全虽然属于应用的非功能性需求，但是应该在应用开发的初期就考虑进来。如果在应用开发的后期才考虑安全的问题，就可能陷入一个两难的境地：一方面，应用存在严重的安全漏洞，无法满足用户的要求，并可能造成用户的隐私数据被攻击者窃取；另一方面，应用的基本架构已经确定，要修复安全漏洞，可能需要对系统的架构做出比较重大的调整，因而需要更多的开发时间，影响应用的发布进程。因此，从应用开发的第一天就应该把安全相关的因素考虑进来，并在整个应用的开发过程中。

2、市面上存在比较有名的：Shiro，Spring Security ！

3、这里需要阐述一下的是，每一个框架的出现都是为了解决某一问题而产生了，那么Spring Security框架的出现是为了解决什么问题呢？

4、首先我们看下它的官网介绍：Spring Security官网地址

`Spring Security is a powerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.`

`Spring Security is a framework that focuses on providing both authentication and authorization to Java applications. Like all Spring projects, the real power of Spring Security is found in how easily it can be extended to meet custom requirements`

5、Spring Security是一个功能强大且高度可定制的身份验证和访问控制框架。它实际上是保护基于spring的应用程序的标准。

6、Spring Security是一个框架，侧重于为Java应用程序提供身份验证和授权。与所有Spring项目一样，Spring安全性的真正强大之处在于它可以轻松地扩展以满足定制需求

7、从官网的介绍中可以知道这是一个权限框架。想我们之前做项目是没有使用框架是怎么控制权限的？对于权限 一般会细分为功能权限，访问权限，和菜单权限。代码会写的非常的繁琐，冗余。

8、怎么解决之前写权限代码繁琐，冗余的问题，一些主流框架就应运而生而Spring Scecurity就是其中的一种。

9、Spring 是一个非常流行和成功的 Java 应用开发框架。Spring Security 基于 Spring 框架，提供了一套 Web 应用安全性的完整解决方案。一般来说，Web 应用的安全性包括用户认证（Authentication）和用户授权（Authorization）两个部分。

- 用户认证指的是验证某个用户是否为系统中的合法主体，也就是说用户能否访问该系统。用户认证一般要求用户提供用户名和密码。系统通过校验用户名和密码来完成认证过程。
- 用户授权指的是验证某个用户是否有权限执行某个操作。在一个系统中，不同用户所具有的权限是不同的。比如对一个文件来说，有的用户只能进行读取，而有的用户可以进行修改。一般来说，系统会为不同的用户分配不同的角色，而每个角色则对应一系列的权限。

10、对于上面提到的两种应用情景，Spring Security 框架都有很好的支持。

- 在用户认证方面，Spring Security 框架支持主流的认证方式，包括 HTTP 基本认证、HTTP 表单验证、HTTP 摘要认证、OpenID 和 LDAP 等。
- 在用户授权方面，Spring Security 提供了基于角色的访问控制和访问控制列表（Access Control List，ACL），可以对应用中的领域对象进行细粒度的控制。



## 实战测试

### 实验环境搭建

1. 新建一个初始的springboot项目web模块，thymeleaf模块

2. 导入静态资源

   ![image-20200728130501139](SpringBoot01：Hello,World！.assets/image-20200728130501139.png)

3. controller跳转！

   ```java
   package nuc.ss.controller;
   
   import org.springframework.stereotype.Controller;
   import org.springframework.web.bind.annotation.PathVariable;
   import org.springframework.web.bind.annotation.RequestMapping;
   
   @Controller
   public class RouterController {
   
       @RequestMapping({"/","/index"})
       public String index() {
           return "index";
       }
   
       @RequestMapping("/toLogin")
       public String toLogin() {
           return "views/login";
       }
   	//用加参数的方法实现用三个方法，能够跳转到9个页面
       @RequestMapping("/level1/{id}")
       public String level1(@PathVariable("id") int id) {
           return "views/level1/" + id;
       }
   
       @RequestMapping("/level2/{id}")
       public String level2(@PathVariable("id") int id) {
           return "views/level2/" + id;
       }
   
       @RequestMapping("/level3/{id}")
       public String level3(@PathVariable("id") int id) {
           return "views/level3/" + id;
       }
   }
   ```

4. 测试实验环境是否OK！

   首页

   ![image-20200728130703899](SpringBoot01：Hello,World！.assets/image-20200728130703899.png)

   登录

   ![image-20200728130726820](SpringBoot01：Hello,World！.assets/image-20200728130726820.png)

   详情

   ![image-20200728130751338](SpringBoot01：Hello,World！.assets/image-20200728130751338.png)

我们想要的效果是在登录和不登录的情况下看到的界面是不一样的，以及不同的用户有不同的权限。例如现在level 1 2 3都能访问，但是希望的效果是level 1的用户只能访问level 1的内容，level 3的用户只能访问level 3的内容。

### 认识SpringSecurity

Spring Security 是针对Spring项目的安全框架，也是Spring Boot底层安全模块默认的技术选型，他可以实现强大的Web安全控制，对于安全控制，我们仅需要引入 spring-boot-starter-security 模块，进行少量的配置，即可实现强大的安全管理！

记住几个类：

- `WebSecurityConfigurerAdapter`：自定义Security策略
- `AuthenticationManagerBuilder`：自定义认证策略
- `@EnableWebSecurity`：开启WebSecurity模式

Spring Security的两个主要目标是 “认证” 和 “授权”（访问控制）。

**“认证”（Authentication）**

身份验证是关于验证您的凭据，如用户名/用户ID和密码，以验证您的身份。

身份验证通常通过用户名和密码完成，有时与身份验证因素结合使用。

 **“授权” （Authorization）**

授权发生在系统成功验证您的身份后，最终会授予您访问资源（如信息，文件，数据库，资金，位置，几乎任何内容）的完全权限。

这个概念是通用的，而不是只在Spring Security 中存在。

### 认证和授权

目前，我们的测试环境，是谁都可以访问的，我们使用 Spring Security 增加上认证和授权的功能

1. 引入 Spring Security 模块

   ```xml
   <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-security</artifactId>
   </dependency>
   ```

   ![image-20200728175946604](SpringBoot01：Hello,World！.assets/image-20200728175946604.png)

2. 编写 Spring Security 配置类

   - 参考官网：[https://spring.io/projects/spring-security](https://spring.io/projects/spring-security)

   - 查看我们自己项目中的版本，找到对应的帮助文档：[https://docs.spring.io/spring-security/site/docs/5.3.0.RELEASE/reference/html5](https://docs.spring.io/spring-security/site/docs/5.3.0.RELEASE/reference/html5)  

   - servlet-applications 8.16.4

     ```java
     @EnableWebSecurity
     public class Config extends WebSecurityConfigurerAdapter {
         @Override
         protected void configure(HttpSecurity http) throws Exception {
             http
                 .apply(customDsl())
                     .flag(true)
                     .and()
                 ...;
         }
     }
     ```

     ![image-20200728175824524](SpringBoot01：Hello,World！.assets/image-20200728175824524.png)

3. 编写基础配置类

   ![image-20200728180624787](SpringBoot01：Hello,World！.assets/image-20200728180624787.png)

   ```java
   package nuc.ss.config;
   
   import org.springframework.security.config.annotation.web.builders.HttpSecurity;
   import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
   import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
   
   @EnableWebSecurity// 开启WebSecurity模式，表示被托管了
   public class SecurityConfig extends WebSecurityConfigurerAdapter {
   
       @Override
       protected void configure(HttpSecurity http) throws Exception {
           super.configure(http);
       }
   }
   
   ```

4. 定制请求的授权规则

   看源码

   ![image-20200728190605894](SpringBoot01：Hello,World！.assets/image-20200728190605894.png)

   仿写

   ```java
   //链式编程
   @Override
   protected void configure(HttpSecurity http) throws Exception {
       // 首页所有人都可以访问，功能也只有对应有权限的人才能访问到
       // 配置请求授权的规则
   
       http.authorizeRequests()
           .antMatchers("/").permitAll()
           .antMatchers("/level1/**").hasRole("vip1")
           .antMatchers("/level2/**").hasRole("vip2")
           .antMatchers("/level3/**").hasRole("vip3");
   
   }
   ```

5. 测试一下：发现除了首页都进不去了！因为我们目前没有登录的角色，因为请求需要登录的角色拥有对应的权限才可以！

   ![image-20200728185841148](SpringBoot01：Hello,World！.assets/image-20200728185841148.png)

6. 在configure()方法中加入以下配置，开启自动配置的登录功能！

   ```java
   // 开启自动配置的登录功能
   // /login 请求来到登录页
   // /login?error 重定向到这里表示登录失败
   // 没有权限默认会到登录页面,需要开启登录的页面
   // /login页面
   http.formLogin()
       .usernameParameter("username")
       .passwordParameter("password")
       .loginPage("/toLogin")
       .loginProcessingUrl("/login");
   ```

   - **`http.formLogin()`**：启用表单登录功能。
   - **`usernameParameter("username")`**：指定表单中用户名字段的名称为 "username"。默认情况下，Spring Security 使用 "username" 作为用户名字段的名称，但这里明确指定。
   - **`passwordParameter("password")`**：指定表单中密码字段的名称为 "password"。默认情况下，Spring Security 使用 "password" 作为密码字段的名称，这里也做了明确指定。
   - **`loginPage("/toLogin")`**：指定自定义的登录页面 URL 为 "/toLogin"。用户未登录时会被重定向到这个页面。
   - **`loginProcessingUrl("/login")`**：指定登录表单提交的处理 URL 为 "/login"。当用户提交登录表单时，Spring Security 会处理该请求并进行身份验证。

7. 测试一下：发现，没有权限的时候，会跳转到登录的页面！

   ![image-20200728190113670](SpringBoot01：Hello,World！.assets/image-20200728190113670.png)

8. 查看刚才登录页的注释信息；

   我们可以定义认证规则，重写configure的另一个方法

   ![image-20200728190303746](SpringBoot01：Hello,World！.assets/image-20200728190303746.png)

   源码：

   ![image-20200728190840458](SpringBoot01：Hello,World！.assets/image-20200728190840458.png)

   仿写

   ```java
   // 认证，springboot 2.1.x 可以直接使用
   // 密码编码： PasswordEncoder
   @Override
   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
   
       //这些数据正常应该中数据库中读，现在我们模拟一下从内存中读
   
       auth.inMemoryAuthentication()
           .withUser("kuangshen").password("123456").roles("vip2","vip3")
           .and()
           .withUser("root").password("123456").roles("vip1","vip2","vip3")
           .and()
           .withUser("guest").password("123456").roles("vip1");
   }
   ```

9. 测试，我们可以使用这些账号登录进行测试！发现会报错！

   `There is no PasswordEncoder mapped for the id “null”`

   ![image-20200728204515545](SpringBoot01：Hello,World！.assets/image-20200728204515545.png)

   ![image-20200728204424570](SpringBoot01：Hello,World！.assets/image-20200728204424570.png)

10. 原因，我们要将前端传过来的密码进行某种方式加密，否则就无法登录，修改代码

    ```java
    // 认证，springboot 2.1.x 可以直接使用
    // 密码编码： PasswordEncoder
    // 在spring Secutiry 5.0+ 新增了很多加密方法
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    
        //这些数据正常应该中数据库中读
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
            .withUser("kuangshen").password(new BCryptPasswordEncoder().encode("123456")).roles("vip2","vip3")
            .and()
            .withUser("root").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2","vip3")
            .and()
            .withUser("guest").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1");
    }
    ```

11. 测试，发现，登录成功，并且每个角色只能访问自己认证下的规则！搞定

### 权限控制和注销

1. 开启自动配置的注销的功能

   ```java
   //定制请求的授权规则
   @Override
   protected void configure(HttpSecurity http) throws Exception {
      //....
      //开启自动配置的注销的功能
      // /logout 注销请求
      http.logout();
   }
   ```

2. 我们在前端，增加一个注销的按钮，`index.html `导航栏中

   ```html
   <!--注销-->
   <a class="item" th:href="@{/logout}">
       <i class="sign-out icon"></i> 注销
   </a>
   ```

3. 我们可以去测试一下，登录成功后点击注销，发现注销完毕会跳转到登录页面！

   ![image-20200728210246562](SpringBoot01：Hello,World！.assets/image-20200728210246562.png)

   ![image-20200728210323067](SpringBoot01：Hello,World！.assets/image-20200728210323067.png)

4. 但是，我们想让他注销成功后，依旧可以跳转到首页，该怎么处理呢？

   源码：

   ![image-20200728211500366](SpringBoot01：Hello,World！.assets/image-20200728211500366.png)

   ```java
   // .logoutSuccessUrl("/"); 注销成功来到首页
   http.logout().logoutSuccessUrl("/");
   ```

5. 测试，注销完毕后，发现跳转到首页OK

6. 我们现在又来一个需求：用户没有登录的时候，导航栏上只显示登录按钮，用户登录之后，导航栏可以显示登录的用户信息及注销按钮！还有就是，比如kuangshen这个用户，它只有 vip2，vip3功能，那么登录则只显示这两个功能，而vip1的功能菜单不显示！这个就是真实的网站情况了！该如何做呢？

   <font color=red>我们需要结合thymeleaf中的一些功能</font>

   `sec：authorize="isAuthenticated()"`:是否认证登录！来显示不同的页面

   Maven依赖：

   ```xml
   <!-- https://mvnrepository.com/artifact/org.thymeleaf.extras/thymeleaf-extras-springsecurity4 -->
   <dependency>
      <groupId>org.thymeleaf.extras</groupId>
      <artifactId>thymeleaf-extras-springsecurity5</artifactId>
      <version>3.0.4.RELEASE</version>
   </dependency>
   ```

   - 整合包4（springsecurity4）——springboot版本2.0.9
   - 整合包5（springsecurity5）——springboot版本之后

7. 修改我们的前端页面

   导入命名空间

   ```html
   <html lang="en" xmlns:th="http://www.thymeleaf.org"
         xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity5">
   ```

   修改导航栏，增加认证判断

   ```html
   <!--登录注销-->
   <div class="right menu">
   
       <!--如果未登录-->
       <div sec:authorize="!isAuthenticated()">
           <a class="item" th:href="@{/login}">
               <i class="address card icon"></i> 登录
           </a>
       </div>
   
       <!--如果已登录-->
       <div sec:authorize="isAuthenticated()">
           <a class="item">
               <i class="address card icon"></i>
               用户名：<span sec:authentication="principal.username"></span>
               角色：<span sec:authentication="principal.authorities"></span>
           </a>
       </div>
   
       <div sec:authorize="isAuthenticated()">
           <a class="item" th:href="@{/logout}">
               <i class="sign-out  icon"></i> 注销
           </a>
       </div>
   </div>
   ```

8. 重启测试，我们可以登录试试看，登录成功后确实，显示了我们想要的页面；

   - 未登录

     ![image-20200728213100804](SpringBoot01：Hello,World！.assets/image-20200728213100804.png)

   - 登录

     ![image-20200728213235625](SpringBoot01：Hello,World！.assets/image-20200728213235625.png)

9. 点击注销产生的问题

   - 整合包4（springsecurity4）

     ![image-20200728220414292](SpringBoot01：Hello,World！.assets/image-20200728220414292.png)

   - 整合包5（springsecurity5）（不算问题，需要点击确定，才能回到首页）

     ![image-20200728220517534](SpringBoot01：Hello,World！.assets/image-20200728220517534.png)

     ![image-20200728220531678](SpringBoot01：Hello,World！.assets/image-20200728220531678.png)

   <font color=red>解决问题：</font>

   - 它默认防止csrf跨站请求伪造，因为会产生安全问题
   - 将请求改为post表单提交
   - 在spring security中关闭csrf功能`http.csrf().disable();`

   再次点击注销按钮之后（直接退出到首页）

   ![image-20200728220835347](SpringBoot01：Hello,World！.assets/image-20200728220835347.png)

10. 我们继续将下面的角色功能块认证完成！

    ```html
    <!--菜单根据用户的角色动态的实现-->
    <div class="column"  sec:authorize="hasRole('vip1')">
        <div class="ui raised segment">
            <div class="ui">
                <div class="content">
                    <h5 class="content">Level 1</h5>
                    <hr>
                    <div><a th:href="@{/level1/1}"><i class="bullhorn icon"></i> Level-1-1</a></div>
                    <div><a th:href="@{/level1/2}"><i class="bullhorn icon"></i> Level-1-2</a></div>
                    <div><a th:href="@{/level1/3}"><i class="bullhorn icon"></i> Level-1-3</a></div>
                </div>
            </div>
        </div>
    </div>
    
    <div class="column"  sec:authorize="hasRole('vip2')">
        <div class="ui raised segment">
            <div class="ui">
                <div class="content">
                    <h5 class="content">Level 2</h5>
                    <hr>
                    <div><a th:href="@{/level2/1}"><i class="bullhorn icon"></i> Level-2-1</a></div>
                    <div><a th:href="@{/level2/2}"><i class="bullhorn icon"></i> Level-2-2</a></div>
                    <div><a th:href="@{/level2/3}"><i class="bullhorn icon"></i> Level-2-3</a></div>
                </div>
            </div>
        </div>
    </div>
    
    <div class="column"  sec:authorize="hasRole('vip3')">
        <div class="ui raised segment">
            <div class="ui">
                <div class="content">
                    <h5 class="content">Level 3</h5>
                    <hr>
                    <div><a th:href="@{/level3/1}"><i class="bullhorn icon"></i> Level-3-1</a></div>
                    <div><a th:href="@{/level3/2}"><i class="bullhorn icon"></i> Level-3-2</a></div>
                    <div><a th:href="@{/level3/3}"><i class="bullhorn icon"></i> Level-3-3</a></div>
                </div>
            </div>
        </div>
    </div>
    ```


11. 测试一下！

- 用户首页未登录

  ![image-20200728221453455](SpringBoot01：Hello,World！.assets/image-20200728221453455.png)

- 某个用户登录

  ![image-20200728221536116](SpringBoot01：Hello,World！.assets/image-20200728221536116.png)

- 权限控制和注销搞定！



### 记住我

现在的情况，我们只要登录之后，关闭浏览器，再登录，就会让我们重新登录，但是很多网站的情况，就是有一个记住密码的功能，这个该如何实现呢？很简单

1. 开启记住我功能

   ```java
   //定制请求的授权规则
   @Override
   protected void configure(HttpSecurity http) throws Exception {
   //。。。。。。。。。。。
      //开启记住我功能: cookie,默认保存两周
      http.rememberMe();
   }
   ```

2. 我们再次启动项目测试一下

   - 发现登录页多了一个记住我功能

     ![image-20200728222312694](SpringBoot01：Hello,World！.assets/image-20200728222312694.png)

   - 我们登录之后关闭 浏览器，然后重新打开浏览器访问，发现用户依旧存在！

     ![image-20200728222406216](SpringBoot01：Hello,World！.assets/image-20200728222406216.png)

     <font color=red>思考：如何实现的呢？其实非常简单</font>

     我们可以查看浏览器的cookie

     ![image-20200728222706154](SpringBoot01：Hello,World！.assets/image-20200728222706154.png)

3. 我们点击注销的时候，可以发现，spring security 帮我们自动删除了这个 cookie

   ![image-20200728223559077](SpringBoot01：Hello,World！.assets/image-20200728223559077.png)

4. cookie发送给浏览器保存，以后登录带上这个cookie，只要通过检查就可以免登录了。如果点击注销，则会删除这个cookie，具体的原理我们在JavaWeb阶段都讲过了，这里就不在多说了！

### 定制登录页

现在这个登录页面都是spring security 默认的，怎么样可以使用我们自己写的Login界面呢？

1. 在刚才的登录页配置后面指定 loginpage

   ```java
   protected void configure(HttpSecurity http) throws Exception {
       //......
   
       // 没有权限默认会到登录页面,需要开启登录的页面
       // /login页面
       http.formLogin().loginPage("/toLogin");
   
       //......
   }
   ```

2. 然后前端也需要指向我们自己定义的 login请求

   ```html
   <div sec:authorize="!isAuthenticated()">
       <a class="item" th:href="@{/toLogin}">
           <i class="address card icon"></i> 登录
       </a>
   </div>
   ```

3. 我们登录，需要将这些信息发送到哪里，我们也需要配置，login.html 配置提交请求及方式，方式必须为post:

   在 loginPage()源码中的注释上有写明：

   ![image-20200728224246393](SpringBoot01：Hello,World！.assets/image-20200728224246393.png)

4. 这个请求提交上来，我们还需要验证处理，怎么做呢？我们可以查看formLogin()方法的源码！我们配置接收登录的用户名和密码的参数！

   ![image-20200728224831116](SpringBoot01：Hello,World！.assets/image-20200728224831116.png)

   ```java
   protected void configure(HttpSecurity http) throws Exception {
       //......
   
       // 没有权限默认会到登录页面,需要开启登录的页面
       // /login页面
       http.formLogin()
         .usernameParameter("username")
         .passwordParameter("password")
         .loginPage("/toLogin")
         .loginProcessingUrl("/login"); // 登陆表单提交请求
   
       //......
   }
   ```

5. 在登录页增加记住我的多选框

   ```html
   <input type="checkbox" name="remember"> 记住我
   ```

6. 后端验证处理！

   ```java
   protected void configure(HttpSecurity http) throws Exception {
       //......
       //开启记住我功能: cookie,默认保存两周,自定义接收前端的参数
       http.rememberMe().rememberMeParameter("remember");
   }
   ```

7. 测试，OK

## 完整配置代码

```java
package nuc.ss.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// AOP:拦截器
@EnableWebSecurity  // 开启WebSecurity模式
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //链式编程
    //授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 首页所有人都可以访问，功能也只有对应有权限的人才能访问到
        // 请求授权的规则
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");

        // 没有权限默认会到登录页面,需要开启登录的页面
        // /login页面
        http.formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .loginPage("/toLogin")
                .loginProcessingUrl("/login");

        //注销,开启了注销功能,跳到首页
        http.logout().logoutSuccessUrl("/");

        // 防止网站工具：get，post
        http.csrf().disable();//关闭csrf功能，登录失败肯定存在的原因

        //开启记住我功能: cookie,默认保存两周,自定义接收前端的参数
        http.rememberMe().rememberMeParameter("remember");


    }

    // 认证，springboot 2.1.x 可以直接使用
    // 密码编码： PasswordEncoder
    // 在spring Secutiry 5.0+ 新增了很多加密方法
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        //这些数据正常应该中数据库中读
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("kuangshen").password(new BCryptPasswordEncoder().encode("123456")).roles("vip2","vip3")
                .and()
                .withUser("root").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1","vip2","vip3")
                .and()
                .withUser("guest").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1");
    }


}
```

