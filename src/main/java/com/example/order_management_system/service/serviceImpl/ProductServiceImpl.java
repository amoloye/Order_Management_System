package com.example.order_management_system.service.serviceImpl;

import com.example.order_management_system.dto.ProductDto;
import com.example.order_management_system.entity.Product;
import com.example.order_management_system.mapper.ProductMapper;
import com.example.order_management_system.repository.ProductRepository;
import com.example.order_management_system.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product create (ProductDto productDto) {
        Product product = ProductMapper.INSTANCE.ProductDtoToProduct(productDto);
        return productRepository.save(product);
    }

    @Override
    public Product getProduct (ProductDto productDto) {
       String productName= productDto.getProductName(); //exception
        return productRepository.findByProductNameIgnoreCase(productName);
    }
}
