package com.haris.app;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public CustomerService(){

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
