package com.example.order_management_system.mapper;

import com.example.order_management_system.dto.OrderDto;
import com.example.order_management_system.entity.Order;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);


    Order orderDtoToOrder (OrderDto orderDto);

    Order orderDtoToOrder (OrderDto orderDto, @MappingTarget Order order);

    OrderDto orderToOrderDto (Order order);
}
