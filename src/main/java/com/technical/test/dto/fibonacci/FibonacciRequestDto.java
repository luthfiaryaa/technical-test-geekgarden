package com.technical.test.dto.fibonacci;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class FibonacciRequestDto {
    private Integer n;

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }
}