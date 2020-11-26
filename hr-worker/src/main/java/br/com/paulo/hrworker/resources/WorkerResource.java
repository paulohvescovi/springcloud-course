package br.com.paulo.hrworker.resources;

import br.com.paulo.hrworker.entities.Worker;
import br.com.paulo.hrworker.repositories.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @Autowired private Environment env;
    @Autowired private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        return ResponseEntity.ok(workerRepository.findAll()) ;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        logger.info("PORT = " + env.getProperty("local.server.port"));

//        try {//teste timeout
//            Thread.sleep(3000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Optional<Worker> byId = workerRepository.findById(id);
        return ResponseEntity.ok(byId.orElse(null));
    }


}
