package com.zhaoxiang.controller;

import com.zhaoxiang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String listProduct() {

        return "product_list";
    }
}
