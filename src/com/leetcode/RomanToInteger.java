package com.leetcode;

import java.util.HashMap;

public class RomanToInteger {

    /*
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * Symbol       Value
     *   I             1
     *   V             5
     *   X             10
     *   L             50
     *   C             100
     *   D             500
     *   M             1000
     * For example, 2 is written as II in Roman numeral, just two one's added together.
     * 12 is written as XII, which is simply X + II.
     * The number 27 is written as XXVII, which is XX + V + II.
     *
     * */

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int intValue = 0;
        for (int i = 0; i < s.length(); i++) { //MCMXCIV

            if (i < (s.length() - 1) && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                intValue -= map.get(s.charAt(i));
                continue;
            }

            intValue += map.get(s.charAt(i)); //1000
        }
        return intValue;

    }
}
