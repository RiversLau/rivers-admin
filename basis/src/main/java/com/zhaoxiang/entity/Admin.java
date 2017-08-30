package com.zhaoxiang.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Author: Rivers
 * Date: 2017/8/27 15:55
 */
@Getter
@Setter
public class Admin extends BaseEntity {

    private String phone;
    private String username;
    private String password;
    private String headImageUrl;
}
