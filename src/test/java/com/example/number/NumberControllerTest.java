package com.example.number;


import org.junit.Test;

import static org.junit.Assert.*;

public class NumberControllerTest {

    @Test
    public void isEvenTest() {
        NumberController number = new NumberController();
        assertEquals(200, number.getIsEven(1, 5));
        assertEquals(207, number.getIsEven(4, 3));
    }

    @Test
    public void isOddTest() {
        NumberController number = new NumberController();
        assertEquals(200, number.getIsOdd(1,4));
        assertEquals(207, number.getIsOdd(1,5));
    }

    @Test
    public void isPalindrome() {
        NumberController palindrome = new NumberController();
        assertEquals("It is a palindrome!", palindrome.getIsPalindrome("racecar"));
        assertEquals("Not a palindrome", palindrome.getIsPalindrome("racecars"));
    }

    @Test
    public void isLeapYear() {
        NumberController leapYear = new NumberController();
        assertEquals(200, leapYear.getIsLeapYear(2020));
        assertEquals(207, leapYear.getIsLeapYear(1999));
    }
}
