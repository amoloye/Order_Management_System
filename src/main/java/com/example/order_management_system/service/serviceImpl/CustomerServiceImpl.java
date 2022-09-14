package com.example.order_management_system.service.serviceImpl;

import com.example.order_management_system.dto.CustomerDto;
import com.example.order_management_system.entity.Customer;
import com.example.order_management_system.mapper.CustomerMapper;
import com.example.order_management_system.repository.CustomerRepository;
import com.example.order_management_system.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;


    @Override
    public Customer create (CustomerDto customerDto) {
        Customer customer = CustomerMapper.INSTANCE.customerDtoToCustomer(customerDto);
        return customerRepository.save(customer);
    }

    @Override
    public Customer getProduct (CustomerDto customerDto) {
        String firstName = customerDto.getFirstName();
        return customerRepository.findByFirstNameIgnoreCase(firstName);
    }
}
