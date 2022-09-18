package com.example.order_management_system.dto;


import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class OrderDto {


    private long orderId;
    private List<OrderLineDto> orderLineDto;
    private CustomerDto customerDto;

    @CreationTimestamp
    private LocalDateTime submissionDate;



    public LocalDateTime getSubmissionDate () {
        return LocalDateTime.now();
    }

    public OrderDto (long orderId, List<OrderLineDto> orderLineDto, CustomerDto customerDto,LocalDateTime submissionDate) {
        this.orderId = orderId;
        this.orderLineDto = orderLineDto;
        this.customerDto = customerDto;
        this.submissionDate = getSubmissionDate();
    }


}
