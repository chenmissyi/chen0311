package com.zzz.chen.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzz.chen.bean.BaseCatalog1;
import com.zzz.chen.bean.BaseCatalog2;
import com.zzz.chen.bean.BaseCatalog3;
import com.zzz.chen.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CatalogController {

    @Reference
    CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatalog1(){
        List<BaseCatalog1> getCatalog1s = catalogService.getCatalog1();
        return getCatalog1s;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> getCatalog2(String catalog1Id){
        List<BaseCatalog2> getCatalog2s = catalogService.getCatalog2(catalog1Id);
        return getCatalog2s;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        List<BaseCatalog3> getCatalog3s = catalogService.getCatalog3(catalog2Id);
        return getCatalog3s;
    }
}
