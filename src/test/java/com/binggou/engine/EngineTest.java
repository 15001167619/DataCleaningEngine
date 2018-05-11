package com.binggou.engine;

import com.alibaba.fastjson.JSONObject;
import com.binggou.engine.modules.entity.BgResourceCity;
import com.binggou.engine.modules.service.IBgResourceCityService;
import com.binggou.engine.modules.service.IMongoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 11:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class EngineTest {

    @Autowired
    private IMongoService mongoService;

    @Autowired
    private IBgResourceCityService cityService;


    @Test
    public void testDataConnect() {
        List<JSONObject> crawler = mongoService.getMongoDataList("crawler");
        System.out.println(crawler);

        List<BgResourceCity> cityList = cityService.getCityList();
        System.out.println(cityList);

    }

}
