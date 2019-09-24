package com.serwisaukcyjny.Serwis.Aukcyjny.controllers;

import com.serwisaukcyjny.Serwis.Aukcyjny.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/admin")
@Controller
public class AdminSearchController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product-list")
    public ModelAndView searchProduct(@RequestParam String searchText,
                                @RequestParam String searchParameter){
        ModelAndView modelAndView = new ModelAndView("product-list");
        modelAndView.addObject("products", productService.searchProduct(searchText, searchParameter));
        return modelAndView;
    }
}
