package com.example.order_management_system.controller;

import com.example.order_management_system.dto.CustomerDto;
import com.example.order_management_system.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/customer")
    public ResponseEntity<?> createCustomer(@RequestBody CustomerDto customerDto){
        return ResponseEntity.ok().body(customerService.create(customerDto));
    }

    @GetMapping("/customer")
    public ResponseEntity<?> getProduct(@RequestBody CustomerDto customerDto){
        return ResponseEntity.ok().body( customerService.getProduct(customerDto));
    }
}
