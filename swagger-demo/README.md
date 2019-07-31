# Springboot整合Swagger

## 五步整合步骤（maven版）- 5分钟
1、引入swagger相关坐标

```xml
 <!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.9.2</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger2 -->
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.9.2</version>
        </dependency>
```

2、编写配置类

```java
/**
 * swagger配置类
 * @author Huang Yuxin
 * @date 2019-07-30
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("io.github.estrellahuang"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("springboot利用swagger构建api文档")
                .description("简单优雅的restful风格")
                .termsOfServiceUrl("https://github.com/springfox/springfox-demos")
                .version("1.0")
                .build();
    }
}

```

3、编写API接口

```java
/**
 * hello测试类
 * @author Huang Yuxin
 * @date 2019-07-31
 */
@RestController
public class HelloController {

    @ApiOperation(value = "say hello", notes = "测试小demo")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World! 你好呀！";
    }
}

```

4、启动项目，访问http://localhost:8080/swagger-ui.html查看接口

![Screen Shot 2019-07-31 at 4.30.23 PM](/Users/huangyuxin/Desktop/Screen Shot 2019-07-31 at 4.30.23 PM.png)

5、编写RESTful风格接口，代码见github，运行接口如下：

![Screen Shot 2019-07-31 at 4.35.59 PM](/Users/huangyuxin/Desktop/Screen Shot 2019-07-31 at 4.35.59 PM.png)