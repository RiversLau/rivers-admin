package com.zhaoxiang.service.impl;

import com.zhaoxiang.service.AdminService;
import com.zhaoxiang.vo.AdminVO;
import org.springframework.stereotype.Service;

/**
 * Author: Rivers
 * Date: 2017/8/27 15:58
 */
@Service("/adminService")
public class AdminServiceImpl implements AdminService {

    @Override
    public AdminVO getEnabledUserByUsername(String username) {

        return null;
    }
}
