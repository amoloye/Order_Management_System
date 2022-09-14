package com.example.order_management_system.repository;

import com.example.order_management_system.entity.Order;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findAllBySubmissionDate(LocalDateTime submissionDate, Pageable pageable);
}
