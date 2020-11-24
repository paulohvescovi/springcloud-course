package br.com.paulo.hrpayroll.services;

import br.com.paulo.hrpayroll.entities.Payment;
import br.com.paulo.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hr-worker.host}") String workerHost;

    private RestTemplate restTemplate = new RestTemplate();

    public Payment getPayment(Long workerId, Integer days){
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", String.valueOf(workerId));

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
