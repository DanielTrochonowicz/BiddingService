package com.serwisaukcyjny.Serwis.Aukcyjny.controllers;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.User;
import com.serwisaukcyjny.Serwis.Aukcyjny.service.ProductService;
import com.serwisaukcyjny.Serwis.Aukcyjny.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;

    @Autowired
    public UserController(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService=productService;
    }

    @PostMapping("/panel-registration")
    public String courseSuccess(@Valid
                                @ModelAttribute User user,
                                BindingResult bindingResult, Model model) {
        model.addAttribute("user", user);
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            return "panel-registration";
        }
        userService.save(user);
        return "registration-success";
    }

    @PostMapping("/registration-success")
    public String userRegistrationPost(@ModelAttribute User user) {
        userService.save(user);
        return "registration-success";
    }

    @GetMapping("/product-detail")
    public ModelAndView productDetail(@RequestParam("id") Long id){
        ModelAndView modelAndView = new ModelAndView("product-detail");
        modelAndView.addObject("product",productService.product(id) );
        return modelAndView;
    }
}
