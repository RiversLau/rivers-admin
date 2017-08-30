package com.zhaoxiang.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Author: Rivers
 * Date: 2017/8/27 15:54
 */
@Getter
@Setter
public class BaseEntity implements Serializable {

    private Integer id;
    private Date createTime;
    private Date updateTime;
}
