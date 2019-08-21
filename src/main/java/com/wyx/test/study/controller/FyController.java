package com.wyx.test.study.controller;

import com.wyx.test.study.Service.FyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.Map;

@RestController
public class FyController {

    @Autowired
    private FyService fyService;

    @RequestMapping("/fyxx")
    public Map<String,Object> getFyxx(){
        return fyService.getFyInfo();
    }
}
