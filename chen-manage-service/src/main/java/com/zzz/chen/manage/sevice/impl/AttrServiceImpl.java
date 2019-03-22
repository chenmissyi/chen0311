package com.zzz.chen.manage.sevice.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzz.chen.bean.BaseAttrInfo;
import com.zzz.chen.bean.BaseAttrValue;
import com.zzz.chen.manage.mapper.AttrInfoMapper;
import com.zzz.chen.manage.mapper.AttrValueMapper;
import com.zzz.chen.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    AttrInfoMapper attrInfoMapper;
    @Autowired
    AttrValueMapper attrValueMapper;

    @Override
    public List<BaseAttrInfo> getAttrList(String catalog3Id) {
        BaseAttrInfo baseAttrInfo = new BaseAttrInfo();
        baseAttrInfo.setCatalog3Id(catalog3Id);
        List<BaseAttrInfo> AttrLists = attrInfoMapper.select(baseAttrInfo);
        return AttrLists;
    }

    @Override
    public void saveAttr(BaseAttrInfo baseAttrInfo) {
        //配合GeneratedValue注解使用  作用1  有几个参数就添加几个参数
        attrInfoMapper.insertSelective(baseAttrInfo);

        List<BaseAttrValue> baseAttrValueList = baseAttrInfo.getAttrValueList();

        for (BaseAttrValue attrValue : baseAttrValueList) {
            attrValue.setAttrId(baseAttrInfo.getId());
            System.out.println(attrValue.getValueName()+"1");
            attrValueMapper.insertSelective(attrValue);
        }
    }

    @Override
    public BaseAttrInfo getAttrInfo(String catalog3Id) {

        return attrInfoMapper.selectByPrimaryKey(catalog3Id);
    }
}
