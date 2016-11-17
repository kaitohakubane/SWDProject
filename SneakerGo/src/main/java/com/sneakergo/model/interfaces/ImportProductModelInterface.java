package com.shoppee.model.interfaces;

import com.shoppee.entity.ImportProductEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
public interface ImportProductModelInterface {

    ImportProductEntity findImportProductByImportProductId(int importProductId);

    List<ImportProductEntity> findAllImportProducts();

    void saveImportProduct(ImportProductEntity importProductEntity);

}
