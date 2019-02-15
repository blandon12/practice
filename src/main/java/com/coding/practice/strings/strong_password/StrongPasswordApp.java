package com.coding.practice.strings.strong_password;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPasswordApp {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int result = 0;
        String pass = password.trim();
        if (!pass.matches("(.*)[a-z](.*)")) {
            System.out.println("low case missing");
            result++;
        }

        if (!pass.matches("(.*)[A-Z](.*)")) {
            System.out.println("upper case missing");
            result++;
        }

        if (!pass.matches("(.*)[0-9](.*)")) {
            System.out.println("digital missing");
            result++;
        }

        if (!pass.matches("(.*)[!@#$%^&*()+-](.*)")) {
            System.out.println("special case missing");
            result++;
        }

        if ((n + result) < 6) {
            result += (6 - n - result);
        }
        System.out.println(result);

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
