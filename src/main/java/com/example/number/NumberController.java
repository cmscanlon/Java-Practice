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

    @RequestMapping("/random")
    public int getRandomNumber() {
        int number = (int) (Math.random() * 10);

        if (number != 7) {
            return 102;
        } else {
            return 107;
        }
    }
}
