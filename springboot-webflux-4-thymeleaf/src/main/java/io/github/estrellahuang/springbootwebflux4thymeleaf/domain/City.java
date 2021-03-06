package io.github.estrellahuang.springbootwebflux4thymeleaf.domain;

import lombok.Data;

/**
 * 城市实体类
 * @author Huang Yuxin
 * @date 2019-07-18
 */
@Data
public class City {
    /**
     * 城市编号
     */
    private Long id;
    /**
     * 省份编号
     */
    private Long provinceId;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 描述
     */
    private String description;
}
