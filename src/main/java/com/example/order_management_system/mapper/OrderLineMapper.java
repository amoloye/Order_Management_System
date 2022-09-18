package com.example.order_management_system.mapper;

import com.example.order_management_system.dto.OrderLineDto;
import com.example.order_management_system.entity.OrderLine;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface OrderLineMapper {
    OrderLineMapper INSTANCE = Mappers.getMapper(OrderLineMapper.class);


    List<OrderLine> orderLineDtoToOrderLine (List<OrderLineDto> orderLineDtoList);
    List<OrderLine> orderLineDtoToOrderLine
            (List<OrderLineDto> orderLineDtoList, @MappingTarget List<OrderLine> orderLineList );

    List<OrderLineDto> orderLineToOrderLineDto (List<OrderLine> orderLineList);
}
