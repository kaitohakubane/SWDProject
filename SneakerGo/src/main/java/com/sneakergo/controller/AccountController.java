package com.sneakergo.controller;


import com.sneakergo.common.constants.PageConstant;
import com.sneakergo.common.constants.UtilsConstant;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by HuanTNH on 9/27/2016.
 */
@RestController
public class AccountController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getAccount() {
        ModelAndView modelAndView;
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        if (!name.equalsIgnoreCase(UtilsConstant.ANONYMOUS_USER)) {
            modelAndView = new ModelAndView(PageConstant.REDIRECT + PageConstant.HOME_PAGE_URL);
        } else {
            modelAndView = new ModelAndView(PageConstant.LOGIN_PAGE);
        }

        return modelAndView;
    }


}
