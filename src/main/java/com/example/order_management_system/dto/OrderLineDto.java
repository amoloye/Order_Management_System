package com.example.order_management_system.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderLineDto {
    private long OrderLineId;
    private ProductDto productDto;
    private long quantity;
    @JsonIgnore
    private OrderDto orderDto;
}
