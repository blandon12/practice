package com.coding.practice.sorting.quicksort;

import java.util.Arrays;

public class QuicksortApp {

    public static void main(String[] args) {

        int[] arr = {15, 3, 8, 9 ,4 ,1 ,5, 6, 7, 12};
        int left = 0;
        int right = arr.length - 1;

        quickSort(arr, left, right);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr[(left + right)/2];
        int index = partition(arr, left, right, pivot);

        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);

    }

    private static int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return left;
    }
}