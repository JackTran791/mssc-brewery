package com.luv2code.msscbrewwery.msscbrewery.web.services;

import com.luv2code.msscbrewwery.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Jack Tran
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Jack")
                .build();
    }

    @Override
    public CustomerDto savedNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // TO-DO: Would add something here
    }

    @Override
    public void deleteById(UUID customerId) {
        // TO-DO: Would add something here
    }
}
