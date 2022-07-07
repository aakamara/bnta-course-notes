package com.example.bookshop_lab.repositories;

import com.example.bookshop_lab.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findBookByName(String name);

    List<Book> findByTitleContainingIgnoreCase(String title);

}
