package com.jl.sample.apisamples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
    
    private static final String INDEX = "/index";

    @GetMapping(INDEX)
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

}
