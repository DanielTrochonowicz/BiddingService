package com.serwisaukcyjny.Serwis.Aukcyjny.controllers;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.User;
import com.serwisaukcyjny.Serwis.Aukcyjny.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PanelController {

    @Autowired
    public ProductService productService;

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("redirect:page-main");
    }

    @GetMapping("page-main")
    public ModelAndView createProduct1() {
        ModelAndView modelAndView = new ModelAndView("page-main");
        modelAndView.addObject("products", productService.products());
        return modelAndView;
    }

    @GetMapping("/panel-login")
    public ModelAndView UserLogin() {
        return new ModelAndView("panel-login");
    }

    @GetMapping("/panel-registration")
    public String userRegistration(Model model) {
        model.addAttribute("user", new User());
        return "panel-registration";
    }

    @GetMapping("/panel/{category}")
    public ModelAndView panelProduct(@PathVariable String category) {
        ModelAndView modelAndView = new ModelAndView("panel-category");
        modelAndView.addObject("products", productService.findByCategory(category));
        return modelAndView;
    }
}
