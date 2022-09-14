package com.example.order_management_system.mapper;

import com.example.order_management_system.dto.ProductDto;
import com.example.order_management_system.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);


    Product ProductDtoToProduct (ProductDto productDto);

    @InheritInverseConfiguration
    ProductDto productToProductDto (Product product);

}
