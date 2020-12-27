package ch.z.hc.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    public ResponseEntity<String> getAll() {


        return ResponseEntity.ok(  ).build();
    }

}
