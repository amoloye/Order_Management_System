package com.example.order_management_system.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "order")
public class Order {
    public Order (List<OrderLine> orderLineList, Customer customer) {
        this.orderLineList = orderLineList;
        this.customer = customer;
        this.submissionDate=LocalDateTime.now();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;

    @ManyToMany
    @JoinColumn(name = "orderLine_id")
    private List<OrderLine> orderLineList;

    @ManyToOne
    @JoinColumn(name = "customers_id")
    private Customer customer;

    private LocalDateTime submissionDate;

}
