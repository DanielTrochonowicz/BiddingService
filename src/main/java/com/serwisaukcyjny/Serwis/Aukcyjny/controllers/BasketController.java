package com.serwisaukcyjny.Serwis.Aukcyjny.controllers;

import com.serwisaukcyjny.Serwis.Aukcyjny.service.impl.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasketController {

    private BasketService basketService;
    @Autowired
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("panel-basket")
    public ModelAndView basketPanel() {
        return new ModelAndView("panel-basket");
    }

    @PostMapping("panel-basket")
    public ModelAndView basketPanelPost(@RequestParam Long id, Authentication authentication){
        User user = (User) authentication.getPrincipal();
        basketService.addProduct(user, id);

        ModelAndView modelAndView = new ModelAndView("panel-basket");
        modelAndView.addObject("products", basketService.getUserProductsFromBasket(user));
        return modelAndView;
    }
}
