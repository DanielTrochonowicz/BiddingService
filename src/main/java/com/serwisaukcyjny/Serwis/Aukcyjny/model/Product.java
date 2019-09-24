package com.serwisaukcyjny.Serwis.Aukcyjny.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int quantity;
    private BigDecimal price;
    private BigDecimal totalValue;
    private String category;
    private Boolean mainPage;
    private String img;

    public Product() {
    }

    public Product(long id, String category, String name, String description, BigDecimal price, int quantity, Boolean mainPage, String img) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.mainPage = mainPage;
        this.img = img;
    }

    public BigDecimal getTotalValue() {
        totalValue=price.multiply(BigDecimal.valueOf(quantity));
        return totalValue;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getMainPage() {
        return mainPage;
    }

    public void setMainPage(Boolean mainPage) {
        this.mainPage = mainPage;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " +
                "Id: " + id +
                "Name: " + name + '\'' +
                "Description: " + description + '\'' +
                "Quantity: " + quantity +
                "Price: " + price +
                "TotalValue: " + totalValue;
    }
}
