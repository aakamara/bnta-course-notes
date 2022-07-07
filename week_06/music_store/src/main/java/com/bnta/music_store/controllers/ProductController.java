package com.bnta.music_store.controllers;

import com.bnta.music_store.models.Product;
import com.bnta.music_store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products") //you have to give a explicit method for every part
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }

//    SHOW mapping
    @GetMapping("/{id}") //what are we catching?
    public ResponseEntity<Optional<Product>> getProduct(@PathVariable Long id){
        var product = productRepository.findById(id); //passing id inside
        return new ResponseEntity<>(product, product.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK); //returning a response as well
        //provide a condition that is true and false
        //if it is true ? is used
        // operator: condition ? true statement : false statement
    }

//    POST mapping
    @PostMapping
    public void createProduct(@RequestBody Product product){
        productRepository.save(product);
    }

}
