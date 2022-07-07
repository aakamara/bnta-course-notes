package com.example.bookshop_lab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "customer")
    @JsonIgnoreProperties({"customers"})
    //todo: fill in mappedBy and add JSON
    private List<Bookshop> bookshops;

//    CONSTRUCTORS

    protected Customer(){}

    public Customer(String name) {
        this.name = name;
        this.bookshops = new ArrayList<>();
    }

//    GETTERS & SETTERS

    public Long getId() {
        return id;
    } //setting the id for us

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bookshop> getBookshops() {
        return bookshops;
    }

    public void setBookshops(List<Bookshop> bookshops) {
        this.bookshops = bookshops;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bookshops=" + bookshops +
                '}';
    }
}
