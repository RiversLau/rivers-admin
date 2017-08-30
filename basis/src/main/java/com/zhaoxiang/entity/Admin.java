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

    /**
     * DELETED: 对应0，删除
     * FORBIDDEN：对应1，禁用
     * AVAILABLE：对应2，可用
     */
    public enum Status {
        DELETED, FORBIDDEN, AVAILABLE
    }

    private Status status;
    private String phone;
    private String username;
    private String password;
    private String headImageUrl;
}
