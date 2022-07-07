package com.bnta.music_store.components;

import com.bnta.music_store.models.Product;
import com.bnta.music_store.models.Purchase;
import com.bnta.music_store.models.User;
import com.bnta.music_store.repositories.ProductRepository;
import com.bnta.music_store.repositories.PurchaseRepository;
import com.bnta.music_store.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

// component annotation required to make the class 'visible' to Spring
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception { //cast into a float as default as a double

//       added some products
        Product product1 = new Product("Generic Acoustic Guitar","A very generic acoustic guitar", (float)549.99);
        Product product2 = new Product("Generic Bass Guitar","A very generic bass guitar", (float)849.99);
        Product product3 = new Product("Generic Electric Guitar","A very generic electric guitar", (float)949.99);
        Product product4 = new Product("Generic Drum","A very generic drum kit", (float)799.99);
        productRepository.saveAll((Arrays.asList(product1, product2,product3, product4)));

//       added some users
        User user1 = new User("Jack", LocalDate.of(1982, 3, 25));
        User user2 = new User("Jason", LocalDate.of(1962, 5, 15));
        User user3 = new User("Jill", LocalDate.of(1999, 11, 7));
        userRepository.saveAll((Arrays.asList(user1, user2, user3)));

//        added some purchases
        Purchase purchase1 = new Purchase(user1, Arrays.asList(product4, product2));
        Purchase purchase2 = new Purchase(user2, Arrays.asList(product1));
        Purchase purchase3 = new Purchase(user3, Arrays.asList(product3, product2));
        Purchase purchase4 = new Purchase(user1, Arrays.asList(product3));
        purchaseRepository.saveAll((Arrays.asList(purchase1,purchase3,purchase2,purchase4)));

    }
}
