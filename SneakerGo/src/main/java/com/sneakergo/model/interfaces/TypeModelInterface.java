package com.shoppee.model.interfaces;

import com.shoppee.entity.TypeEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/23/2016.
 */
public interface TypeModelInterface {

    TypeEntity findTypeByTypeId(int typeId);

    TypeEntity findTypeByTypeName(String typeName);

    List<TypeEntity> findAllTypes();

    void saveType(TypeEntity typeEntity);

}
