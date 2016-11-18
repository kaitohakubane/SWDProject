//package com.shoppee.model;
//
//import com.shoppee.entity.TypeEntity;
//import com.shoppee.model.common.AbstractDao;
//import org.hibernate.Criteria;
//import org.hibernate.criterion.Order;
//import org.hibernate.criterion.Restrictions;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
///**
// * Created by HuanTNH on 9/23/2016.
// */
//@Repository
//public class TypeModel extends AbstractDao<Integer, TypeEntity> implements TypeModelInterface {
//
//    @Override
//    public TypeEntity findTypeByTypeId(int typeId) {
//        TypeEntity typeEntity = getByKey(typeId);
//        if (typeEntity != null) {
//            return typeEntity;
//        }
//        return null;
//    }
//
//    @Override
//    public TypeEntity findTypeByTypeName(String typeName) {
//        Criteria criteria = createEntityCriteria();
//        criteria.add(Restrictions.eq("typeName", typeName));
//        TypeEntity typeEntity = (TypeEntity) criteria.uniqueResult();
//        if (typeEntity != null) {
//            return typeEntity;
//        }
//        return null;
//    }
//
//    @Override
//    public List<TypeEntity> findAllTypes() {
//        Criteria criteria = createEntityCriteria().addOrder(Order.asc("typeId"));
//        criteria.add(Restrictions.eq("enabled", true));
//        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
//        List<TypeEntity> types = (List<TypeEntity>) criteria.list();
//        return types;
//    }
//
//    @Override
//    public void saveType(TypeEntity typeEntity) {
//        persist(typeEntity);
//    }
//
//}
