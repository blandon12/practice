package com.coding.practice.repeated_string;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedStringApplication {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        Long result = 0L;
        String[] letters = s.split("");
        long repeat = 0L;
        int length = s.length();

        for (String letter : letters) {
            if (letter.equals("a")) {
                repeat++;
            }
        }

        if (n >= length) {
            double timesDouble = Math.floor((double) (n/length));
            long remainer = n % length;

            result = repeat * (long) timesDouble;

            for (int i=0;i<remainer; i++) {
                if (letters[i].equals("a")) {
                    result++;
                }
            }
        }
        else {
            for (int k=0;k<n;k++) {
                if (letters[k].equals("a")) {
                    result++;
                }
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}