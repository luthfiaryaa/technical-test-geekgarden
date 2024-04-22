package com.technical.test.service;

import com.technical.test.dto.fibonacci.FibonacciRequestDto;
import com.technical.test.dto.fibonacci.FibonacciResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    private Integer fibonacci(Integer n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public ResponseEntity<Object> calculateFibonacci(FibonacciRequestDto dto) {
        try {
            var n = dto.getN();
            if (n < 0) {
                throw new IllegalArgumentException("Invalid input. Please provide a non-negative integer.");
            }
            var result = fibonacci(n);
            var response = new FibonacciResponseDto(result);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input type. Please provide an integer.");
        }
    }
}
