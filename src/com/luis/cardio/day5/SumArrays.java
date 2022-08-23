package src.com.luis.cardio.day5;

import java.util.Arrays;
import java.util.List;

/**
 * this class resolves the problem on:
 * https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
 */
public class SumArrays {

    public static void main(String[] args) {
        System.out.println("The sum of the array is --> " + getSumAllInt(Arrays.asList(1,2,3,4,5)));
    }

    /**
     * Functional approach of returning the sum of the elements
     * in an integer array
     * @param list
     * @return
     */
    private static int getSumAllInt(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
