package com.zhaoxiang.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Author: RiversLau
 * Date: 2017/8/31 15:07
 */
@Getter
@Setter
public class Brand extends BaseEntity {

    /**
     * DELETED: 对应0，删除
     * FORBIDDEN：对应1，禁用
     * AVAILABLE：对应2，可用
     */
    public enum Status {
        DELETED, FORBIDDEN, AVAILABLE
    }

    private String name;
    private String logoUrl;
    private String description;

    private Status status;
}
