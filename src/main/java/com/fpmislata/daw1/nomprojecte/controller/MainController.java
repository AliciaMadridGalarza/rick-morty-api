package com.fpmislata.daw1.nomprojecte.controller;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity<String> main() {
        return ResponseEntity.ok("L'aplicació està funcionant!");
    }
}
