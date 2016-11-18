//package com.shoppee.model;
//
//import com.shoppee.entity.ProductEntity;
//import com.shoppee.entity.SaleProductEntity;
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
//public class SaleProductModel extends AbstractDao<Integer, SaleProductEntity> implements SaleProductModelInterface {
//
//    @Override
//    public void saveSaleProduct(SaleProductEntity saleProductEntity) {
//        persist(saleProductEntity);
//    }
//
//    @Override
//    public List<SaleProductEntity> findAllSaleProducts() {
//        Criteria criteria = createEntityCriteria().addOrder(Order.asc("saleProductId"));
//        List<SaleProductEntity> saleProducts = (List<SaleProductEntity>) criteria.list();
//        return saleProducts;
//    }
//
//    @Override
//    public SaleProductEntity findSaleProductsByProduct(ProductEntity product) {
//        Criteria criteria = createEntityCriteria();
//        criteria.add(Restrictions.eq("productByProductId", product));
//        return (SaleProductEntity) criteria.uniqueResult();
//    }
//
//    @Override
//    public void deleteSaleProduct(SaleProductEntity saleProductEntity) {
//        delete(saleProductEntity);
//    }
//
//    @Override
//    public void updateSaleProduct(SaleProductEntity saleProductEntity) {
//        update(saleProductEntity);
//    }
//
//}
