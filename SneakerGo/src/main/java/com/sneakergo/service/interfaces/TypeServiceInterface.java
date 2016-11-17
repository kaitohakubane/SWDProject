package com.shoppee.service.interfaces;

import com.shoppee.entity.TypeEntity;

import java.util.List;

/**
 * Created by HuanTNH on 9/25/2016.
 */
public interface TypeServiceInterface {

    TypeEntity findTypeByTypeId(int typeId);

    TypeEntity findTypeByTypeName(String typeName);

    List<TypeEntity> findAllTypes();

    void saveType(TypeEntity typeEntity);

    void updateType(TypeEntity typeEntity);

    void removeType(TypeEntity typeEntity);

}
