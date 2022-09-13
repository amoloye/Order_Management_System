package com.example.order_management_system.mapper;

import com.example.order_management_system.dto.CustomerDto;
import com.example.order_management_system.entity.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
//    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );


    Customer customerDtoToCustomer (CustomerDto customerDto);

    @InheritInverseConfiguration
    CustomerDto customerToCustomerDto (Customer customer);

//    PersonDTO personDto = BasicMapper.INSTANCE.convertCustom(user);

//    @Mapper(uses = {ManagerMapper.class, Validator.class})
//    public interface UserMapper {
//        UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
//        BasicUserDTO convert(BasicUser user) throws ValidationException;

}
