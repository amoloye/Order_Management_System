package com.example.order_management_system.controller;



import com.example.order_management_system.entity.Product;
import com.example.order_management_system.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.ok().body( productService.create(product));
    }

    @GetMapping("/product/{productName}")
    public ResponseEntity<Product> getProduct(@PathVariable("productName") String productName){
        return ResponseEntity.ok().body( productService.getProduct(productName));
    }
}
