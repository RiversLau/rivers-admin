package com.zhaoxiang.vo;

import com.zhaoxiang.entity.Admin;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: Rivers
 * Date: 2017/8/27 16:40
 */
@Getter
@Setter
public class AdminVO extends BaseVO {

    private String phone;
    private String username;
    private String password;
    private String headImageUrl;
    private Admin.Status status;
}
