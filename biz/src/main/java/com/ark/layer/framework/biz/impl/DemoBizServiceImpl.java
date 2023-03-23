package com.ark.layer.framework.biz.impl;


import com.ark.layer.framework.api.IDemoService;
import com.ark.layer.framework.api.request.DemoRequest;
import com.ark.layer.framework.api.response.DemoResponse;
import com.ark.layer.framework.api.response.Result;
import com.ark.layer.framework.domain.entity.Demo;
import com.ark.layer.framework.domain.util.DeepConvertUtil;
import com.ark.layer.framework.service.DemoService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service()
@Slf4j
public class DemoBizServiceImpl implements IDemoService {

    @Resource
    private DemoService demoService;


    @Override
    public Result<DemoResponse> getDemo(DemoRequest req) {
        Demo demo = demoService.getDemo(req);
        return Result.success(DeepConvertUtil.deepCopy(demo, DemoResponse.class));
    }

}
