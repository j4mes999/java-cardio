package src.com.luis.cardio.day2;

/**
 * This class solves the problem mentioned at:
 * https://www.hackerrank.com/challenges/30-bitwise-and/problem?utm_campaign=30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder
 *
 */
public class BitWise {

    public static int bitwiseAnd(int N, int K){

        //Naive approach. Worked.
        int maxWiseAnd = 0;
        int tmpInt = 0;
        for (int i = 1; i <= N ; i++) {
            for (int j = i + 1; j < N ; j++) {
                tmpInt = i&j;
                if(tmpInt > maxWiseAnd && tmpInt < K){
                    maxWiseAnd = tmpInt;
                }
            }
        }
        return maxWiseAnd;
    }

    public static void main(String[] args) {

        System.out.println("The result is --> " + bitwiseAnd(2,2));

    }


}
