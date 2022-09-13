package com.example.order_management_system.service.serviceImpl;

import com.example.order_management_system.entity.Product;
import com.example.order_management_system.repository.ProductRepository;
import com.example.order_management_system.service.ProductService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product create (Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProduct (String productName) {
        return productRepository.findByProductName(productName);
    }
}
