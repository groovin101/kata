package com.groovin101.kata.beg;

import java.util.Arrays;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based
 * on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 *
 * EXAMPLE:
 *  Given n = 5, and version = 4 is the first bad version.
 *
 *  call isBadVersion(3) -> false
 *  call isBadVersion(5) -> true
 *  call isBadVersion(4) -> true
 *
 *  Then 4 is the first bad version.
 */
public class KataFirstBadVersion {

    public int firstBadVersion(int n) {

        int[] arr = new int[n+1];
        for (int i=0;i<=n;i++) {
            arr[i] = i;
        }
        return findFirstBad(arr);
    }

    int findFirstBad(int[] arr) {
        if (arr.length <=1) {
            return arr[0];
        }
        if (arr.length == 2) {
            if (VersionControl.isBadVersion(arr[0])) {
                return arr[0];
            }
            return arr[1];
        }
        if (VersionControl.isBadVersion(arr[arr.length/2])) {
            return findFirstBad(Arrays.copyOfRange(arr, 0, (arr.length/2)+1));
        }
        else {
            return findFirstBad(Arrays.copyOfRange(arr, arr.length/2, arr.length-1));
        }
    }

    private static class VersionControl {
        static boolean isBadVersion(int version) {
            if (version >= 4) {
                return true;
            }
            return false;
        }
    }
}
