package io.github.estrellahuang.springbootwebflux2crud.controller;

import io.github.estrellahuang.springbootwebflux2crud.entity.City;
import io.github.estrellahuang.springbootwebflux2crud.handler.CityHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Huang Yuxin
 * @date 2019-07-15
 */
@RestController
@RequestMapping("/city")
public class CityWebFluxController {

    @Autowired
    private CityHandler cityHandler;

    @GetMapping("/{id}")
    public Mono<City> findCityById(@PathVariable("id") Long id){
        return cityHandler.findCityById(id);
    }
    @GetMapping()
    public Flux<City> findAllCity(){
        return cityHandler.findAllCity();
    }

    @PostMapping()
    public Mono<Long> saveCity(@RequestBody City city){
        return cityHandler.save(city);
    }

    @DeleteMapping("/{id}")
    public Mono<Long> deleteCity(@PathVariable("id") Long id){
        return cityHandler.deleteCity(id);
    }

}
