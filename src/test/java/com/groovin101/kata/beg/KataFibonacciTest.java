package com.groovin101.kata.beg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
 *
 * Given a number n, print n-th Fibonacci Number
 *
 *    HINT: Write a function int fib(int n) that returns Fn. For example, if n = 0, then fib() should return 0. If n = 1, then it should return 1. For n > 1, it should return F|n-1 + F|n-2
 */
public class KataFibonacciTest {

    KataFibonacci fibonacci = new KataFibonacci();

    @Test
    public void fibonacci_seed_firstPosition() {
        assertEquals(0, fibonacci.fibonacci(1));
    }

    @Test
    public void fibonacci_seed_secondPosition() {
        assertEquals(1, fibonacci.fibonacci(2));
    }

    @Test
    public void fibonacci_firstNumThatUsesFormula() {
        assertEquals(1, fibonacci.fibonacci(3));
    }

    @Test
    public void fibonacci_4thNumberInSequence() {
        assertEquals(2, fibonacci.fibonacci(4));
    }

    @Test
    public void fibonacci_5thNumberInSequence() {
        assertEquals(3, fibonacci.fibonacci(5));
    }

    @Test
    public void fibonacci_8thNumberInSequence() {
        assertEquals(13, fibonacci.fibonacci(8));
    }

}
