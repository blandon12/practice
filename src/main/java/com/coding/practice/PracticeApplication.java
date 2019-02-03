package com.coding.practice;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
//        int[] aa = {1, 2, 3};
//        int[] bb = {1, 2, 4};
//        System.out.println(Arrays.equals(aa,bb));

        // a a b c
        // a a a b c
        String w = "abcd";
        System.out.println(w.substring(2, 4));

//        SpringApplication.run(PracticeApplication.class, args);
    }

}

