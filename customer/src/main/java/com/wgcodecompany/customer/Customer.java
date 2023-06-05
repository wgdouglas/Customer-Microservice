package com.wgcodecompany.customer;

//everySub
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer { //this class is the model for our microservice
    private int id;
    private String firstName;
    private String lastName;
    private String email;

}
