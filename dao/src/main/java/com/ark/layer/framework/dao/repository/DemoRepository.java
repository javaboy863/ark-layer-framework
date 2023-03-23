package com.ark.layer.framework.dao.repository;

import com.ark.layer.framework.dao.domain.DemoDo;
import com.ark.layer.framework.dao.repository.db.DemoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DemoRepository  {

    @Autowired
    private DemoMapper demoMapper;


    public DemoDo queryById(Long id) {
        return  demoMapper.queryById(id);
    }

}
