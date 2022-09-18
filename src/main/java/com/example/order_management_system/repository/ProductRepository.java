package com.example.order_management_system.repository;

import com.example.order_management_system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

   Optional<Product> findByProductNameIgnoreCase (String productName);
}
