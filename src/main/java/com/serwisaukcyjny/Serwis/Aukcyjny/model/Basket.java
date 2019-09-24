package com.serwisaukcyjny.Serwis.Aukcyjny.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User user;
    @OneToMany
    private List<Product> products = new ArrayList<>();
    private BigDecimal totalBasketValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getTotalBasketValue() {
        return totalBasketValue;
    }

    public void setTotalBasketValue(BigDecimal totalBasketValue) {
        this.totalBasketValue = totalBasketValue;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(id, basket.id) &&
                Objects.equals(user, basket.user) &&
                Objects.equals(products, basket.products) &&
                Objects.equals(totalBasketValue, basket.totalBasketValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, products, totalBasketValue);
    }
}
