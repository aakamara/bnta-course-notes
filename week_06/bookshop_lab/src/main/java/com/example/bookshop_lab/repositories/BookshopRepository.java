package com.example.bookshop_lab.repositories;

import com.example.bookshop_lab.models.Bookshop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookshopRepository extends JpaRepository<Bookshop, Long> {
}
