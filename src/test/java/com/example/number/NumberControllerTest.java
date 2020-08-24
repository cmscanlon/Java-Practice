package com.example.number;


import org.junit.Test;

import static org.junit.Assert.*;

public class NumberControllerTest {

    @Test
    public void isEvenTest() {
        NumberController number = new NumberController();
        assertEquals(200, number.getIsEven(1,5));
        assertEquals(207, number.getIsEven(4,3));
    }

    @Test
    public void RandomNumberTest() {
        NumberController random = new NumberController();
        assertNotEquals(10, random.getRandomNumber());
    }
}
