package com.technical.test.controller;

import com.technical.test.dto.fibonacci.FibonacciRequestDto;
import com.technical.test.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/fibonacci")
public class FibonacciController {

    @Autowired
    private FibonacciService service;

    @PostMapping()
    public ResponseEntity<Object> post(@RequestBody FibonacciRequestDto dto) {
        return service.calculateFibonacci(dto);
    }
}
