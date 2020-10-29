package com.groovin101.kata.standalone;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertFalse;

public class KataShuffleJavaArray {


    @Test
    public void shuffle() {

        int[] source = {1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11};
        int[] solutionArray = {1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11};

        shuffleArray(solutionArray);
        printArray("before: ", solutionArray);
        printArray("after: ", solutionArray);

        assertFalse("These two arrays should not be equal after shuffling",
                Arrays.equals(source, solutionArray));
        //look at impl(Collections.shuffle());
    }

    private void shuffleArray(int[] solutionArray) {

    }

    private void printArray(String prefix, int[] solutionArray) {
        System.out.print(prefix);
        for (int i = 0; i < solutionArray.length; i++) {
            System.out.print(solutionArray[i] + " ");
        }
        System.out.println();
    }

    // Implementing Fisher–Yates shuffle
    static void XshuffleArray(int[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
