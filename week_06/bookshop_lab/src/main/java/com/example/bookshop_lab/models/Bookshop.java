package com.example.bookshop_lab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity //defines that a class can be mapped to a table
@Table(name = "bookshops")
public class Bookshop {

    @Id //PK for the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //PK generation strategy to use - specifies how to generate values for the given column
    @Column
    private Long id;

    @ManyToOne
    @JoinColumn(name ="customer_id")//creating an FK
    @JsonIgnoreProperties({"bookshops"})
    //todo: add JoinColumn and JSON
    private Customer customer;

    @ManyToMany
    @JoinTable( // specifies table name by name attribute, as well as the FK column
            name = "bookshop_books",
            joinColumns = {@JoinColumn(name="bookshop_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "book_id", nullable = false)}
    )
    @JsonIgnoreProperties({"bookshops"})
    //todo: add JoinTable and JSON
    private List<Book> books;

//    CONSTRUCTORS

    protected Bookshop(){}

    public Bookshop(Customer customer, List<Book> books) {
        this.customer = customer;
        this.books = books;
    }

//    GETTERS & SETTERS

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Bookshop{" +
                "id=" + id +
                ", customer=" + customer +
                ", books=" + books +
                '}';
    }
}
