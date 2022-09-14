package com.example.order_management_system.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class ProductDto {
    private long productId;
    private String productName;
    private long skuCode;
    private double unitPrice;
}
