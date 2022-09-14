package com.example.order_management_system.service;

import com.example.order_management_system.dto.OrderLineDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderLineService {
     void createList (List<OrderLineDto> orderLineDtolist);
}
