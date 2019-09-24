package com.serwisaukcyjny.Serwis.Aukcyjny.service;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.Product;
import org.springframework.security.core.userdetails.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public interface ProductService {
    List<Product> products();
    Product product(Long id);
    void removeProduct(Long id);
    Product addProduct(Product product);
    List<Product> findByCategory(String name);
    BigDecimal sumProducts(Product product, ArrayList<Product> products);
}
