package io.github.estrellahuang.springbootwebflux2crud.entity;

import lombok.Data;

/**
 * @author Huang Yuxin
 * @date 2019-07-15
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
     * 城市名
     */
    private String cityName;

    /**
     * 城市描述
     */
    private String description;
}
