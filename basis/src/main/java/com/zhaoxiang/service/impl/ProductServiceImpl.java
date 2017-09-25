package com.zhaoxiang.service.impl;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaoxiang.entity.Product;
import com.zhaoxiang.mapper.ProductMapper;
import com.zhaoxiang.service.ProductService;
import com.zhaoxiang.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: RiversLau
 * Date: 2017/8/31 9:53
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public PageInfo<ProductVO> getStatusNotEqualList(Product.Status status) {

        final Map<String, Object> params = new HashMap<>();
        params.put("status", status.ordinal());

        PageInfo<ProductVO> pageInfo = PageHelper.startPage(1, 10).doSelectPageInfo(new ISelect() {
            @Override
            public void doSelect() {
                productMapper.getStatusNotEqualList(params);
            }
        });
        return pageInfo;
    }
}
