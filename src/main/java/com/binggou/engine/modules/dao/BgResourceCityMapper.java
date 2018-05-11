package com.binggou.engine.modules.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.binggou.engine.modules.entity.BgResourceCity;

import java.util.List;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 11:30
 */
public interface BgResourceCityMapper extends BaseMapper<BgResourceCity> {

    List<BgResourceCity> findList();

}
