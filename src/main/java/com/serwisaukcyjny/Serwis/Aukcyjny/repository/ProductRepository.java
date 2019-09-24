package com.serwisaukcyjny.Serwis.Aukcyjny.repository;

import com.serwisaukcyjny.Serwis.Aukcyjny.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> getByName(String name);
    List<Product> getByQuantity(String quantity);
    List<Product> getByPrice(String price);

    List<Product> findByNameContaining(String name);

    List<Product> findByCategory(String name);

    List<Product> findByMainPage(boolean mainPage);

    List<Product> findByPrice(String price);

    @Query("select u from Product u where (:name is null or u.name = :name)" +
            "and (:price is null or u.price= :price)")
    List<Product> search (@Param("name") String name,
                          @Param("price") String price);
}
