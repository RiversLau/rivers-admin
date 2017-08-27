package com.zhaoxiang.service;

import com.zhaoxiang.vo.AdminVO;

/**
 * Author: Rivers
 * Date: 2017/8/27 15:57
 */
public interface AdminService {

    AdminVO getEnabledUserByUsername(String username);
}
