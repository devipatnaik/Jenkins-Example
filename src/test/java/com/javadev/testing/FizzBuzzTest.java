package com.javadev.testing;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

class FizzBuzzTest {

    public FizzBuzz fb;

    @BeforeEach
    public void setUp(){
        fb = new FizzBuzz();
    }

    @DisplayName("Play FizzBuzz with number = 1")
    @Test
    public void testNumber(){
        String fizzbuzz = fb.play(1);
        Assertions.assertEquals(fizzbuzz, "1");
    }

    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    public void testFizz(){
        String fizzbuzz = fb.play(3);
        Assertions.assertEquals(fizzbuzz, "Fizz");
    }

    @DisplayName("Play FizzBuzz with number = 5")
    @Test
    public void testBuzz(){
        String fizzbuzz = fb.play(5);
        Assertions.assertEquals(fizzbuzz, "Buzz");
    }

    @DisplayName("Don't Play FizzBuzz with number = 0")
    @Test
    public void testZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> fb.play(0));
    }

    @AfterEach
    public void tearDown(){
        fb = null;
    }
}
