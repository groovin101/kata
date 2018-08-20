package com.groovin101.kata.beg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Reverse a string
 *
 * SOURCE: https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
 */
public class KataReverseString {

    public static String solution(String reverseMe) {
        return new StringBuilder(reverseMe).reverse().toString();
    }
}
