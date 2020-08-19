package com.lybxxx.controller;

import com.lybxxx.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lybxxx
 */
@Controller
public class ProductController  {
   @RequestMapping("/addProduct")
    public ModelAndView add(Product product) {
       ModelAndView mav = new ModelAndView("showProduct");
        return mav;
    }
}
