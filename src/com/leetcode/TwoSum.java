package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * Example:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * */


    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                int tmp = target - nums[i];
                if (nums[j] == tmp) {
                    return new int[]{i, j};
                }

            }

        }
        throw new IllegalArgumentException("no match");
    }

    public int[] twoSumV2(int[] nums, int target) {

        Map<Integer, Integer> num_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];
            if (num_map.containsKey(complement)) {
                return new int[]{num_map.get(complement), i};
            }
            num_map.put(nums[i], i);

        }
        throw new IllegalArgumentException("no match");

    }

}
