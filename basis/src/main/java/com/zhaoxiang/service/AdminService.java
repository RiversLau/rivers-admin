package com.zhaoxiang.service;

import com.zhaoxiang.entity.Admin;
import com.zhaoxiang.vo.AdminVO;

/**
 * Author: Rivers
 * Date: 2017/8/27 15:57
 */
public interface AdminService {

    AdminVO getStatusEqualUserByUsername(String username, Admin.Status status);
}
