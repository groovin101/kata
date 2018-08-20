package com.groovin101.kata.beg;

public class KataFibonacci {

    public int fibonacci(int nthItemInFibSequence) {
        System.out.println(String.format("nthItemInFibSequence: %d", nthItemInFibSequence));
        if (nthItemInFibSequence <=0) {
            return 0;
        }
        if (nthItemInFibSequence == 1) {
            return 1;
        }
        int result = fibonacci(nthItemInFibSequence-1) + fibonacci(nthItemInFibSequence-2);
        System.out.println(result);
        return result;
    }
}
