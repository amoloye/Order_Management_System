package com.example.order_management_system.dto;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class OrderLineDto {
    private long OrderLineId;
    private String productDto;
    private long quantity;
}
