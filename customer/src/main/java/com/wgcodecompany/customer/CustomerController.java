package com.wgcodecompany.customer;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j //used to log
@RestController
@RequestMapping("api/v1/customers")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    @PostMapping //using this lets you fire post request's to the endpoint
    public void requestCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
        log.info("new Customer {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }
}
