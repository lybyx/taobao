package com.lybxxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lybxxx
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView show(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("message","Hello SpringMVC");
        return mav;
    }
    @RequestMapping("/jump")
    public ModelAndView jump(){
        ModelAndView mav = new ModelAndView("redirect:/index");
        return mav;
    }
    @RequestMapping("/check")
    public ModelAndView check(HttpSession session){
        Integer i = (Integer) session.getAttribute("count");
        if(i == null){
            i = 0;
        }
        i++;
        session.setAttribute("count",i);
        ModelAndView mav = new ModelAndView("check");
        return mav;
    }
    @RequestMapping("/clear")
    public ModelAndView clear(HttpSession session){
        session.removeAttribute("count");
        ModelAndView mav = new ModelAndView("redirect:check");
        return mav;

    }
    @RequestMapping("/upload")
    public ModelAndView load(){
        ModelAndView mav = new ModelAndView("redirect:upload.jsp");
        return mav;
    }

}
