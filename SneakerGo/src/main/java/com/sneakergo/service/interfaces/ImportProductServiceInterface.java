package com.shoppee.service.interfaces;

import com.shoppee.entity.ImportProductEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/25/2016.
 */
public interface ImportProductServiceInterface {

    ImportProductEntity findImportProductByImportProductId(int importProductId);

    List<ImportProductEntity> findAllImportProducts();

    void saveImportProduct(ImportProductEntity importProductEntity);

    void updateImportProduct(ImportProductEntity importProductEntity);

    void removeImportProduct(ImportProductEntity importProductEntity);

}
