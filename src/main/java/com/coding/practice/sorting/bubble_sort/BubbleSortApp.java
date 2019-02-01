package com.coding.practice.sorting.bubble_sort;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSortApp {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int numSwaps = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int n=0;n<a.length;n++) {
            hashMap.put(n, a[n]);
        }

        for (int i=0;i<hashMap.size();i++) {

            for (int j=0;j<hashMap.size()-1;j++) {

                if (hashMap.get(j) > hashMap.get(j+1)) {
                    int nail = hashMap.get(j);
                    hashMap.put(j, hashMap.get(j+1));
                    hashMap.put(j+1, nail);
                    numSwaps++;
                } else {
                    continue;
                }
            }
        }

        System.out.println();
        System.out.println("Array is sorted in "+ numSwaps +" swaps.");
        System.out.println("First Element: " + hashMap.get(0));
        System.out.println("Last Element: " + hashMap.get(hashMap.size()-1));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
