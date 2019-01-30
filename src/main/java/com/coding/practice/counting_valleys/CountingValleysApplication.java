package com.coding.practice.counting_valleys;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleysApplication {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valleysCount = 0;
        Integer level = 0;
        String[] steps = s.split("");

        for (String step : steps) {
            if (step.equals("U")) {
                level += 1;
            } else if (step.equals("D")) {
                level -= 1;
            } else {
                throw new IllegalArgumentException();
            }

            if (level.equals(0)) {
                if (step.equals("U")) {
                    valleysCount++;
                }
            }
        }

        return valleysCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
