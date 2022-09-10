package io.gdfbarbosa.algorithms.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciIterativeTest {
    @Test
    public void test0() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(0, fibonacciIterative.fib(0));
    }
    @Test
    public void test1() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(1, fibonacciIterative.fib(1));
    }
    @Test
    public void test2() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(1, fibonacciIterative.fib(2));
    }
    @Test
    public void test3() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(2, fibonacciIterative.fib(3));
    }
    @Test
    public void test4() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(3, fibonacciIterative.fib(4));
    }
    @Test
    public void test5() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(5, fibonacciIterative.fib(5));
    }
    @Test
    public void test6() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(8, fibonacciIterative.fib(6));
    }
    @Test
    public void test7() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(13, fibonacciIterative.fib(7));
    }
    @Test
    public void test8() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(21, fibonacciIterative.fib(8));
    }
    @Test
    public void test9() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(34, fibonacciIterative.fib(9));
    }
    @Test
    public void test10() {
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(55, fibonacciIterative.fib(10));
    }


}
