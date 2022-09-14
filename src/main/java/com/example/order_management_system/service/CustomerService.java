package com.example.order_management_system.service;

import com.example.order_management_system.dto.CustomerDto;
import com.example.order_management_system.entity.Customer;



public interface CustomerService {
    Customer create (CustomerDto customerDto);

    Customer getProduct (CustomerDto customerDto);
}
