package com.hgz.v17center.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hgz.api.IproductService;
import com.hgz.entity.TProduct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("product")
public class ProductController {
    @Reference
    private IproductService iproductService;

    @RequestMapping("get/{id}")
    @ResponseBody
    public TProduct getById(@PathVariable("id") Long id){
        return iproductService.selectByPrimaryKey(id);
    }

    @RequestMapping("list")
    public String list(){
        return "product/list";
    }
}
