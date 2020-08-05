package com.delivery.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth")
public class TestController {

    @GetMapping(path = "/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok("Hello World!");
    }

}
