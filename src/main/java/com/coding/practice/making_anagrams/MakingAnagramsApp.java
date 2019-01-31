package com.coding.practice.making_anagrams;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagramsApp {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int result = 0;

        HashMap<String, Integer> aMap = new HashMap<>();
        for (String aChar : a.split("")) {
            if (aMap.containsKey(aChar)) {
                aMap.put(aChar, aMap.get(aChar) + 1);
            } else {
                aMap.put(aChar, 1);
            }
        }

        HashMap<String, Integer> bMap = new HashMap<>();
        for (String bChar : b.split("")) {
            if (bMap.containsKey(bChar)) {
                bMap.put(bChar, bMap.get(bChar) + 1);
            } else {
                bMap.put(bChar, 1);
            }
        }

        for (String aKey : aMap.keySet()) {

            if (bMap.containsKey(aKey)) {
                int aDiff = bMap.get(aKey) - aMap.get(aKey);
                if (aDiff > 0) {
                    result += aDiff;
                }
            } else {
                result += aMap.get(aKey);
            }
        }

        for (String bKey : bMap.keySet()) {

            if (aMap.containsKey(bKey)) {
                int bDiff = aMap.get(bKey) - bMap.get(bKey);
                if (bDiff > 0) {
                    result += bDiff;
                }
            } else {
                result += bMap.get(bKey);
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
