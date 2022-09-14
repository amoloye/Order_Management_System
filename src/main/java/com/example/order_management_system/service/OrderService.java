package com.example.order_management_system.service;

import com.example.order_management_system.dto.OrderDto;
import com.example.order_management_system.entity.Order;

import java.time.LocalDateTime;
import java.util.List;


public interface OrderService {

    Order createOrder (OrderDto orderDto);

    List<Order> getOrdersByDate (LocalDateTime submissionDate, int offset, int pageSize);
}
