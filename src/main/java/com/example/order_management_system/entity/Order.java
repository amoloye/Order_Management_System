package com.example.order_management_system.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;

    @OneToMany
    @JoinColumn(name = "orderLineId")
    private List<OrderLine> orderLineList;

    @ManyToOne
    @JoinColumn(name = "customersId")
    private Customer customer;


    @Column(name = "submission_date",updatable = false)
    private LocalDateTime submissionDate;


}
