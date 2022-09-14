package com.example.order_management_system.controller;



import com.example.order_management_system.dto.ProductDto;
import com.example.order_management_system.entity.Product;
import com.example.order_management_system.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class ProductController {
    private final ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody ProductDto productDto){
        return ResponseEntity.ok().body( productService.create(productDto));
    }

    @GetMapping("/product")
    public ResponseEntity<Product> getProduct(@RequestBody ProductDto productDto){
        return ResponseEntity.ok().body( productService.getProduct(productDto));
    }
}
