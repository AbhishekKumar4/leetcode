package com.abhishek.leetcode;

import java.util.Arrays;

public class RestoreString {

    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for(int i = 0; i< indices.length ; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return Arrays.toString(result);
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        System.out.println(new RestoreString().restoreString(s, indices));
    }
}
