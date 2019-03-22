package com.zzz.chen.manage.sevice.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.zzz.chen.bean.BaseCatalog1;
import com.zzz.chen.bean.BaseCatalog2;
import com.zzz.chen.bean.BaseCatalog3;
import com.zzz.chen.manage.mapper.Catalog1Mapper;
import com.zzz.chen.manage.mapper.Catalog2Mapper;
import com.zzz.chen.manage.mapper.Catalog3Mapper;
import com.zzz.chen.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    Catalog1Mapper catalog1Mapper;
    @Autowired
    Catalog2Mapper catalog2Mapper;
    @Autowired
    Catalog3Mapper catalog3Mapper;

    @Override
    public List<BaseCatalog1> getCatalog1() {
        List<BaseCatalog1> getCatalog1s = catalog1Mapper.selectAll();
        return getCatalog1s;
    }

    @Override
    public List<BaseCatalog2> getCatalog2(String catalog1Id) {
        BaseCatalog2 Catalog2 = new BaseCatalog2();
        Catalog2.setCatalog1Id(catalog1Id);
        List<BaseCatalog2> select = catalog2Mapper.select(Catalog2);
        return select;
    }

    @Override
    public List<BaseCatalog3> getCatalog3(String catalog2Id) {
        BaseCatalog3 Catalog3 = new BaseCatalog3();
        Catalog3.setCatalog2Id(catalog2Id);
        List<BaseCatalog3> select = catalog3Mapper.select(Catalog3);
        return select;
    }
}
