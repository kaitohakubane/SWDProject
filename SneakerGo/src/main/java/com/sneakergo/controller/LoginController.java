package com.shoppee.controller;

import com.shoppee.common.constants.PageConstant;
import com.shoppee.common.constants.UtilsConstant;
import com.shoppee.controller.interfaces.LoginControllerInterface;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by thanh on 16/9/2016.
 */
@Controller
public class LoginController implements LoginControllerInterface {

    @Override
    @RequestMapping(value = {PageConstant.LOGIN_PAGE_URL}, method = RequestMethod.GET)
    public ModelAndView initLoginPage() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        ModelAndView modelAndView;
        if (!name.equalsIgnoreCase(UtilsConstant.ANONYMOUS_USER)) {
            modelAndView = new ModelAndView(PageConstant.REDIRECT + PageConstant.ADMIN_ROOT_PATH_URL);
        } else {
            modelAndView = new ModelAndView(PageConstant.LOGIN_PAGE);
        }

        return modelAndView;
    }

}
