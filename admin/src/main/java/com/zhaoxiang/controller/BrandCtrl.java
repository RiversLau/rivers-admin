package com.zhaoxiang.controller;

import com.github.pagehelper.PageInfo;
import com.zhaoxiang.entity.Brand;
import com.zhaoxiang.service.BrandService;
import com.zhaoxiang.vo.BrandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/edit")
    public String saveOrEditBrand() {

        return "brand_edit";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView saveOrEditBrand(@PathVariable Integer id) {

        BrandVO brand = brandService.getBrandById(id);

        ModelAndView mv = new ModelAndView("brand_edit");
        mv.addObject("brand", brand);
        return mv;
    }

    @RequestMapping("/save")
    public String saveOrUpdateBrand(BrandVO brandVO) {

        brandService.saveOrUpdateBrand(brandVO);
        return "redirect:/brand/list";
    }
}
