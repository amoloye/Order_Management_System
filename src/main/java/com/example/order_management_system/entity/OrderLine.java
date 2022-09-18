package com.example.order_management_system.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    long orderLineId;

    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;

    @Min(1)
    private long quantity;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;

}
