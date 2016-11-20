package com.sneakergo.model;

import com.sneakergo.entity.ImportEntity;
import com.sneakergo.entity.StockEntity;
import com.sneakergo.model.common.CommonDAO;
import com.sneakergo.model.interfaces.ImportModelInterface;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by Hung on 11/20/2016.
 */
public class ImportModel extends CommonDAO implements ImportModelInterface {

    @Override
    public void importProduct(ImportEntity importEntity) {
        getSession().persist(importEntity);
    }
}
