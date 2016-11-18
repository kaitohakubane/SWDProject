//package com.shoppee.service;
//
//import com.shoppee.entity.TypeEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
///**
// * Created by HuanTNH on 9/25/2016.
// */
//@Service
//@Transactional
//public class TypeService implements TypeServiceInterface {
//
//    @Autowired
//    private TypeModelInterface typeModelInterface;
//
//    @Override
//    public TypeEntity findTypeByTypeId(int typeId) {
//        return typeModelInterface.findTypeByTypeId(typeId);
//    }
//
//    @Override
//    public TypeEntity findTypeByTypeName(String typeName) {
//        return typeModelInterface.findTypeByTypeName(typeName);
//    }
//
//    @Override
//    public List<TypeEntity> findAllTypes() {
//        return typeModelInterface.findAllTypes();
//    }
//
//    @Override
//    public void saveType(TypeEntity typeEntity) {
//        typeModelInterface.saveType(typeEntity);
//    }
//
//    @Override
//    public void updateType(TypeEntity typeEntity) {
//        TypeEntity type = typeModelInterface.findTypeByTypeId(typeEntity.getTypeId());
//        if (type != null) {
//            type.setTypeName(typeEntity.getTypeName());
//        }
//    }
//
//    @Override
//    public void removeType(TypeEntity typeEntity) {
//        TypeEntity type = typeModelInterface.findTypeByTypeId(typeEntity.getTypeId());
//        if (type != null) {
//            type.setEnabled(typeEntity.getEnabled());
//        }
//    }
//
//}
