package com.serwisaukcyjny.Serwis.Aukcyjny.service.impl;
import com.serwisaukcyjny.Serwis.Aukcyjny.model.Product;
import com.serwisaukcyjny.Serwis.Aukcyjny.repository.ProductRepository;
import com.serwisaukcyjny.Serwis.Aukcyjny.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> products() {
        return productRepository.findByMainPage(true);
    }

    @Override
    public Product product(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void removeProduct(Long id) {
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findByCategory(String name) {
        return productRepository.findByCategory(name);
    }

    @Override
    public BigDecimal sumProducts(Product product, ArrayList<Product> products) {
        System.out.println("Przed uruchomieniem listy");

        BigDecimal totalBasketValue = BigDecimal.valueOf(0);
        for (int i = 0; i < products.size(); i++) {
            totalBasketValue = products.get(i).getTotalValue().add(totalBasketValue);
            System.out.println("Wyswietlono" + totalBasketValue);
        }
        System.out.println("Po uruchomieniu listy");
        return totalBasketValue;
    }
}
