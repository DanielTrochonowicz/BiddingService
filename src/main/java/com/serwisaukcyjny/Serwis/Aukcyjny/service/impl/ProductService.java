package com.serwisaukcyjny.Serwis.Aukcyjny.service.impl;

import com.serwisaukcyjny.Serwis.Aukcyjny.model.Product;
import com.serwisaukcyjny.Serwis.Aukcyjny.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> searchProduct(String searchText, String searchParameter) {
        if (searchText.isEmpty()) {
            return productRepository.findAll();
        } else {
            switch (searchParameter) {
                case "name":
                    return productRepository.findByNameContaining(searchText);
                case "price":
                    return productRepository.findByPrice(searchText);
                default:
                    return productRepository.findAll();
            }
        }
    }
}
