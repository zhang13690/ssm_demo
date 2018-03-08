package com.zhang.service.impl;

import com.zhang.domain.Product;
import com.zhang.mapper.ProductMapper;
import com.zhang.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements IProductService {

    @Resource(name = "productMapper")
    private ProductMapper productMapper;

    @Override
    public List<Product> getAllProducts() {
        return productMapper.getAllProducts();
    }
}
