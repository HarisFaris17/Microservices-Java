package com.haris.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    public final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    public void mainPage(){
        log.info("Called");
    }

    @PostMapping
    public void cutomerRegistration(@RequestBody CustomerRequest customerRequest){
        customerService.customerRegistration(customerRequest);
        log.info("Customer registration {}",customerRequest);
    }
}
