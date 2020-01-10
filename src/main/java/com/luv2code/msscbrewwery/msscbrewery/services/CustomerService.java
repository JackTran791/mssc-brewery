package com.luv2code.msscbrewwery.msscbrewery.services;

import com.luv2code.msscbrewwery.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author Jack Tran
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto savedNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
