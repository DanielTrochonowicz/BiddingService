package com.serwisaukcyjny.Serwis.Aukcyjny.service.impl;

import com.serwisaukcyjny.Serwis.Aukcyjny.model.Basket;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.Product;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.User;
import com.serwisaukcyjny.Serwis.Aukcyjny.repository.ProductRepository;
import com.serwisaukcyjny.Serwis.Aukcyjny.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BasketService {

    private UserRepository userRepository;
    private ProductRepository productRepository;

    public BasketService(UserRepository userRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    @Transactional
    public void addProduct(org.springframework.security.core.userdetails.User securityUser, long id) {
        User user = userRepository.findByEmail(securityUser.getUsername());
        Basket basket = user.getBasket();
        if (basket == null) {
            basket = new Basket();
            user.setBasket(basket);
        }
        boolean contains = user.getBasket().getProducts()
                .stream()
                .anyMatch(p -> p.getId().equals(id));
        if (!contains) {
            Product product = productRepository.getOne(id);
            basket.getProducts().add(product);
            userRepository.save(user);
        }
    }

    public List<Product> getUserProductsFromBasket(org.springframework.security.core.userdetails.User securityUser) {
        User user = userRepository.findByEmail(securityUser.getUsername());
        return user.getBasket().getProducts();
    }
}
