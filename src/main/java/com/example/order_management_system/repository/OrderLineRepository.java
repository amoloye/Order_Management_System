package com.example.order_management_system.repository;

import com.example.order_management_system.entity.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine,Long> {
}
