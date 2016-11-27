package com.sneakergo.controller;

import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.ParamConstant;
import com.sneakergo.common.constants.UtilsConstant;
import com.sneakergo.common.utils.FileUtils;
import com.sneakergo.common.utils.NumbericUtils;
import com.sneakergo.common.utils.StringUtils;
import com.sneakergo.entity.ProductEntity;
import com.sneakergo.entity.SaleDisplayEntity;
import com.sneakergo.entity.SaleEntity;
import com.sneakergo.service.interfaces.SaleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Hung on 11/27/2016.
 */
@Controller
public class SaleController {
    @Autowired
    SaleServiceInterface saleServiceInterface;

    @RequestMapping(value = PageConstant.SALE_PAGE_URL, method = RequestMethod.GET)
    public ModelAndView initSalePage() {
        ModelAndView modelAndView = new ModelAndView(PageConstant.SALE_PAGE);
        Date currentDate = NumbericUtils.getCurrentDate();
        List<SaleDisplayEntity> listSale = saleServiceInterface.getSaleByTime(currentDate);
        modelAndView.addObject(ParamConstant.LIST_SALE_ATTR, listSale).
                addObject(ParamConstant.CURRENT_DATE,currentDate);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = PageConstant.CREATE_SALE_URL, method = RequestMethod.POST)
    public boolean createSale(@RequestParam(value = ParamConstant.PRODUCT_ID) int productId,
                            @RequestParam(value = ParamConstant.SALE_PERCENT) int salePercent,
                            @RequestParam(value = ParamConstant.FROM_DATE) String fromDate,
                            @RequestParam(value = ParamConstant.TO_DATE) String toDate) {
        try {
            SaleEntity saleEntity = new SaleEntity();
            saleEntity.setProductId(productId);
            saleEntity.setSalePercent(salePercent);
            saleEntity.setEnabled(true);
            String[] from = StringUtils.formatDate(fromDate);
            String[] to = StringUtils.formatDate(toDate);
            saleEntity.setFromDate(NumbericUtils.getDate(from[UtilsConstant.TWO],
                    from[UtilsConstant.ONE], from[UtilsConstant.ZERO]));
            saleEntity.setToDate(NumbericUtils.getDate(to[UtilsConstant.TWO],
                    to[UtilsConstant.ONE], to[UtilsConstant.ZERO]));
            saleServiceInterface.createSave(saleEntity);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
