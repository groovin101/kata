package com.groovin101.kata.beg;

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
 *
 *  https://leetcode.com/problems/first-bad-version/description/
 */
public class KataFirstBadProductVersion {

    private VersionControl api;

    public KataFirstBadProductVersion(int firstBadVersionAsDefinedByAPI) {
        api = new VersionControl(firstBadVersionAsDefinedByAPI);
    }

    /**
     * Looking at version n, determine which of the previous versions is actually the first bad version
     * by leveraging the VersionControlAPI.isBadVersion(n) method.
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        if (api.isBadVersion(n) && !api.isBadVersion(n-1)) {
            return n;
        }
        return firstBadVersion(n-1);
    }


    /**
     * Simulates an external API that is aware of the first bad product version, but does not expose it directly.
     * Our job will be to utilize this service to narrow down our own product list and identify, without peaking
     * into the API details itself, which of our products is the first bad version.
     */
    private class VersionControl {

        private int firstBadVersion;

        VersionControl(int firstBadVersionAsDefinedByAPI) {
            this.firstBadVersion = firstBadVersionAsDefinedByAPI;
        }

        boolean isBadVersion(int version) {
            if (version >= firstBadVersion) {
                return true;
            }
            return false;
        }
    }
}
