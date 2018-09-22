package com.shev.data_conversion;
import com.shev.data_conversion.service.DataConversionService;

import java.util.logging.Logger;

public class MainTask5 {

    private static Logger logger = Logger.getLogger(MainTask5.class.getSimpleName());
    public static void main(String[] args) {

        int number = 12345;
        logger.info("method 'remainder of division' sum of number "+number+" digits is "+DataConversionService.getDigitsSumByRemainderOfDivision(number));

        logger.info("method 'divide to symbols' sum of number "+number+" digits is "+DataConversionService.getDigitsSumByDivisionToSymbols(number));

        int biggestPalindrome = DataConversionService.getBiggestPalindrome(1000,9999);
        logger.info("The biggest palindrome multiplication result of for all four number digit is "+String.valueOf(biggestPalindrome));
    }
}
