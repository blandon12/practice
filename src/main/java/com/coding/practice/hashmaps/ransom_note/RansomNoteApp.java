package com.coding.practice.hashmaps.ransom_note;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RansomNoteApp {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        Hashtable<String, Integer> magazineHash = new Hashtable<>();

        for (String world : magazine) {
            if (magazineHash.containsKey(world)) {
                magazineHash.put(world, magazineHash.get(world) + 1);
            } else {
                magazineHash.put(world, 1);
            }
        }

        for (String n : note) {
            if (magazineHash.containsKey(n) && magazineHash.get(n) >= 1) {
                magazineHash.put(n, magazineHash.get(n) - 1);
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}

