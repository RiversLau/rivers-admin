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

import java.util.Date;
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

    @Override
    public void saveOrUpdateBrand(BrandVO brandVO) {

        // 进行校验，验证品牌名称是否重复，其他数据是否正确
        Brand brand = new Brand();
        brand.setName(brandVO.getName());
        brand.setDescription(brandVO.getDescription());
        brand.setLogoUrl(brandVO.getLogoUrl());
        brand.setStatus(brandVO.getStatus());
        brand.setCreateTime(new Date());
        brand.setUpdateTime(new Date());
        brandMapper.saveBrand(brand);
    }

    @Override
    public BrandVO getBrandById(Integer id) {

        BrandVO brand = brandMapper.getBrandById(id);
        return brand;
    }
}
