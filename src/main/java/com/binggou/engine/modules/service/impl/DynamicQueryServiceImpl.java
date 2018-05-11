package com.binggou.engine.modules.service.impl;

import com.binggou.engine.modules.service.DynamicQueryService;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 16:06
 */
@Repository
public class DynamicQueryServiceImpl implements DynamicQueryService {

    @PersistenceContext
    private EntityManager em;

    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    public void save(Object entity) {
        em.persist(entity);
    }

    @Override
    public void update(Object entity) {
        em.merge(entity);
    }

    @Override
    public <T> void delete(Class<T> entityClass, Object entityid) {
        delete(entityClass, new Object[] { entityid });
    }

    @Override
    public <T> void delete(Class<T> entityClass, Object[] entityids) {
        for (Object id : entityids) {
            em.remove(em.getReference(entityClass, id));
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> List<T> nativeQueryList(String nativeSql, Object... params) {
        Query q = createNativeQuery(nativeSql, params);
        q.unwrap(SQLQuery.class).setResultTransformer(Transformers.TO_LIST);
        return q.getResultList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> List<T> nativeQueryListMap(String nativeSql, Object... params) {
        Query q = createNativeQuery(nativeSql, params);
        q.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        return q.getResultList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> List<T> nativeQueryListModel(Class<T> resultClass, String nativeSql, Object... params) {
        Query q = createNativeQuery(nativeSql, params);
        q.unwrap(SQLQuery.class).setResultTransformer(Transformers.aliasToBean(resultClass));
        return q.getResultList();
    }

    @Override
    public Long nativeQueryCount(String nativeSql, Object... params) {
        Object count = createNativeQuery(nativeSql, params).getSingleResult();
        return ((Number) count).longValue();
    }

    private Query createNativeQuery(String sql, Object... params) {
        Query q = em.createNativeQuery(sql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                q.setParameter(i + 1, params[i]);
            }
        }
        return q;
    }

}
