package com.zzz.chen.service;

import com.zzz.chen.bean.BaseAttrInfo;

import java.util.List;

public interface AttrService {
    List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttr(BaseAttrInfo baseAttrInfo);

    BaseAttrInfo getAttrInfo(String catalog3Id);
}
