package com.webproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/api/players")
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class PlayerController {

    @GetMapping
    public ResponseEntity<String> getTestHomePage() {
        return new ResponseEntity("HOME", HttpStatus.ACCEPTED);
    }

}
