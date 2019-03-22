package com.zzz.chen.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("spuListPage")
    public String spuListPage() {
        return "spuListPage";
    }

    @RequestMapping("attrListPage")
    public String attrListPage() {
        return "attrListPage";
    }

    @RequestMapping("index")
    public String Index() {
        return "index";
    }


}
