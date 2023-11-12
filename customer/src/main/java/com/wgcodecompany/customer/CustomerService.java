package com.wgcodecompany.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service //this allows spring to initialize this as a Bean for us, so we can inject it in our controller
@AllArgsConstructor
public class CustomerService { //the service will handle the Post request
    private final CustomerRepository customerRepository;//injecting it here is how & where we'll save the customer
    private final RestTemplate restTemplate;
    public void registerCustomer(CustomerRegistrationRequest request) {
        //Here we'll turn the request into a Customer
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo: check if email is valid
        // todo: check if email not taken

        // todo: store customer in db
        customerRepository.saveAndFlush(customer);

        //todo: check if fraudster
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://FRAUD/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );
        if (fraudCheckResponse.isFraudster()){
            throw new IllegalStateException("fraudster");
        }

        //todo: send notification
    }
}
