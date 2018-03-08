package com.zhang.mapper;

import com.zhang.domain.Product;

import java.util.List;

public interface ProductMapper {
    /**
     * 查询所有的商品数据
     * @return 所有的商品
     */
    List<Product> getAllProducts();
}
