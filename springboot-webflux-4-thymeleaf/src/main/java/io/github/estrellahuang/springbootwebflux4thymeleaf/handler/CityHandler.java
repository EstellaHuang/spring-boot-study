package io.github.estrellahuang.springbootwebflux4thymeleaf.handler;

import io.github.estrellahuang.springbootwebflux4thymeleaf.dao.CityRepository;
import io.github.estrellahuang.springbootwebflux4thymeleaf.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Huang Yuxin
 * @date 2019-07-18
 */
@Component
public class CityHandler {
    private final CityRepository cityRepository;

    @Autowired
    public CityHandler(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Mono<City> saveCity(City city){
        return cityRepository.save(city);
    }

    public Mono<City> findById(Long id){
        return cityRepository.findById(id);
    }

    public Flux<City> findAll(){
        return cityRepository.findAll();
    }

    public Mono<City> modifyCity(City city){
        return cityRepository.save(city);
    }

    public Mono<Long> deleteCity(Long id){
        cityRepository.deleteById(id);
        return Mono.create(cityMonoSink -> cityMonoSink.success(id));
    }
}
