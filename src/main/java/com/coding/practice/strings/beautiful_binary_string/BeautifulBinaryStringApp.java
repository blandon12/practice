package com.coding.practice.strings.beautiful_binary_string;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BeautifulBinaryStringApp {

    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {
        int n = b.length();
        int key = 0;
        int count = 0;

        System.out.println(b.substring(30));
        while (key < n) {

            int i = b.indexOf("010", key);
            if (i >= 0) {
                count++;
                key = i + 3;
            } else {
                break;
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String b = scanner.nextLine();

        int result = beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
