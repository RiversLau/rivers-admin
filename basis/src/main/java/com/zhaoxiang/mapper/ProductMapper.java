package com.zhaoxiang.mapper;

import com.zhaoxiang.vo.ProductVO;

import java.util.List;
import java.util.Map;

/**
 * Author: RiversLau
 * Date: 2017/8/31 14:46
 */
public interface ProductMapper {

    List<ProductVO> getStatusNotEqualList(Map<String, Object> params);
}
