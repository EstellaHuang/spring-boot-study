package io.github.estrellahuang.springbootwebflux1quickstart.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author Huang Yuxin
 * @date 2019-07-15
 */
@Component
public class CityHandler {

    public Mono<ServerResponse> helloCity(ServerRequest request){
        // Mono表示返回一个序列
        // ServerResponse是对响应的封装，可以设置响应状态、响应头、响应正文。
        // ok代表的是200响应码，MediaType枚举代表正文内容类型、如下代表：返回String的对象
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject("Hello ShangHai!你好上海！"));
    }
}
