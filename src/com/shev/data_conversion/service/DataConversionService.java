package com.shev.data_conversion.service;

public class DataConversionService {

    public static int getBiggestPalindrome(int minNumber, int maxNumber) {
        int biggestPalindrome = 0;

        for(int cursor=0;cursor <= maxNumber-minNumber;cursor++){
            int startValue1 = minNumber+cursor;
            for(int iterator=0;iterator <= maxNumber-minNumber;iterator++){
                int startValue2 = minNumber+iterator;
                int multiplicationDigit = startValue1*startValue2;
                if(DataConversionService.isPalindrome(multiplicationDigit) && biggestPalindrome<multiplicationDigit){
                    biggestPalindrome = multiplicationDigit;
                }
            }
        }
        return biggestPalindrome;
    }

    private static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return integer == reverse;
    }

    public static int getDigitsSumByRemainderOfDivision(int number){
       int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number/ 10;
        }
        return sum;
    }

    public static int getDigitsSumByDivisionToSymbols(int number){
        String stringNumber = String.valueOf(number);
        int sum = 0;
        for (int cursor=0; cursor < stringNumber.length();cursor++) {
            sum += Character.getNumericValue(stringNumber.charAt(cursor));
        }
        return sum;
    }
}
