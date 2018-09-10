package com.groovin101.kata.beg;

/**
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
 *
 * Write a function int fib(int n) that returns Fn. For example, if n = 0, then fib() should return 0. If n = 1, then it should return 1. For n > 1, it should return F|n-1 + F|n-2
 *
 * Given a number n, print n-th Fibonacci Number
 */
public class KataFibonacci {

    public int fibonacci(int nthItemInFibSequence) {
        if (nthItemInFibSequence == 1) {
            return 0;
        }
        else if (nthItemInFibSequence == 2) {
            return 1;
        }
        return fibonacci(nthItemInFibSequence-1) + fibonacci(nthItemInFibSequence-2);
    }
}