package com.wgcodecompany.fraud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
public class FraudController {

    private final FraudCheckService fraudCheckService;

//    public FraudController(FraudCheckService fraudCheckService) {
//        this.fraudCheckService = fraudCheckService;
//    }

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer cusomerID){
        boolean isFraudulentCustomer = fraudCheckService
                .isFraudulentCustomer(cusomerID);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
