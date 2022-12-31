package com.haris.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    public void customerRegistration(CustomerRequest customerRequest){
        Customer customer = Customer.builder()
                                        .firstName(customerRequest.firstName())
                                        .lastName(customerRequest.lastName())
                                        .email(customerRequest.email())
                                        .build();
                                        
        // @ TODO: regist firstName
        // @ TODO: regist lastName
        // @ TODO: regist email
    }
}
