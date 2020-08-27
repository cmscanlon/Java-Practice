package com.example.number;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    @GetMapping("/even")
    public int getIsEven(@RequestParam(value = "first-number") Integer firstNumber, @RequestParam(value = "second-number") Integer secondNumber) {

        int answer = (firstNumber + secondNumber) % 2;

        if (answer == 0) {
            return 200;
        } else {
            return 207;
        }
    }

    @GetMapping("/odd")
    public int getIsOdd(@RequestParam(value = "first-number") Integer firstNumber, @RequestParam(value = "second-number") Integer secondNumber) {

        int answer = (firstNumber + secondNumber) % 2;

        if (answer == 1) {
            return 200;
        } else {
            return 207;
        }
    }

    @GetMapping("/palindrome")
    public String getIsPalindrome(@RequestParam(value = "word") String word) {

        int number = word.length();
        for (int i = 0; i < (number/2); i++) {
            if (word.charAt(i) != word.charAt(number - i - 1)) {
                return "Not a palindrome";
            }
        }
        return "It is a palindrome!";
    }

    @GetMapping("/leap")
    public int getIsLeapYear(@RequestParam(value = "year") Integer year) {
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }
        if(isLeap == true)
            return 200;
        else
            return 207;
    }

}
