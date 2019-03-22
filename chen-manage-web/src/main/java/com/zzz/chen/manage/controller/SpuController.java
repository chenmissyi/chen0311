package com.zzz.chen.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzz.chen.bean.SpuInfo;
import com.zzz.chen.service.AttrService;
import com.zzz.chen.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SpuController {

    @Reference
    SpuService spuService;

    @RequestMapping("spuList")
    @ResponseBody
    public List<SpuInfo> getSpuList(String catalog3Id){

        return spuService.getSpuList(catalog3Id);
    }
}
