package com.example.ecommerce.demo.repository;

import com.example.ecommerce.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
