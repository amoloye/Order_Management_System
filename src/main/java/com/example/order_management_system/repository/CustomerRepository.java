package com.example.order_management_system.repository;

import com.example.order_management_system.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findByFirstNameIgnoreCase (String firstName);
}
