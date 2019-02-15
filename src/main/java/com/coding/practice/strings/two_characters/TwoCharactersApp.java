package com.coding.practice.strings.two_characters;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TwoCharactersApp {

    // Complete the alternate function below.
    static int alternate(String s) {
        String[] arr = s.split("");
        Set<String> set = new HashSet<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    continue;
                }

                if (!set.contains(arr[i] + arr[j]) && !set.contains(arr[j] + arr[i])) {
                    set.add(arr[i] + arr[j]);
                }
            }
        }

        int longestStringCount = 0;

        for (String pair : set) {
            int count = 0;
            List<String> list = new ArrayList<>();
            for (int k = 0; k < arr.length; k++) {
                if (pair.contains(arr[k])) {
                    if(list.isEmpty()) {
                        count++;
                        list.add(arr[k]);
                        continue;
                    }

                    if (list.get(list.size()-1).equals(arr[k])) {
                        System.out.println("Invalid pair: " + pair);
                        count = 0;
                        break;
                    }
                    count++;
                    list.add(arr[k]);
                }
            }

            longestStringCount = Math.max(longestStringCount, count);
        }
System.out.println(longestStringCount);
        return longestStringCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
