package io.github.estrellahuang.springbootwebflux1quickstart.router;

import io.github.estrellahuang.springbootwebflux1quickstart.handler.CityHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.io.UnsupportedEncodingException;

/**
 * @author Huang Yuxin
 * @date 2019-07-15
 */
@Configuration
public class CityRouter {

    /**
     * RouterFunctions 为请求路由处理类，即将请求路由到处理器，
     * 这里将一个GET请求/hello路由到处理器cityHandler的helloCity方法上。
     * 跟SpringMVC模式下的HandlerMapping的作用类似。
     * RouterFunctions.route(RequestPredicate, HandlerFunction)
     *
     * @param cityHandler
     * @return
     */
    @Bean
    public RouterFunction<ServerResponse> routeCity(CityHandler cityHandler){
        return RouterFunctions.route(RequestPredicates.GET("/hello")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                cityHandler::helloCity);
    }
}
