package com.coding.practice.roman;

import javax.management.RuntimeMBeanException;
import java.util.HashMap;
import java.util.Map;

public class Roman {

    Map<Integer, String> numberRomanMap;

    public Roman() {
        this.numberRomanMap = new HashMap<>();
        initialiseMap();
    }

    public void initialiseMap() {
        numberRomanMap.put(1, "I");
        numberRomanMap.put(2, "II");
        numberRomanMap.put(3, "III");
        numberRomanMap.put(4, "IV");
        numberRomanMap.put(5, "V");
        numberRomanMap.put(6, "VI");
        numberRomanMap.put(7, "VII");
        numberRomanMap.put(8, "VIII");
        numberRomanMap.put(9, "IX");
        numberRomanMap.put(10, "X");
        numberRomanMap.put(20, "XX");
        numberRomanMap.put(30, "XXX");
        numberRomanMap.put(40, "XL");
        numberRomanMap.put(50, "L");
        numberRomanMap.put(60, "LX");
        numberRomanMap.put(70, "LXX");
        numberRomanMap.put(80, "LXXX");
        numberRomanMap.put(90, "XC");
        numberRomanMap.put(100, "C");
        numberRomanMap.put(500, "D");
        numberRomanMap.put(1000, "M");
//        numberRomanMap.put(0, "");

    }

    public String convert(int number) {

        if (number <= 0) {
            throw new RuntimeException();
        }
        if (number < 10) {
            return numberRomanMap.get(number);
        }
        else if (number < 100) {
            if (numberRomanMap.containsKey(number)) {
                return numberRomanMap.get(number);
            }
            String s1 = numberRomanMap.get(number % 10 * 10); // X
            String s2 = numberRomanMap.get(number % 10); // I
            return s1 + s2;
        }
        else if (number < 1000) {
            if (numberRomanMap.containsKey(number)) {
                return numberRomanMap.get(number);
            }
            String s1 = numberRomanMap.get(number / 100 * 100); // X
            String s2 = numberRomanMap.get(number % 10 * 10); // X
            String s3 = numberRomanMap.get(number % 10); // I
            return s1 + s2 + s3;
        }

        return "error";
    }
}
