package com.example.bookshop_lab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id //PK for the book class
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String title;

    @Column
    private Float price;

    //todo: fill in mappedBy and add JSON annotation
    @ManyToMany(mappedBy = "books")
//    mappedBy instructs JPA not to create another join table - indicstes which entity owns the relationship
    @JsonIgnoreProperties({"books"})
    private List<Bookshop> bookshops;

//    CONSTRUCTORS

    protected Book(){}

    public Book(String name, String title, Float price) {
        this.name = name;
        this.title = title;
        this.price = price;
        this.bookshops = new ArrayList<Bookshop>();
    }

//    GETTERS & SETTERS

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public List<Bookshop> getBookshops() {
        return bookshops;
    }

    public void setBookshops(List<Bookshop> bookshops) {
        this.bookshops = bookshops;
    }

    public void addBookshop(Bookshop bookshop){
        this.bookshops.add(bookshop);
    }

    public boolean removeBookshop(Bookshop bookshop){
        return this.bookshops.remove(bookshop);
    }

    @Override //returns the String representation of the object
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", bookshops=" + bookshops +
                '}';
    }
}
