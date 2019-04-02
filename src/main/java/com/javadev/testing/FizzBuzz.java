package com.javadev.testing;

public class FizzBuzz {

    public String play(int number) throws Exception {

        if(number == 0){
            throw new IllegalAccessException("Number ust not be 0");
        }if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
