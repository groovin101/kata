package com.groovin101.kata.standalone;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import static org.junit.Assert.assertFalse;

public class KataShuffleJavaArray {

    @Test
    public void shuffle() {

        assertFalse("Failing to flag myself to circle back on this one", true);
        int[] source = {1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11};
        int[] solutionArray = {1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11};

        printArray("before: ", solutionArray);
        shuffleArray(solutionArray);
        printArray("after: ", solutionArray);

        assertFalse("These two arrays should not be equal after shuffling",
                Arrays.equals(source, solutionArray));
        //look at impl(Collections.shuffle());
    }

    private void shuffleArray(int[] solutionArray) {
        //Random random = new Random();
        //loop through the array
        //for each value that you encounter, swap its position with another in the array
            //how to get a random position to swap with?
                //random will give us random ints... how would I limit the scope of the ints generated? random between 0 and array.length-1
                Random random = new Random();
        for (int i = 0; i < solutionArray.length; i++) {
//            IntStream randomIntStream = random.ints(0, solutionArray.length);
//            randomIntStream.findFirst()
            int randomPosition = random.nextInt(solutionArray.length);
            int valThatWasInPositionI = solutionArray[i];
            int valThatWasInRandomPosition = solutionArray[randomPosition];
            solutionArray[i] = valThatWasInRandomPosition;
            solutionArray[randomPosition] = valThatWasInPositionI;
        }
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
