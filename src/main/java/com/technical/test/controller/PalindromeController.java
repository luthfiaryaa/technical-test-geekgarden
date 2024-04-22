package com.technical.test.controller;

import com.technical.test.dto.palindrome.PalindromeRequestDto;
import com.technical.test.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/palindrome")
public class PalindromeController {

    @Autowired
    private PalindromeService service;

    @PostMapping()
    public ResponseEntity<Object> post(@RequestBody PalindromeRequestDto dto) {
        return service.getLongestNonPalindrome(dto);
    }

}
