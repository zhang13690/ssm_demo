package com.zhang.test;

import com.zhang.domain.Product;
import com.zhang.mapper.ProductMapper;
import com.zhang.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class ServiceTest {
    // 注入需要的属性
    @Resource
    private IProductService productService;
    @Resource
    private ProductMapper productMapper;

    @Test
    @Transactional
    public void testService() {
        List<Product> employee = productService.getAllProducts();
        System.out.println(employee);
    }

    @Test
    @Transactional
    public void testDao() {
        List<Product> employee = productMapper.getAllProducts();
        System.out.println(employee);
    }

}
