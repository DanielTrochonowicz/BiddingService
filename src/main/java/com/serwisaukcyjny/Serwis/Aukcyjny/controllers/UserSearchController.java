package com.serwisaukcyjny.Serwis.Aukcyjny.controllers;

import com.serwisaukcyjny.Serwis.Aukcyjny.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserSearchController {

    @Autowired
    private ProductService productService;

    @PostMapping("/page-main")
    public ModelAndView searchProduct(@RequestParam String searchText){
        ModelAndView modelAndView = new ModelAndView("page-main");
        modelAndView.addObject("products", productService.searchProduct(searchText, "name"));
        return modelAndView;
    }
}
