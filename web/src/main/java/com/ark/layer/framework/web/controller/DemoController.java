package com.ark.layer.framework.web.controller;

import com.ark.layer.framework.api.IDemoService;
import com.ark.layer.framework.api.request.DemoRequest;
import com.ark.layer.framework.api.response.DemoResponse;
import com.ark.layer.framework.api.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private IDemoService demoService;



    @RequestMapping("/demo")
    public Result<DemoResponse> getDemo(@RequestBody DemoRequest req){
        return demoService.getDemo(req);
    }


}
