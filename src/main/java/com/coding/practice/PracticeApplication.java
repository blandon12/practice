package com.coding.practice;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

@SpringBootApplication
public class PracticeApplication {

    public static Integer reverseInt(Integer a) {
        if (a/10 == 0) {
            return a;
        }

        return Integer.valueOf(Integer.valueOf(a%10).toString() + reverseInt(a/10).toString());
    }

    public static void main(String[] args) {

//        int a = -123456;
        int a = 900;

        System.out.println(reverseInt(Math.abs(a)) * (int) Math.signum(a));


//        SpringApplication.run(PracticeApplication.class, args);
//        double a = 100;
//        double b = 8;
//        double k = 100D / 8D;
//        System.out.println(k);
//
//        Double toBeTruncated = new Double("3.5789055");
//        Double truncatedDouble = BigDecimal.valueOf(toBeTruncated)
//            .setScale(3, RoundingMode.HALF_UP)
//            .doubleValue();
//        System.out.println(truncatedDouble);

//        double d = 1234567.8976;
//        System.out.println(new DecimalFormat("#.###").format(d));
//        System.out.println(new DecimalFormat("0.000").format(d));

//        BigDecimal b1 = BigDecimal.valueOf(0.12).setScale(3, RoundingMode.HALF_UP);
//        BigDecimal b2 = BigDecimal.valueOf(0.1204).setScale(3, RoundingMode.HALF_UP);
//        BigDecimal b3 = BigDecimal.valueOf(0.1205).setScale(3, RoundingMode.HALF_UP);
//        int b4 = BigDecimal.valueOf(0.1205).precision();
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println(b4);


        // a Map with string keys and integer values
//        Map<String, Integer> budget = new HashMap<>();
//        budget.put("clothes", 120);
//        budget.put("grocery", 150);
//        budget.put("transportation", 100);
//        budget.put("utility", 130);
//        budget.put("rent", 1150);
//        budget.put("miscellneous", 90);

        
//
//        System.out.println("map before sorting: " + budget);
//
//        Map<String, Integer> sortedMap = budget
//            .entrySet()
//            .stream()
//            .sorted(comparingByValue())
//            .collect(
//                toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//                    LinkedHashMap::new));
//
//
//        List<List<Integer>> l = new ArrayList<>();
//        l.contains(1);
//        System.out.println("map after sorting by values: " + sortedMap);
//
//        Map<String, Integer> reversedSortedMap = budget
//            .entrySet()
//            .stream()
//            .sorted(Collections.reverseOrder(comparingByValue()))
//            .collect(
//                toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//                    LinkedHashMap::new));
//        System.out.println("map after sorting by values: " + reversedSortedMap);



//StringBuilder stringBuilder = new StringBuilder();
//String s = "w";
//String[] k = new String[2];
//List<String> c;
//Collections.binarySearch(Arrays.asList(k), s);
//s.indexOf("010", 0);
//        char[] sChar = s.toCharArray();
//        Collections.reverse(sChar);
//        s.length()

//        SpringApplication.run(PracticeApplication.class, args);
    }

}


// {teacher=2, rule;It=1, eager=1, children=1, lamb=2, lamb,=1}