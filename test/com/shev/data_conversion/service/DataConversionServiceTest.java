package com.shev.data_conversion.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class DataConversionServiceTest {
    @Test
    public void getBiggestPalindrome() {
        int minTest = 1000;
        int maxTest = 9999;
        int expectedBiggestPalindrome = 99000099;
        assertTrue(DataConversionService.getBiggestPalindrome(minTest,maxTest)==expectedBiggestPalindrome);
    }

    @Test
    public void getDigitsSumByRemainderOfDivision() {
        int testDigit = 8523;
        int expectedSum = 18;
        assertTrue(DataConversionService.getDigitsSumByRemainderOfDivision(testDigit)==expectedSum);
    }

    @Test
    public void getDigitsSumByDivisionToSymbols() {
        int testDigit = 85235;
        int expectedSum = 23;
        assertTrue(DataConversionService.getDigitsSumByDivisionToSymbols(testDigit)==expectedSum);
    }


}
