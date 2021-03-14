package com.hgz.v17productservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.hgz.api.IproductService;
import com.hgz.commons.base.BaseServiceImpl;
import com.hgz.commons.base.IBaseDao;
import com.hgz.entity.TProduct;
import com.hgz.mapper.TProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductServiceImpl extends BaseServiceImpl<TProduct> implements IproductService {
    @Override
    public IBaseDao<TProduct> getBaseDao() {
        return tProductMapper;
    }

    @Autowired
    private TProductMapper tProductMapper;

}
