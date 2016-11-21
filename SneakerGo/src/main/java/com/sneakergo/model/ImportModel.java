package com.sneakergo.model;

import com.sneakergo.entity.ImportEntity;
import com.sneakergo.model.common.CommonDAO;
import com.sneakergo.model.interfaces.ImportModelInterface;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import java.sql.Date;
import java.util.List;

/**
 * Created by Hung on 11/20/2016.
 */
public class ImportModel extends CommonDAO implements ImportModelInterface {

    @Override
    public void importProduct(ImportEntity importEntity) {
        getSession().persist(importEntity);
    }

    @Override
    public List<ImportEntity> getImportByStockId(int stockID){
        Criteria criteria=getSession().createCriteria(ImportEntity.class).add(Restrictions.eq("stockId",stockID));
        List<ImportEntity> imports=criteria.list();
        return imports;
    }

    @Override
    public List<ImportEntity> getImportFromTimeToTime(Date fromTime,Date toTime){
        Criteria criteria=getSession().createCriteria(ImportEntity.class).add(Restrictions
                .lt("importDate",toTime)).add(Restrictions.ge("importDate",toTime));
        List<ImportEntity> imports=criteria.list();
        return imports;
    }
}
