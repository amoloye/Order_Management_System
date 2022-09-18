package com.example.order_management_system.dto;


import com.example.order_management_system.entity.Order;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


@Data @Builder
public class CustomerDto {
    private long customerId;
    private long registrationCode;
    private String firstName;
    private String surname;
    private String email;
    private long telephone;

    @JsonIgnore
    private OrderDto orderDto;
}
