package com.shoppee.model.common;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by HuanTNH on 9/23/2016.
 */
public abstract class AbstractDao<PK extends Serializable, T> {

    private final Class<T> persistentClass;

    public AbstractDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
                .getActualTypeArguments()[1];
    }

    @Autowired
    private SessionFactory sessionFactory;

    public T getByKey(PK key) {
        return (T) getSession().get(persistentClass, key);
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void persist(T entity) {
        getSession().persist(entity);
    }

    protected Criteria createEntityCriteria() {
        return getSession().createCriteria(persistentClass);
    }

    public void delete(T entity) {
        getSession().delete(entity);
    }

    public void update(T entity) {
        getSession().update(entity);
    }

}
