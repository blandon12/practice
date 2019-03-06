package com.coding.practice.recursion.logn;

public class LogNApp {

    private static double fact(int n) {
        if (n==1) {
            return Math.log(1);
        }

        return Math.log(n) + fact(n-1);
    }

    public static void main(String[] args) {

        System.out.println(fact(3));

    }
}