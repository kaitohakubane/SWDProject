package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import com.sneakergo.common.constants.UtilsConstant;
import com.sneakergo.common.utils.NumbericUtils;
import com.sneakergo.entity.ImportDisplayEntity;
import com.sneakergo.entity.ProductEntity;
import com.sneakergo.service.interfaces.ImportServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.List;

/**
 * Created by Hung on 11/27/2016.
 */
@Controller
public class ImportController {
    @Autowired
    ImportServiceInterface importServiceInterface;

    @RequestMapping(value = PageConstant.IMPORT_PAGE_URL, method = RequestMethod.GET)
    public ModelAndView initProductPage() {
        Date currentDate= NumbericUtils.getCurrentDate();
        Date aMonthAgo=NumbericUtils.getNDateBeforeDate(UtilsConstant.THIRTY);
        List<ImportDisplayEntity> listImport = importServiceInterface.getImportByTime(aMonthAgo,currentDate);
        ModelAndView modelAndView = new ModelAndView(PageConstant.IMPORT_PAGE);
        modelAndView.addObject(ParamConstant.LIST_IMPORT_ATTR, listImport).addObject(ParamConstant.FROM_DATE,aMonthAgo)
        .addObject(ParamConstant.TO_DATE,currentDate);
        return modelAndView;
    }

}
