package com.binggou.engine.modules.service;

import com.binggou.engine.modules.entity.QuartzEntity;

import java.util.List;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 16:01
 */
public interface IDataEngineJobService {

    List<QuartzEntity> listQuartzEntity(QuartzEntity quartz, Integer pageNo, Integer pageSize);

    Long listQuartzEntity(QuartzEntity quartz);

}
