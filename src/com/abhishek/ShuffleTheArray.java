package com.abhishek.leetcode;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int start = 0;
        int mid = n;
        int[] result = new int[nums.length];
        for(int i =0 ; i<2*n;i= i+2) {
            result [i] = nums[start++];
            result[i+1] = nums[mid++];
        }
        return result;
    }
}
