package com.zhaoxiang.vo;

import com.zhaoxiang.entity.Brand;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: RiversLau
 * Date: 2017/8/31 15:08
 */
@Getter
@Setter
public class BrandVO extends BaseVO {

    private String name;
    private String logoUrl;
    private String description;

    private Brand.Status status;
}
