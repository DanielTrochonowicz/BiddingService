package com.serwisaukcyjny.Serwis.Aukcyjny.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Bidding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Auction auction;
    @OneToOne
    private User user;
    private BigDecimal amount;

    public Bidding(Long id, Auction auction, User user, BigDecimal amount) {
        this.id = id;
        this.auction = auction;
        this.user = user;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
