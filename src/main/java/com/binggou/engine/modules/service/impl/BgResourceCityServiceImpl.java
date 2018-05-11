package com.binggou.engine.modules.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.binggou.engine.modules.dao.BgResourceCityMapper;
import com.binggou.engine.modules.entity.BgResourceCity;
import com.binggou.engine.modules.service.IBgResourceCityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 11:00
 */
@Service
public class BgResourceCityServiceImpl extends ServiceImpl<BgResourceCityMapper, BgResourceCity> implements IBgResourceCityService {

    @Resource
    private BgResourceCityMapper bgResourceCityMapper;

    @Override
    public List<BgResourceCity> getCityList() {
        return bgResourceCityMapper.findList();
    }
}
