package com.zhaoxiang.mapper;

import com.zhaoxiang.vo.AdminVO;

import java.util.Map;

/**
 * Author: Rivers
 * Date: 2017/8/27 15:57
 */
public interface AdminMapper {

    AdminVO getStatusEqualUserByUsername(Map<String, Object> params);
}
