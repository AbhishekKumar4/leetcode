package com.abhishek.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result =  new ArrayList<>();
        for(int i=0;i< candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i=0;i< candies.length; i++) {
            result.add((candies[i] +  extraCandies) >= max);
        }
        return result;
    }
}
