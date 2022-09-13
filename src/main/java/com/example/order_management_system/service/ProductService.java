package com.example.order_management_system.service;

import com.example.order_management_system.entity.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    Product create (Product product);

    Product getProduct (String productName);
}
