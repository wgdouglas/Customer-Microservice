package com.wgcodecompany.customer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {
    //in order to send a http request to fraud microservice we set this object up
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
