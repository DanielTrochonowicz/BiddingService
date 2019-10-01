package com.serwisaukcyjny.Serwis.Aukcyjny.model;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
public class Auction {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @OneToOne
    private Category category;
    private BigDecimal minAmount;
    private String location;
    private LocalDateTime auctionBeginning;
    private LocalDateTime auctionFinish;
    private int views;

    public Auction(Long id, String title, String description, Category category, BigDecimal minAmount,
                   String location, LocalDateTime auctionBeginning, LocalDateTime auctionFinish, int views) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.minAmount = minAmount;
        this.location = location;
        this.auctionBeginning = auctionBeginning;
        this.auctionFinish = auctionFinish;
        this.views = views;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getAuctionBeginning() {
        return auctionBeginning;
    }

    public void setAuctionBeginning(LocalDateTime auctionBeginning) {
        this.auctionBeginning = auctionBeginning;
    }

    public LocalDateTime getAuctionFinish() {
        return auctionFinish;
    }

    public void setAuctionFinish(LocalDateTime auctionFinish) {
        this.auctionFinish = auctionFinish;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
