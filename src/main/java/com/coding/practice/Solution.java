package com.coding.practice;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {

//        String t = "54321";
//        System.out.println(t.substring(0, 4));

        System.out.println(fact(654321));

        Queue<Integer> queue = new LinkedList<>();
        queue.poll();
        queue.add(1);


    }

    private static int fact(int n) {

        String s = String.valueOf(n);
        return calc(s);

    }

    private static int calc(String s) {
        if (s.length() == 1) {
            return Integer.valueOf(s);
        }

        return calc(s.substring(0, s.length()-1)) + Integer.valueOf(s.substring(s.length()-1));
    }
}