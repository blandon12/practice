package com.coding.practice.two_strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStringsApp {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        String[] firstArray = s1.split("");
        String[] secondArray = s2.split("");

        HashMap<String, Integer> firstHashMap = new HashMap<>();
        for (String letter : firstArray) {
            firstHashMap.put(letter, 1);
        }

        for (String key : secondArray) {
            if (firstHashMap.containsKey(key)) {
                return "YES";
            }
        }

        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}