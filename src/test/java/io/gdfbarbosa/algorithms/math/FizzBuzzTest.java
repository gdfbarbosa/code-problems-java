package io.gdfbarbosa.algorithms.math;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void fizzBuzz1() {
        assertEquals(Arrays.asList("1","2","Fizz"), new FizzBuzz().fizzBuzz(3));
    }

    @Test
    public void fizzBuzz2() {
        assertEquals(Arrays.asList("1","2","Fizz","4","Buzz"), new FizzBuzz().fizzBuzz(5));
    }

    @Test
    public void fizzBuzz3() {
        assertEquals(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"), new FizzBuzz().fizzBuzz(15));
    }
}