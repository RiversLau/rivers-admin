package com.zhaoxiang.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Author: RiversLau
 * Date: 2017/8/31 14:17
 */
@Getter
@Setter
public class Product extends BaseEntity {

    /**
     * DELETED:0，已删除
     * SHELF_OFF:1，下架
     * SHELF_ON:2，上架
     */
    public enum Status {
        DELETED, SHELF_OFF, SHELF_ON
    }

    private String name;
    private String code;
    private Integer brandId;
    private String productAbstract;
    private String description;
    private Status status;
    private String icon;
    private Integer evaluateNum;
    private Double price;
    private Double marketPrice;
    private Integer orderNum;
}
