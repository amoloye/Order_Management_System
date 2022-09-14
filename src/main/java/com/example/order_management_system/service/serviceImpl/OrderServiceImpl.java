package com.example.order_management_system.service.serviceImpl;

import com.example.order_management_system.dto.OrderDto;
import com.example.order_management_system.entity.Order;
import com.example.order_management_system.mapper.OrderMapper;
import com.example.order_management_system.repository.OrderRepository;
import com.example.order_management_system.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order createOrder (OrderDto orderDto) {
        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrdersByDate (LocalDateTime submissionDate, int offset, int pageSize) {
        Pageable pageable = PageRequest.of(offset,pageSize);
        return orderRepository.findAllBySubmissionDate(submissionDate, pageable);
    }
}
