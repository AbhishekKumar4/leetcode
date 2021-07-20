package com.abhishek.leetcode;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i< nums.length ; i++) {
            int count = 0;
            for(int j = 0; j< nums.length; j++) {
                if(nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = { 8, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(new SmallerNumbersThanCurrent().smallerNumbersThanCurrent(input)));
    }
}
