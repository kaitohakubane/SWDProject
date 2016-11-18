//package com.shoppee.controller;
//
//import com.shoppee.common.constants.PageConstant;
//import com.shoppee.common.constants.ParamConstant;
//import com.shoppee.controller.interfaces.TypeControllerInterface;
//import com.shoppee.entity.ProductEntity;
//import com.shoppee.entity.TypeEntity;
//import com.shoppee.service.interfaces.TypeServiceInterface;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
///**
// * Created by HuanTNH on 9/26/2016.
// */
//@RestController
//public class TypeController implements TypeControllerInterface {
//
//    @Autowired
//    private TypeServiceInterface typeServiceInterface;
//
//    @Override
//    @RequestMapping(value = PageConstant.TYPE_PAGE_URL, method = RequestMethod.GET)
//    public ModelAndView initTypePage() {
//        List<TypeEntity> listType = typeServiceInterface.findAllTypes();
//
//        ModelAndView modelAndView = new ModelAndView(PageConstant.TYPE_PAGE);
//        modelAndView.addObject(ParamConstant.LIST_TYPE_ATTR, listType);
//
//        return modelAndView;
//    }
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.LIST_TYPE_URL, method = RequestMethod.GET)
//    public List<TypeEntity> listAllTypes() {
//        return typeServiceInterface.findAllTypes();
//    }
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.CREATE_TYPE_URL, method = RequestMethod.POST)
//    public boolean createType(@RequestParam(value = ParamConstant.TYPE_NAME) String typeName) {
//        try {
//            TypeEntity type = new TypeEntity();
//            type.setTypeName(typeName);
//            type.setEnabled(true);
//
//            typeServiceInterface.saveType(type);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.EDIT_TYPE_URL, method = RequestMethod.POST)
//    public boolean updateType(@RequestParam(value = ParamConstant.TYPE_ID) int typeId, @RequestParam(value = ParamConstant.TYPE_NAME) String typeName) {
//        TypeEntity currentType = typeServiceInterface.findTypeByTypeId(typeId);
//
//        if (currentType != null) {
//            currentType.setTypeName(typeName);
//
//            typeServiceInterface.updateType(currentType);
//            return true;
//        }
//
//        return false;
//    }
//
//    @Override
//    @ResponseBody
//    @RequestMapping(value = PageConstant.REMOVE_TYPE_URL, method = RequestMethod.POST)
//    public boolean deleteType(@RequestParam(value = ParamConstant.TYPE_ID) int typeId) {
//        TypeEntity currentType = typeServiceInterface.findTypeByTypeId(typeId);
//
//        if (currentType != null) {
//            currentType.setEnabled(false);
//
//            typeServiceInterface.removeType(currentType);
//            return true;
//        }
//
//        return false;
//    }
//
//}
