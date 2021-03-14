package com.hgz.v17productservice;

import com.hgz.api.IproductService;
import com.hgz.entity.TProduct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class V17ProductServiceApplicationTests {

    @Autowired
    private IproductService iproductService;
    @Test
    void contextLoads() {
        TProduct tProduct = iproductService.selectByPrimaryKey(1L);
        System.out.println(tProduct.getName());
    }

}
