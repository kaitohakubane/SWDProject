package com.shoppee.model;

import com.shoppee.entity.ImportProductEntity;
import com.shoppee.model.common.AbstractDao;
import com.shoppee.model.interfaces.ImportProductModelInterface;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
@Repository
public class ImportProductModel extends AbstractDao<Integer, ImportProductEntity> implements ImportProductModelInterface {

    @Override
    public ImportProductEntity findImportProductByImportProductId(int importProductId) {
        ImportProductEntity importProductEntity = getByKey(importProductId);
        if (importProductEntity != null) {
            return importProductEntity;
        }
        return null;
    }

    @Override
    public List<ImportProductEntity> findAllImportProducts() {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("enabled", true));
        List<ImportProductEntity> importProducts = (List<ImportProductEntity>) criteria.list();
        return importProducts;
    }

    @Override
    public void saveImportProduct(ImportProductEntity importProductEntity) {
        persist(importProductEntity);
    }

}
