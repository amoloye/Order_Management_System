package com.example.order_management_system.repository;

import com.example.order_management_system.entity.Order;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findAllBySubmissionDate(LocalDateTime submissionDate, Pageable pageable);
}
