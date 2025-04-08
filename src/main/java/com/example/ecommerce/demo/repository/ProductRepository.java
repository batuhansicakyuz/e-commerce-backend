package com.example.ecommerce.demo.repository;

import com.example.ecommerce.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory_Name(String categoryName); // Düzeltildi
    List<Product> findByNameContaining(String name);
    List<Product> findByNameContainingIgnoreCase(String keyword);
}