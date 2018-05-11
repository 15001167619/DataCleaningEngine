package com.binggou.engine.modules.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.binggou.engine.modules.service.IMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 11:00
 */
@Service
public class MongoServiceImpl implements IMongoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<JSONObject> getMongoDataList(String tableName) {
        return mongoTemplate.find(new Query(), JSONObject.class, tableName);
    }

    @Override
    public void delMongoData(String key,String value, String tableName) {
        mongoTemplate.remove(new Query(Criteria.where(key).is(value)), tableName);
    }
}
