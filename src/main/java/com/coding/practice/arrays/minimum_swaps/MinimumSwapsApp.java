package com.coding.practice.arrays.minimum_swaps;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwapsApp {

    private static int result = 0;

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int currentMin = 1;
        int currentInd = 0;
        int minSwapsCount = 0;
        while (currentMin != arr.length) {
            for (int i = currentInd; i < arr.length; i++) {
                if (arr[i] == currentMin) {
                    if (i == currentInd) { //It is already sorted..
                        currentInd++;
                        currentMin++;
                        break;
                    }
//                    swap(arr, i, currentInd);
                    int temp = arr[i];
                    arr[i] = arr[currentInd];
                    arr[currentInd] = temp;


                    minSwapsCount++;
                    currentInd++;
                    currentMin++;
                }
            }
        }
        return minSwapsCount;
//        quicksort(arr, 0, arr.length - 1);
//System.out.println(result);
//for (int v : arr) {
//    System.out.print(v + " ");
//}
//        return result;
//    }
//
//    private static void quicksort(int[] arr, int left, int right) {
//        if (left >= right) {
//            return;
//        }
//
//        int pivot = arr[(left+right)/2];
////System.out.println(pivot);
//        int index = partition(arr, left, right, pivot);
////System.out.println(index);
//        quicksort(arr, left, index - 1);
//        quicksort(arr, index, right);
    }

    private static int partition(int[] arr, int left, int right, int pivot) {

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left < right) {
                System.out.println("swap: " + arr[left] + " " + arr[right]);

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                result++;
            } else if (left == right) {
                left++;
                right--;
            }
        }

        return left;
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

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
