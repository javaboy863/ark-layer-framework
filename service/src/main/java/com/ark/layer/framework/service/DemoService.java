package com.ark.layer.framework.service;


import com.ark.layer.framework.api.request.DemoRequest;
import com.ark.layer.framework.dao.domain.DemoDo;
import com.ark.layer.framework.dao.repository.DemoRepository;
import com.ark.layer.framework.domain.entity.Demo;
import com.ark.layer.framework.domain.util.DeepConvertUtil;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service()
@Slf4j
public class DemoService  {

    @Resource
    private DemoRepository demoRepository;


    public Demo getDemo(DemoRequest req) {
        DemoDo demoDo = demoRepository.queryById(req.getId());
        return DeepConvertUtil.deepCopy(demoDo, Demo.class);
    }

}
