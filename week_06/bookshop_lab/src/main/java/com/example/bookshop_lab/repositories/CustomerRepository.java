package com.example.bookshop_lab.repositories;

import com.example.bookshop_lab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
