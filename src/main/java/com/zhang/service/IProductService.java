package com.zhang.service;

import com.zhang.domain.Product;

import java.util.List;

public interface IProductService {
    /**
     * 获得所有的商品
     * @return 所有的商品
     */
    List<Product> getAllProducts();
}
