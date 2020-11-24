package br.com.paulo.hrpayroll.resource;

import br.com.paulo.hrpayroll.entities.Payment;
import br.com.paulo.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payments")
public class PaymentResource {

    @Autowired private PaymentService paymentService;

    @GetMapping(value = "/{workerId}/days/{days}")
    private ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
        return ResponseEntity.ok(paymentService.getPayment(workerId, days));
    }

}
