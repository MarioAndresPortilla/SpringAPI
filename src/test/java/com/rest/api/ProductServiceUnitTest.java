package com.rest.api;

import com.rest.api.entity.Product;
import com.rest.api.services.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceUnitTest {

    @Autowired
    private ProductService productService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Product> products = productService.list();

        Assert.assertEquals(products.size(), 9);
    }
}

