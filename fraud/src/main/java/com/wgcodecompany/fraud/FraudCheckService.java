package com.wgcodecompany.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

//   The reason to remove the constructors is b/c you're using `lombok`
//    public FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {
//        this.fraudCheckHistoryRepository = fraudCheckHistoryRepository;
//    }

    public boolean isFraudulentCustomer(Integer customerId){
        fraudCheckHistoryRepository.save(
             FraudCheckHistory.builder()
                     .isFraudster(false)
                     .customerId(customerId)
                     .createdAt(LocalDateTime.now())
                     .build()
        );
        return false;
    }
}
