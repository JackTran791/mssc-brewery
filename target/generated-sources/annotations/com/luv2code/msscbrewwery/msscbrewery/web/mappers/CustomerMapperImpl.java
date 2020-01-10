package com.luv2code.msscbrewwery.msscbrewery.web.mappers;

import com.luv2code.msscbrewwery.msscbrewery.domain.Customer;
import com.luv2code.msscbrewwery.msscbrewery.domain.Customer.CustomerBuilder;
import com.luv2code.msscbrewwery.msscbrewery.web.model.CustomerDto;
import com.luv2code.msscbrewwery.msscbrewery.web.model.CustomerDto.CustomerDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-09T22:25:03-0600",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.3.0.101 (Azul Systems, Inc.)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        CustomerBuilder customer = Customer.builder();

        customer.id( customerDto.getId() );
        customer.name( customerDto.getName() );

        return customer.build();
    }

    @Override
    public CustomerDto customerToCustomer(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDtoBuilder customerDto = CustomerDto.builder();

        customerDto.id( customer.getId() );
        customerDto.name( customer.getName() );

        return customerDto.build();
    }
}
