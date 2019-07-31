package io.github.estrellahuang.swaggerdemo.Controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
