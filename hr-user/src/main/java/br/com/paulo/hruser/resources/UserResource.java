package br.com.paulo.hruser.resources;

import br.com.paulo.hruser.entities.User;
import br.com.paulo.hruser.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired private UserRepository userRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        Optional<User> byId = userRepository.findById(id);
        return ResponseEntity.ok(byId.orElse(null));
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findById(@RequestParam String email){
        User byEmail = userRepository.findByEmail(email);
        return ResponseEntity.ok(byEmail);
    }


}
