package com.securityEcommerce.service.Imp;


import com.securityEcommerce.models.Customer;
import com.securityEcommerce.repository.CustomerRepository;
import com.securityEcommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer CreateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


}
