package com.ericpercoski.homework3;

import com.ericpercoski.homework3.Models.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    ProductRepo productRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
    ModelAndView mv = new ModelAndView("index");
    mv.addObject("productList", productRepo.findAll());

    return mv;
    }
}
