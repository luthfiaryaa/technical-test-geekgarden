package com.technical.test.service;

import com.technical.test.dto.palindrome.PalindromeRequestDto;
import com.technical.test.dto.palindrome.PalindromeResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public ResponseEntity<Object> getLongestNonPalindrome(PalindromeRequestDto dto) {
        try{
            if (dto.getInput() == null || dto.getInput().isEmpty()) {
                throw new IllegalArgumentException("Input string cannot be empty.");
            }

            int maxLength = 0;
            String longestNonPalindrome = "";

            for (int i = 0; i < dto.getInput().length(); i++) {
                for (int j = i + 1; j <= dto.getInput().length(); j++) {
                    String currentSubstring = dto.getInput().substring(i, j);
                    if (!isPalindrome(currentSubstring) && currentSubstring.length() > maxLength) {
                        maxLength = currentSubstring.length();
                        longestNonPalindrome = currentSubstring;
                    }
                }
            }
            return ResponseEntity.ok(new PalindromeResponseDto(longestNonPalindrome));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Input string cannot be empty." + e.getMessage());
        }

    }
}
