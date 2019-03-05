package com.coding.practice.strings.caesar_cipher;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipherApp {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] originalArr = alphabet.split("");
        Map<String, String> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        int r = k;
        if (k > 26) {
            r = k % 26;
        }
        for (int i = 0; i < originalArr.length; i++) {
            if (i + r >= 26) {
                map.put(originalArr[i], originalArr[i + r - 26]);
            } else {
                map.put(originalArr[i], originalArr[i + r]);
            }
        }

        for (String c : s.split("")) {
            if (alphabet.contains(c)) {
                stringBuilder.append(map.get(c));
            } else if (alphabet.contains(c.toLowerCase())) {
                stringBuilder.append(map.get(c.toLowerCase()).toUpperCase());
            } else {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
