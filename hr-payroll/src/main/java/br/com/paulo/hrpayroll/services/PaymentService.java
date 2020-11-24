package br.com.paulo.hrpayroll.services;

import br.com.paulo.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days){
        return new Payment("Paulo", 200D, days);
    }

}
