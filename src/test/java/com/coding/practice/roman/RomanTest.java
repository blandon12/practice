package com.coding.practice.roman;

import org.junit.Before;
import org.junit.Test;
import sun.java2d.xr.XIDGenerator;

import static org.junit.Assert.*;

public class RomanTest {

    Roman roman;

    @Before
    public void setUp() throws Exception {
        roman = new Roman();
    }

    @Test
    public void convertNumberOneToRomanNumberI() {
        int number = 1;
        String romanNumber = roman.convert(number);
        assertEquals("I", romanNumber);
    }

    @Test
    public void convertNumberFiveToRomanNumberV() {
        int number = 5;
        String romanNumber = roman.convert(number);
        assertEquals("V", romanNumber);
    }

    @Test
    public void convertNumberTenToRomanNumberX() {
        int number = 10;
        String romanNumber = roman.convert(number);
        assertEquals("X", romanNumber);
    }

    @Test
    public void convertNumberFiftyToRomanNumberL() {
        int number = 50;
        String romanNumber = roman.convert(number);
        assertEquals("L", romanNumber);
    }

    @Test
    public void convertNumberOneHundredToRomanNumberC() {
        int number = 100;
        String romanNumber = roman.convert(number);
        assertEquals("C", romanNumber);
    }

    @Test
    public void convertNumberOneHundredOneToRomanNumberC() {
        int number = 111;
        String romanNumber = roman.convert(number);
        assertEquals("CXI", romanNumber);
    }

//    @Test
//    public void convertNumberFiveHundredToRomanNumberD() {
//        int number = 500;
//        String romanNumber = roman.convert(number);
//        assertEquals("D", romanNumber);
//    }
//
//    @Test
//    public void convertNumberOneThousandToRomanNumberM() {
//        int number = 1000;
//        String romanNumber = roman.convert(number);
//        assertEquals("M", romanNumber);
//    }

    @Test (expected = RuntimeException.class)
    public void convertNumberZeroToError() {
        int number = 0;
        String romanNumber = roman.convert(number);
    }

    @Test
    public void convertTwoDigitalNumberToRomanNumber() {
        int number = 11;
        String romanNumber = roman.convert(number);
        assertEquals("XI", romanNumber);
    }

    @Test
    public void convertTwoDigitalNumberToRomanNumberFor99() {
        int number = 99;
        String romanNumber = roman.convert(number);
        assertEquals("XCIX", romanNumber);
    }
}