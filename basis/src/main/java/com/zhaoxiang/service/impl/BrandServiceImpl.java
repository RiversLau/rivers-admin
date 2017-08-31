package com.zhaoxiang.service.impl;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaoxiang.entity.Brand;
import com.zhaoxiang.mapper.BrandMapper;
import com.zhaoxiang.service.BrandService;
import com.zhaoxiang.vo.BrandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: RiversLau
 * Date: 2017/8/31 15:09
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public PageInfo<BrandVO> getStatusNotEqualList(Brand.Status status) {

        final Map<String, Object> params = new HashMap<>();
        params.put("status", status.ordinal());

        PageInfo<BrandVO> pageInfo = PageHelper.startPage(1, 10).doSelectPageInfo(new ISelect() {
            @Override
            public void doSelect() {
                brandMapper.getStatusNotEqualList(params);
            }
        });

        return pageInfo;
    }
}
