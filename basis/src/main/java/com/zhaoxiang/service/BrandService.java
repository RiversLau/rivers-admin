package com.zhaoxiang.service;

import com.github.pagehelper.PageInfo;
import com.zhaoxiang.entity.Brand;
import com.zhaoxiang.vo.BrandVO;

/**
 * Author: RiversLau
 * Date: 2017/8/31 15:09
 */
public interface BrandService {

    /**
     * 获取Not Equal品牌列表
     * @param status
     * @return
     */
    PageInfo<BrandVO> getStatusNotEqualList(Brand.Status status);

    /**
     * 添加或更新品牌信息
     * @param brandVO
     */
    void saveOrUpdateBrand(BrandVO brandVO);

    /**
     * 通过ID获取品牌信息
     * @param id
     * @return
     */
    BrandVO getBrandById(Integer id);
}
