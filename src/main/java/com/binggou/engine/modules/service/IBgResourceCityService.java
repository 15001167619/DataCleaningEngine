package com.binggou.engine.modules.service;

import com.baomidou.mybatisplus.service.IService;
import com.binggou.engine.modules.entity.BgResourceCity;

import java.util.List;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 10:46
 */
public interface IBgResourceCityService extends IService<BgResourceCity> {

    List<BgResourceCity> getCityList();

}
