package com.coding.practice.search.ice_cream_parlor;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IceCreamPalorApp {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {

        LinkedList<Integer> p = new LinkedList<>();
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(1);

        System.out.println(p.toString());
        Collections.reverse(p);
        System.out.println(p.toString());
        p.sort(Collections.reverseOrder());
        System.out.println(p.toString());
        Collections.sort(p);
        System.out.println(p.toString());

        List<Integer> list = new ArrayList<>();
        for (int c : cost) {
            list.add(c);
        }

        Arrays.sort(cost);
        for (int i=0;i<cost.length;i++) {

            int key = Arrays.binarySearch(cost, money - cost[i]);

            Arrays.binarySearch(cost, i+1, cost.length, money-cost[i]);

            if (key > 0 && key != i) {
                int m = list.indexOf(cost[i]) + 1;
                int n = list.lastIndexOf(cost[key]) + 1;
                String result = m<n ? m + " " + n : n + " " + m;
                System.out.println(result);
                break;
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
