package com.coding.practice.strings.valid_string;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class ValidStringApp {

    // Complete the isValid function below.
    static String isValid(String s) {

        String result = "YES";
        int[] count = new int[26];
        String[] sArray = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String c : sArray) {
            if (map.keySet().contains(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        List<Integer> sortedList = map.values().stream().sorted().collect(Collectors.toList());

        if (sortedList.size() == 1) {
            return result;
        }

        if (sortedList.get(0) == 1 && sortedList.get(1).compareTo(sortedList.get(sortedList.size()-1)) == 0) {
            return result;
        }

        if (sortedList.get(sortedList.size()-1) - sortedList.get(0) > 1) {
            result = "NO";
        }

        if (sortedList.get(sortedList.size() - 2).compareTo(sortedList.get(0)) != 0) {
            result = "NO";
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
