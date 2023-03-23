package com.ark.layer.framework.dao.repository.db;//package com.quantgroup.saas.repository.dao.mapper;

import com.ark.layer.framework.dao.domain.DemoDo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 京港地铁线表 Mapper 接口
 * </p>
 * @author mac
 */
public interface DemoMapper extends BaseMapper<DemoDo> {

    DemoDo queryById(Long id);


}
