package com.bnta.music_store.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.filter.HttpPutFormContentFilter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "purchases")
public class Purchase {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id") //creating a FK
    @JsonIgnoreProperties({"purchases"})
    private User user;

//    there can be many types of one product and can purchase many products that are the same
//    each product can belong to multiple purchases
    @ManyToMany()
    @JoinTable(
            name = "purchase_products",
            joinColumns = {@JoinColumn(name = "purchase_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "product_id", nullable = false)}
    )
    @JsonIgnoreProperties({"purchases"})
    private List<Product> products;

//    CONSTRUCTOR

    protected Purchase(){}

    public Purchase(User user, List<Product> products) {
        this.user = user;
        this.products = products;
    }

//    GETTERS & SETTERS
    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", user=" + user +
                ", products=" + products +
                '}';
    }
}
