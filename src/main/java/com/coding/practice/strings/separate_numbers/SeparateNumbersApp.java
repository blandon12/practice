package com.coding.practice.strings.separate_numbers;

import java.util.Scanner;

public class SeparateNumbersApp {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        int n = s.length();
        if (n==1) {
            System.out.println("NO");
            return;
        }

        for (int i=1;i<=n/2;i++) {
            boolean beautiful = true;
            int curr = 0;
            int count = i;
            Long next = Long.valueOf(s.substring(0, i));
            while ((curr + count) <= n) {
                if (!Long.valueOf(s.substring(curr, curr + count)).equals(next)) {
                    beautiful = false;
                    break;
                }
                next++;
                curr += count;
                count = String.valueOf(next).length();
            }
            if (beautiful && curr==n) {
                System.out.println("YES " + s.substring(0, i));
                return;
            }
        }

        System.out.println("NO");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
