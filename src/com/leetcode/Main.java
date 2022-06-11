package com.leetcode;


public class Main {

    public static void main(String[] args) {

        //problem 1
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        TwoSum twoSum = new TwoSum();
//        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
//        System.out.println(Arrays.toString(twoSum.twoSumV2(nums, target)));

        //problem 9
//        PalindromeNumber palindromeNumber = new PalindromeNumber();
//        System.out.println(palindromeNumber.isPalindrome(10));

        //problem 13
//        RomanToInteger romanToInteger = new RomanToInteger();
//        System.out.println(romanToInteger.romanToInt("III"));
//        System.out.println(romanToInteger.romanToInt("LVIII"));
//        System.out.println(romanToInteger.romanToInt("MCMXCIV"));

        //problem 14
//        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
//        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "floight"}));

        //problem 20
//        ValidParentheses validParentheses = new ValidParentheses();
//        System.out.println(validParentheses.isValid("()[]{}"));
//        System.out.println(validParentheses.isValid("(]"));
//        System.out.println(validParentheses.isValid("([)]{}"));
//        System.out.println(validParentheses.isValid("({[]})"));
//        System.out.println(validParentheses.isValid("["));
//        System.out.println(validParentheses.isValid("([}}])"));

        //problem 21
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);


    }
}
