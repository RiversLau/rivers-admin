package com.zhaoxiang.mapper;

import com.zhaoxiang.vo.BrandVO;

import java.util.List;
import java.util.Map;

/**
 * Author: RiversLau
 * Date: 2017/8/31 15:13
 */
public interface BrandMapper {

    List<BrandVO> getStatusNotEqualList(Map<String, Object> params);
}
