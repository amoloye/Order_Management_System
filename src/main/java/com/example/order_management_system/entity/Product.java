package com.example.order_management_system.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long productId;

    @NotBlank(message = "please input product name")
    @Min(1)
    private String productName;

    @NotNull
    private long skuCode;

    @NotNull
    private double unitPrice;

}
