package com.example.order_management_system.service.serviceImpl;

import com.example.order_management_system.dto.OrderLineDto;
import com.example.order_management_system.entity.OrderLine;
import com.example.order_management_system.mapper.OrderLineMapper;
import com.example.order_management_system.repository.OrderLineRepository;
import com.example.order_management_system.service.OrderLineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderLineServiceImpl implements OrderLineService {
    private final OrderLineRepository orderLineRepository;


    @Override
    public void createList (List<OrderLineDto> orderLineDtoList) {
        List<OrderLine> orderLineList = OrderLineMapper.INSTANCE.orderLineDtoToOrderLine(orderLineDtoList);
        orderLineRepository.saveAll(orderLineList);
    }


}
