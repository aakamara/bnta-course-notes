package com.example.bookshop_lab.controllers;

import com.example.bookshop_lab.models.Book;
import com.example.bookshop_lab.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //class is a REST Controller
@RequestMapping("books") //URL path with a method in a controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // request to get method
    @GetMapping //localhost:8080/books
    public ResponseEntity<List<Book>> getAllBooksAndFilter(
            @RequestParam(required = false, name = "name") String name
    ){
        if(name != null){
            return new ResponseEntity<>(bookRepository.findBookByName(name), HttpStatus.OK);
        }
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }

//    SHOW Mapping
    @GetMapping("/{id}") //localhost:8080/books
    public ResponseEntity<Optional<Book>> getBook(@PathVariable Long id){
        var book = bookRepository.findById(id);
        return new ResponseEntity<>(book, book.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }
//    PathVariable is used to extract the value from the URL - rest resources
//    var variable to find by id

//    POST Mapping
    @PostMapping //localhost:8080/books
    public void createBook(@RequestBody Book book) {bookRepository.save(book);}

//    DELETE Mapping
    @DeleteMapping("/{id}") //localhost:8080/books/6
    void deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
    }


}
