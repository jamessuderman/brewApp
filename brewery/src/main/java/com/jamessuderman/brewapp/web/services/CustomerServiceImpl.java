/*
 *   GEODynamics
 *   Author - James Suderman
 *   Date - 06/19/2020
 */

package com.jamessuderman.brewapp.web.services;

import com.jamessuderman.brewapp.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("James Suderman")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customer) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customer) {
        //TODO Update customer
    }

    @Override
    public void deleteById(UUID customerId) {
        //TODO Delete customer
    }
}
