package com.zhang.controller;

import com.zhang.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("product")
public class ProductController {
    @Resource
    private IProductService productService;

    @RequestMapping("getAllProducts")
    public String getAllProducts(HttpServletRequest request) {
        request.setAttribute("productList", productService.getAllProducts());
        return "/WEB-INF/product_list.jsp";
    }
}
