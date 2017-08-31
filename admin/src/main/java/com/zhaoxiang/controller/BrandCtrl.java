package com.zhaoxiang.controller;

import com.github.pagehelper.PageInfo;
import com.zhaoxiang.entity.Brand;
import com.zhaoxiang.service.BrandService;
import com.zhaoxiang.vo.BrandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author: RiversLau
 * Date: 2017/8/31 14:58
 */
@Controller
@RequestMapping("/brand")
public class BrandCtrl {

    @Autowired
    private BrandService brandService;

    @RequestMapping("/list")
    public ModelAndView listBrand() {

        PageInfo<BrandVO> pageInfo = brandService.getStatusNotEqualList(Brand.Status.DELETED);

        ModelAndView mv = new ModelAndView("brand_list");
        mv.addObject("pageInfo", pageInfo);

        return mv;
    }
}
