package com.zhaoxiang.service;

import com.github.pagehelper.PageInfo;
import com.zhaoxiang.entity.Product;
import com.zhaoxiang.vo.ProductVO;

/**
 * Author: RiversLau
 * Date: 2017/8/31 9:53
 */
public interface ProductService {

    PageInfo<ProductVO> getStatusNotEqualList(Product.Status status);
}
