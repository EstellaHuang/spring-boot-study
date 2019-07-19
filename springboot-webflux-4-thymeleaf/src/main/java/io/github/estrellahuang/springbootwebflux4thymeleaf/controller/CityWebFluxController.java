package io.github.estrellahuang.springbootwebflux4thymeleaf.controller;

import io.github.estrellahuang.springbootwebflux4thymeleaf.domain.City;
import io.github.estrellahuang.springbootwebflux4thymeleaf.handler.CityHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Huang Yuxin
 * @date 2019-07-18
 */
@RestController
@RequestMapping(value = "/city")
public class CityWebFluxController {

    @Autowired
    private CityHandler cityHandler;

    @GetMapping("/id")
    public Mono<City> findCityById(@PathVariable("id") Long id){
        return cityHandler.findById(id);
    }

    @GetMapping()
    public Flux<City> findAllCity(){
        return cityHandler.findAll();
    }

    @PostMapping()
    public Mono<City> saveCity(@RequestBody City city){
        return cityHandler.saveCity(city);
    }

    @PutMapping()
    public Mono<City> modifyCity(@RequestBody City city) {
        return cityHandler.modifyCity(city);
    }

    @DeleteMapping(value = "/{id}")
    public Mono<Long> deleteCity(@PathVariable("id") Long id) {
        return cityHandler.deleteCity(id);
    }

}
