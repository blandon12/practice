package com.coding.practice.greedy.minimum_absolute_difference;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumAbsoluteDifferenceApp {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {


        // Optimal solution
        int diff = arr[arr.length - 1] - arr[0];
        Arrays.sort(arr);
        for (int i=0;i<arr.length - 1;i++) {
            int n = Math.abs(arr[i] - arr[i+1]);
            diff = n < diff ? n : diff;
        }
        return diff;

//        int result = 0;
//        Integer diff = null;
//        List<Integer> list = new ArrayList<>();
//        for (Integer i : arr) {
//            list.add(i);
//        }
//        Collections.sort(list);
//
//        for (int i=0; i<list.size()-1; i++) {
//            int value = Math.abs(list.get(i) - list.get(i+1));
//
//            if (diff == null) {
//                diff = value;
//            } else {
//                diff = diff > value ? value : diff;
//            }
//        }
//
//        return diff == null ? result : diff;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
