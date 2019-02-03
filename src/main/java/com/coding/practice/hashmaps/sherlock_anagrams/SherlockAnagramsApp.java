package com.coding.practice.hashmaps.sherlock_anagrams;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAnagramsApp {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {

        int result = 0;
        HashMap<String, Integer> map = new HashMap<>();
        String[] sArray = s.split("");
        for (int w = 1; w < sArray.length; w++) {
            for (int i = 0; i < sArray.length; i++) {

                String key = null;
                if (i+w <= sArray.length) {
                    key = s.substring(i,i+w);
                }
                if (key == null) {
                    continue;
                }
                char[] keyChar = key.toCharArray();
                Arrays.sort(keyChar);
                String newKey = new String(keyChar);

                if (map.containsKey(newKey)) {
                    int value = map.get(newKey);
                    result += value;
                    map.put(newKey, value+1);
                } else {
                    map.put(newKey, 1);
                }
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
