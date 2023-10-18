package com.barracuda.successful_learning.api.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DemoController {

    @GetMapping("api/v1/names")
    ResponseEntity<List<String>> getAllNames() {
        final List<String> names = List.of("Andrei", "Oksana", "Alisa", "Olya");
        return ResponseEntity.ok(names);
    }

}
