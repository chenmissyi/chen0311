package com.zzz.chen.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzz.chen.bean.BaseAttrInfo;
import com.zzz.chen.bean.BaseAttrValue;
import com.zzz.chen.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AttrController {

    @Reference
    AttrService attrService;

    @RequestMapping("saveAttr")
    @ResponseBody
    public String saveAttr(BaseAttrInfo baseAttrInfo){
        attrService.saveAttr(baseAttrInfo);
        return "sss";
    }

    @RequestMapping("getAttrList")
    @ResponseBody
    public List<BaseAttrInfo> getAttrList(String catalog3Id){
        List<BaseAttrInfo>  AttrLists = attrService.getAttrList(catalog3Id);
        return AttrLists;
    }

    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<BaseAttrValue> getAttrValueList(String catalog3Id){
        BaseAttrInfo  baseAttrInfo = attrService.getAttrInfo(catalog3Id);
        return baseAttrInfo.getAttrValueList();
    }
}
