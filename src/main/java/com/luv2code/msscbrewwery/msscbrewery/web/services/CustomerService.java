package com.luv2code.msscbrewwery.msscbrewery.web.services;

import com.luv2code.msscbrewwery.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author Jack Tran
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
