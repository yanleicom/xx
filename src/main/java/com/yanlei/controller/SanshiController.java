package com.yanlei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SanshiController {
    @RequestMapping("/sanshi")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("sanshi");
        return modelAndView;
    }
    @RequestMapping("/once")
    public ModelAndView once(){
        ModelAndView modelAndView = new ModelAndView("once");
        return modelAndView;
    }
    @RequestMapping("/terrace")
    public ModelAndView terrace(){
        ModelAndView modelAndView = new ModelAndView("terrace");
        return modelAndView;
    }
    @RequestMapping("/zhengwu")
    public ModelAndView zhengwu(){
        ModelAndView modelAndView = new ModelAndView("zhengwu");
        return modelAndView;
    }
}
