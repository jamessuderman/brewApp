/*
 *   GEODynamics
 *   Author - James Suderman
 *   Date - 06/19/2020
 */

package com.jamessuderman.brewapp.web.services;

import com.jamessuderman.brewapp.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
    CustomerDto saveNewCustomer(CustomerDto customer);
    void updateCustomer(UUID customerId, CustomerDto customer);
    void deleteById(UUID customerId);
}
