package com.example.testcontrollers.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Route {
    @GetMapping("/create")
    public ResponseEntity<?> route () {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
