package com.example.order_management_system.service;

import com.example.order_management_system.dto.ProductDto;
import com.example.order_management_system.entity.Product;


public interface ProductService {
    Product create (ProductDto productDto);

    Product getProduct (ProductDto productDto);
}
