package com.example.order_management_system.dto;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data @Builder @ToString
public class CustomerDto {
    private long customerId;
    private long registrationCode;
    private String firstName;
    private String surname;
    private String email;
    private long telephone;
}
