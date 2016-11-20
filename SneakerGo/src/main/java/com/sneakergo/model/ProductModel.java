package com.sneakergo.model;

import com.sneakergo.entity.ProductEntity;
import com.sneakergo.model.common.CommonDAO;
import com.sneakergo.model.interfaces.ProductModelInterface;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Hung on 11/17/2016.
 */

@Repository
public class ProductModel extends CommonDAO implements ProductModelInterface {

    @Override
    public ProductEntity getProductByID(int productID) {
        ProductEntity productEntity = getSession().get(ProductEntity.class, productID);
        return productEntity;
    }

    @Override
    public List<ProductEntity> getProductByName(String productName) {
        Criteria criteria=getSession().createCriteria(ProductEntity.class).add(Restrictions.eq("productName","%"+productName+"%"));
        List<ProductEntity> searchResult=criteria.list();
        return searchResult;
    }

    @Override
    public List<ProductEntity> getAllProduct() {
        Criteria criteria = getSession().createCriteria(ProductEntity.class).add(Restrictions.eq("enabled", true));
        List<ProductEntity> productList = criteria.list();
        return productList;
    }

    @Override
    public boolean addProduct(ProductEntity product) {
        if (getProductByID(product.getProductId()) == null) {
            getSession().persist(product);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateProduct(ProductEntity product) {
        if (getProductByID(product.getProductId()) != null) {
            getSession().merge(product);
            getSession().saveOrUpdate(product);
            return true;
        }
        return false;
    }


}
