package com.abhishek.leetcode;

import java.util.HashMap;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap map = new HashMap();
        
        int result = 0;
        for(int i = 0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int value = (int) map.get(nums[i]);
                result = result + value;
                value = value + 1;
                map.put(nums[i], value);
            } else {
                map.put(nums[i], 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1,1,1,1};
        System.out.println(new GoodPairs().numIdenticalPairs(input));
    }
}
