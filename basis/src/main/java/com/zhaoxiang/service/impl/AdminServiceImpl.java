package com.zhaoxiang.service.impl;

import com.zhaoxiang.entity.Admin;
import com.zhaoxiang.mapper.AdminMapper;
import com.zhaoxiang.service.AdminService;
import com.zhaoxiang.vo.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Rivers
 * Date: 2017/8/27 15:58
 */
@Service("/adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public AdminVO getStatusEqualUserByUsername(String username, Admin.Status status) {

        Map<String, Object> params = new HashMap<>();
        params.put("username", username);
        params.put("status", status.ordinal());
        AdminVO admin = adminMapper.getStatusEqualUserByUsername(params);
        return admin;
    }
}
