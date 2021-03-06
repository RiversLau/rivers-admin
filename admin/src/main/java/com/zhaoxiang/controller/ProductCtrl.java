package com.zhaoxiang.controller;

import com.github.pagehelper.PageInfo;
import com.zhaoxiang.entity.Product;
import com.zhaoxiang.service.ProductService;
import com.zhaoxiang.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author: RiversLau
 * Date: 2017/8/31 9:52
 */
@Controller
@RequestMapping("/product")
public class ProductCtrl {

    @Autowired
    private ProductService productService;

    @RequestMapping("/list")
    public ModelAndView listProduct() {

        PageInfo<ProductVO> pageInfo = productService.getStatusNotEqualList(Product.Status.DELETED);

        ModelAndView mv = new ModelAndView("/product_list");
        mv.addObject("pageInfo", pageInfo);

        return mv;
    }
}
