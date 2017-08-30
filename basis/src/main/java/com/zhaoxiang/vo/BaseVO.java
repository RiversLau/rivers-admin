package com.zhaoxiang.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Author: Rivers
 * Date: 2017/8/27 16:40
 */
@Getter
@Setter
public class BaseVO implements Serializable {

    private Integer id;
    private Date createTime;
    private Date updateTime;
}
