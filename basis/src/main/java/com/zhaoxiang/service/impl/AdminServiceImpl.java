package com.zhaoxiang.service.impl;

import com.zhaoxiang.mapper.AdminMapper;
import com.zhaoxiang.service.AdminService;
import com.zhaoxiang.vo.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: Rivers
 * Date: 2017/8/27 15:58
 */
@Service("/adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public AdminVO getEnabledUserByUsername(String username) {

        AdminVO admin = adminMapper.getStatusEqualUserByUsername(null);
        return admin;
    }
}
