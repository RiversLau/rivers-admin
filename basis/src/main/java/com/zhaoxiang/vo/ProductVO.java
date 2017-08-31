package com.zhaoxiang.vo;

import com.zhaoxiang.entity.Product;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: RiversLau
 * Date: 2017/8/31 14:41
 */
@Getter
@Setter
public class ProductVO extends BaseVO {

    private String name;
    private String code;
    private String productAbstract;
    private String description;
    private Product.Status status;
    private String icon;
    private Integer evaluateNum;
    private Double price;
    private Double marketPrice;
    private Integer orderNum;
}
