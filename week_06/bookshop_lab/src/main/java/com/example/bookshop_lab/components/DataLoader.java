package com.example.bookshop_lab.components;

import com.example.bookshop_lab.models.Book;
import com.example.bookshop_lab.models.Bookshop;
import com.example.bookshop_lab.models.Customer;
import com.example.bookshop_lab.repositories.BookRepository;
import com.example.bookshop_lab.repositories.BookshopRepository;
import com.example.bookshop_lab.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
// generic stereotype for any Spring-managed component
public class DataLoader implements ApplicationRunner {

    @Autowired // wires application parts together and spring's dependencies injection mechanism wires appropriate beans into the class memebrs
    private BookRepository bookRepository;

    @Autowired
    private BookshopRepository bookshopRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override //informs the compiler that the element is meant to override an element declared as a superclass - helps prevent errors
    public void run(ApplicationArguments args) throws Exception {
//        Add some books
        Book book1 = new Book("Julia Donaldson", "The Highway Rat", (float)12.99);
        Book book2 = new Book("Julia Donaldson", "The Gruffalo", (float)14.99);
        Book book3 = new Book("Han Kan", "Human Acts", (float)11.99);
        Book book4 = new Book("Un-Su Kim", "The Plotters", (float)15.99);
        Book book5 = new Book("Chugong", "Solo Leveling", (float)18.99);
        bookRepository.saveAll((Arrays.asList(book1, book2, book3,book4, book5)));

//        Add some customers
        Customer customer1 = new Customer("Bill");
        Customer customer2 = new Customer("Steve");
        Customer customer3 = new Customer("Jill");
        Customer customer4 = new Customer("Rocket");
        Customer customer5 = new Customer("Jane");
        Customer customer6 = new Customer("Groot");
        customerRepository.saveAll((Arrays.asList(customer1, customer2, customer3, customer4, customer5, customer6)));

//        Add some bookshops
        Bookshop bookshop1 = new Bookshop(customer1, Arrays.asList(book3,book4, book5));
        Bookshop bookshop2 = new Bookshop(customer2, Arrays.asList(book1));
        Bookshop bookshop3 = new Bookshop(customer3, Arrays.asList(book2, book5));
        Bookshop bookshop4 = new Bookshop(customer4, Arrays.asList(book3));
        Bookshop bookshop5 = new Bookshop(customer5, Arrays.asList(book2,book3));
        Bookshop bookshop6 = new Bookshop(customer6, Arrays.asList(book1,book2, book4));
        bookshopRepository.saveAll((Arrays.asList(bookshop1, bookshop2, bookshop3, bookshop4, bookshop5, bookshop6)));

    }
}
