package com.example.order_management_system.dto;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import java.util.List;

@Data
@Builder
@ToString
public class OrderDto {
    private long orderId;
    private List<String> orderLineDto;
    private String customerDto;
}
