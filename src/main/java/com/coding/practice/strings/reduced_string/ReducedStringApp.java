package com.coding.practice.strings.reduced_string;

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

public class ReducedStringApp {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        // aaabccddd
        String[] sa = s.split("");
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < sa.length) {
            if ((i+1) < sa.length && sa[i].equals(sa[i+1])) {
                i += 2;
                continue;
            }

            if (list.isEmpty()) {
                list.add(sa[i]);
                i++;
                continue;
            }

            if (list.get(list.size()-1).equals(sa[i])) {
                list.remove(list.size()-1);
            } else {
                list.add(sa[i]);
            }

            i++;
        }

        for (String w : list) {
            stringBuilder.append(w);
        }

        return list.isEmpty() ? "Empty String" : stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

