package io.github.estrellahuang.swaggerdemo.pojo;

import lombok.Data;

/**
 * 生物类
 * @author Huang Yuxin
 * @date 2019-07-31
 */
@Data
public class Creature {

    /**
     * 生物id
     */
    private Long id;

    /**
     * 域
     */
    private String domain;

    /**
     * 界
     */
    private String kingdom;

    /**
     * 门
     */
    private String phylum;

    /**
     * 纲
     */
    private String aClass;

    /**
     * 目
     */
    private String order;

    /**
     * 科
     */
    private String family;

    /**
     * 属
     */
    private String genus;

    /**
     * 种
     */
    private String species;

}
