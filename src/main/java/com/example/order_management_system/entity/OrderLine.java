package com.example.order_management_system.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "orderLine")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long OrderLineId;
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Min(1)
    private long quantity;
}
