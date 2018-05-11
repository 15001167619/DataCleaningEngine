package com.binggou.engine.modules.service;

import java.util.List;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 16:04
 */
public interface DynamicQueryService {

    public void save(Object entity);

    public void update(Object entity);

    public <T> void delete(Class<T> entityClass, Object entityid);

    public <T> void delete(Class<T> entityClass, Object[] entityids);

    /**
     * 查询对象列表，返回List
     * @param resultClass
     * @param nativeSql
     * @param params
     * @return  List<T>
     */
    <T> List<T> nativeQueryList(String nativeSql, Object... params);

    /**
     * 查询对象列表，返回List<Map<key,value>>
     * @param nativeSql
     * @param params
     * @return  List<T>
     */
    <T> List<T> nativeQueryListMap(String nativeSql, Object... params);

    /**
     * 查询对象列表，返回List<组合对象>
     * @param resultClass
     * @param nativeSql
     * @param params
     * @return  List<T>
     */
    <T> List<T> nativeQueryListModel(Class<T> resultClass, String nativeSql, Object... params);

    /**
     * 执行nativeSql统计查询
     * @param nativeSql
     * @param params 占位符参数(例如?1)绑定的参数值
     * @return 统计条数
     */
    Long nativeQueryCount(String nativeSql, Object... params);

}
