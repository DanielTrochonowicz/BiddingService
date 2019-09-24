package com.serwisaukcyjny.Serwis.Aukcyjny.controllers;

import com.serwisaukcyjny.Serwis.Aukcyjny.model.Product;
import com.serwisaukcyjny.Serwis.Aukcyjny.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/admin")
@Controller
public class AdminController {

    @Autowired
    private ProductService productService;

    @GetMapping("create-product")
    public ModelAndView createProduct() {
        ModelAndView modelAndView = new ModelAndView("create-product");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("save-product")
    public ModelAndView addProduct(@ModelAttribute Product product) {
        productService.addProduct(product);
        return new ModelAndView("redirect:/admin/product-list");
    }

    @GetMapping("product-list")
    public ModelAndView getAllProducts() {
        ModelAndView modelAndView = new ModelAndView("product-list");
        modelAndView.addObject("products", productService.products());
        return modelAndView;
    }

    @GetMapping("panel-admin")
    public ModelAndView panelAdmin() {
        return new ModelAndView("panel-admin");
    }
}
