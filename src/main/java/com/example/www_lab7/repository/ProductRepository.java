package com.example.www_lab7.repository;

import com.example.www_lab7.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
