package com.example.order_management_system.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProductDto {
    private long productId;
    private String productName;
    private long skuCode;
    private double unitPrice;
    @JsonIgnore
    private  OrderLineDto orderLineDto;
}
