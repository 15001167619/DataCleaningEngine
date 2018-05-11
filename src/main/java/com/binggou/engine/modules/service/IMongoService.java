package com.binggou.engine.modules.service;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 10:46
 */
public interface IMongoService {

    List<JSONObject> getMongoDataList(String tableName);

    void delMongoData(String key,String value,String tableName);

}
