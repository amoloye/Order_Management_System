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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long OrderId;

    @ManyToMany
    @JoinColumn(name = "orderLine_id")
    private List<OrderLine> orderLine;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private LocalDateTime submissionDate;

    public void setSubmissionDate (LocalDateTime submissionDate) {
        this.submissionDate = LocalDateTime.now();
    }
}
