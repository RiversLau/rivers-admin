package com.zhaoxiang.vo;

import com.zhaoxiang.utils.JodaTimeUtil;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Author: Rivers
 * Date: 2017/8/27 16:40
 */
@Setter
public class BaseVO implements Serializable {

    private @Getter Integer id;
    private @Getter Date createTime;
    private @Getter Date updateTime;

    private String createTimeStr;
    private String updateTimeStr;

    public String getCreateTimeStr() {
        if (createTime != null) {
            createTimeStr = JodaTimeUtil.long2YYYY_MM_DDHHMMSS(createTime);
        }
        return createTimeStr;
    }

    public String getUpdateTimeStr() {
        if (updateTime != null) {
            updateTimeStr = JodaTimeUtil.long2YYYY_MM_DDHHMMSS(updateTime);
        }
        return updateTimeStr;
    }
}
