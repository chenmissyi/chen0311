package com.zzz.chen.manage.sevice.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzz.chen.bean.SpuInfo;
import com.zzz.chen.manage.mapper.SpuInfoMapper;
import com.zzz.chen.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    SpuInfoMapper spuInfoMapper;

    @Override
    public List<SpuInfo> getSpuList(String catalog3Id) {
        SpuInfo spuInfo = new SpuInfo();
        spuInfo.setCatalog3Id(catalog3Id);

        return spuInfoMapper.select(spuInfo);
    }
}
