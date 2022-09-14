package com.example.order_management_system.controller;

import com.example.order_management_system.dto.OrderDto;
import com.example.order_management_system.entity.Order;
import com.example.order_management_system.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping
@RequiredArgsConstructor
@RestController
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/create_order")
    public ResponseEntity<Order> createOrder(OrderDto orderDto){
        return ResponseEntity.ok().body(orderService.createOrder(orderDto));
    }

    @GetMapping("/orders-by-date/{submissionDate}")
    public ResponseEntity<?> getOrdersByDate(@PathVariable("submissionDate") LocalDateTime submissionDate,
                                             @RequestParam(defaultValue = "0") int offset,
                                             @RequestParam(defaultValue = "3") int pageSize){
        return ResponseEntity.ok().body(orderService.getOrdersByDate(submissionDate,offset,pageSize));

    }


}
