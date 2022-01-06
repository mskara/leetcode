package com.leetcode;

public class PalindromeNumber {

    /*Given an integer x, return true if x is palindrome integer.
     *An integer is a palindrome when it reads the same backward as forward.
     *For example, 121 is a palindrome while 123 is not.
     * */

    public boolean isPalindrome(int x) {

        int val = x;
        if (x < 0)
            return false;

        if (x < 10)
            return true;

        int reversed_int = 0;
        while (x > 0) {
            int remainder = x % 10;
            x /= 10;
            reversed_int = (reversed_int * 10) + remainder;
        }
        return val == reversed_int;
    }
}
