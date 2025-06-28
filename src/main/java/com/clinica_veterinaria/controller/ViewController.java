package com.clinica_veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
    @RequestMapping("/home")
    @ResponseBody
    public ModelAndView home(){
        return new ModelAndView("redirect:/index.html");

    }
}
