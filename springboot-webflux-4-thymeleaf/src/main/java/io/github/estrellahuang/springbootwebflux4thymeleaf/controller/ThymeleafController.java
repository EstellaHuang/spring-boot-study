package io.github.estrellahuang.springbootwebflux4thymeleaf.controller;

import io.github.estrellahuang.springbootwebflux4thymeleaf.domain.City;
import io.github.estrellahuang.springbootwebflux4thymeleaf.handler.CityHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 使用引擎模版api
 * @author Huang Yuxin
 * @date 2019-07-18
 */
@Controller
public class ThymeleafController {

    @Autowired
    private CityHandler cityHandler;

    @GetMapping("/hello")
    public Mono<String> hello(final Model model){
        model.addAttribute("name","欣哥");
        model.addAttribute("city","上海");

        String path = "hello";
        return Mono.create(stringMonoSink -> stringMonoSink.success(path));
    }

    private static final String CITY_LIST_LIST_PATH_NAME = "cityList";

    @GetMapping("/page/list")
    public String listPage(final Model model){
        final Flux<City> cityFluxList = cityHandler.findAll();
        model.addAttribute("cityList",cityFluxList);
        return CITY_LIST_LIST_PATH_NAME;
    }

}
