package com.luv2code.msscbrewwery.msscbrewery.web.mappers;

import com.luv2code.msscbrewwery.msscbrewery.domain.Customer;
import com.luv2code.msscbrewwery.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * @author Jack Tran
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto customerDto);

    CustomerDto customerToCustomer(Customer customer);
}
