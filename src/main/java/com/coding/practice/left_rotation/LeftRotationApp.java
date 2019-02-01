package com.coding.practice.left_rotation;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotationApp {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        Deque<Integer> deque = new ArrayDeque<>();
        for (int number : a) {
            deque.add(number);
        }

        while (d>0) {
            deque.addLast(deque.pollFirst());
            d--;
        }

        int i = 0;
        Iterator<Integer> dequeIterator = deque.iterator();
        int[] result = new int[deque.size()];
        while (dequeIterator.hasNext()) {
            result[i] = dequeIterator.next();
            i++;
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
