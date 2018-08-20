package com.groovin101.kata.beg;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 *
 * source: https://leetcode.com/problems/roman-to-integer/description/
 */
public class KataRomanNumeralToInt {

    private Map<String, Integer> letterToIntVal;
    private Map<Character, Integer> charToIntVal;

    public KataRomanNumeralToInt() {
        letterToIntVal = new HashMap<>();
        letterToIntVal.put(null, 0);
        letterToIntVal.put("", 0);
        letterToIntVal.put("I", 1);
        letterToIntVal.put("V", 5);
        letterToIntVal.put("X", 10);
        letterToIntVal.put("L", 50);
        letterToIntVal.put("C", 100);
        letterToIntVal.put("D", 500);
        letterToIntVal.put("M", 1000);

        charToIntVal = new HashMap<>();
        charToIntVal.put(null, 0);
        charToIntVal.put('I', 1);
        charToIntVal.put('V', 5);
        charToIntVal.put('X', 10);
        charToIntVal.put('L', 50);
        charToIntVal.put('C', 100);
        charToIntVal.put('D', 500);
        charToIntVal.put('M', 1000);

    }

    public int romanToInt(String s) {

        int result = 0;
        char[] letters = s.toCharArray();

        int i = 0;
        int j = 1;
        for (; j<letters.length; i++, j++) {
            if (charToIntVal.get(letters[i]) >= charToIntVal.get(letters[j])) {
                result += charToIntVal.get(letters[i]);
            }
            else {
                result -= charToIntVal.get(letters[i]);
            }
        }
        result += charToIntVal.get(letters[i]);
        return result;
    }



    // ...



    // --- see below for first solution ----



    // ...



    // ---------------------------------------------------------------------------------------------------------

    private int getSingleLetterValueAsInt(String currentRomanNumeralChar) {
        return letterToIntVal.get(currentRomanNumeralChar);
    }

    public int romanToInt_attempt_1(String s) {

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int currentLetterValue = getSingleLetterValueAsInt(s.substring(i, i+1));
            int nextLetterValue = getSingleLetterValueAsInt(i+2 > s.length() ? "" : s.substring(i+1, i+2));

            if (nextLetterValue <= currentLetterValue) {
                result += currentLetterValue;
            }
            else {
                result -= currentLetterValue;
            }
        }
        return result;
    }

}
