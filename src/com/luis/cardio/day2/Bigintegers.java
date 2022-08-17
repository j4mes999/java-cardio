package src.com.luis.cardio.day2;

import java.math.BigInteger;

/**
 * This class solves the problem mentioned at:
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true
 */
public class Bigintegers {

    public static void extraLongFactorials(int n){

        BigInteger result = BigInteger.valueOf(0);



    }

    private BigInteger factorial(int n){
        BigInteger result = BigInteger.valueOf(n);
        BigInteger nMinus = BigInteger.valueOf(n);
        for (int i = n - 1; i <= 1; i--) {
            nMinus = BigInteger.valueOf(i);
            result = result.multiply(nMinus);
        }

        return result;

    }


}
