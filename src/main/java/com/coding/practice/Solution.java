package com.coding.practice;

public class Solution {
    private static int[][] arr;

    public static void main(String[] args) {
        String s = "GGCACCACG";
        String t = "ACGGCGGATACG";

//        String s = "AAABA";
//        String t = "BBBA";

        arr = new int[s.length()+1][t.length()+1];
        int result = lcs(s, t, s.length(), t.length());
        System.out.println(result);
    }

    private static int lcs(String s, String t, int m, int n) {

        int result = 0;

        if (m == 0 || n == 0) {
            return result;
        }

        if (arr[m][n] > 0) {
            return arr[m][n];
        }

        if (s.substring(m-1).equals(t.substring(n-1))) {
            result = 1 + lcs(s.substring(0, m-1), t.substring(0, n-1), m-1, n-1);
            arr[m][n] = result;
        }

        if (!s.substring(m-1).equals(t.substring(n-1))) {
            result = Math.max(lcs(s.substring(0, m-1), t.substring(0, n), m-1, n),
                lcs(s.substring(0, m), t.substring(0, n-1), m, n-1));
            arr[m][n] = result;
        }

        return result;
    }

    private static String reverse(String s) {

        if (s.length() == 1) {
            return s;
        }

        return s.substring(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }
}
