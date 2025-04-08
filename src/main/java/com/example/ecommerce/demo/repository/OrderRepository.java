package com.example.ecommerce.demo.repository;

import com.example.ecommerce.demo.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
    List<CustomerOrder> findByUser_Id(Long userId);
}
