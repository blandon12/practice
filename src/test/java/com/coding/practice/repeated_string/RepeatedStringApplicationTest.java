package com.coding.practice.repeated_string;

import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedStringApplicationTest {

    @Test
    public void findTheNumberOfAInString() {
        Long result = RepeatedStringApplication.repeatedString("aba", 7);
        assertEquals(Long.valueOf(5), result);

    }
}