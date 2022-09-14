package com.example.order_management_system.controller;

import com.example.order_management_system.dto.OrderLineDto;

import com.example.order_management_system.service.OrderLineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
@RequiredArgsConstructor
public class OrderLineController {
    private final OrderLineService orderLineService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("create_orderLine_list")
    public void createOrderLineList(@RequestBody List<OrderLineDto> orderLineDtoList){
        orderLineService.createList(orderLineDtoList);
    }
}
