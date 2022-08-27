package src.com.luis.cardio.day6;

import java.util.*;

/**
 * Problem from https://leetcode.com/problems/valid-parentheses/
 */
public class Parentheses {

    private static final char RR = ')'; //RR stands for Right Rounded
    private static final char RS = ']'; //RS stands for Right Square
    private static final char RC = '}'; //RC stands for Right Curly
    private static final char LR = '(';
    private static final char LS = '[';
    private static final char LC = '{';
    private static final List<Character> LEFT = Arrays.asList(LR,LS,LC);
    private static final List<Character> RIGHT = Arrays.asList(RR,RS,RC);



    /**
     * Validates if s is a valid parentheses expression
     * @param s contains only (){} or []
     * @return whether s is valid or not
     * ([)]
     * LEFTstack: ( [
     * RIGHTStack: ) ]
     *
     */
    public static boolean isValid(String s){
        //First edge cases
        if(s.length() == 1 || s.length() % 2 == 1)
            return false;
        else if(RIGHT.contains(s.charAt(0)))
            return false;
       Stack<Character> sLeftPar = new Stack<>();
        for (int i = 0; i <= s.length() - 1; i++) {
            if(LEFT.contains(s.charAt(i))){
                sLeftPar.push(s.charAt(i));
            }else if(!sLeftPar.isEmpty() && !matches(sLeftPar.peek(),s.charAt(i))){
                return false;
            }else if(sLeftPar.isEmpty()){
                return false;
            }else{
                sLeftPar.pop();
            }
        }

        return sLeftPar.isEmpty() ? true:false;
    }

    /**
     * Matches if the left parantheses corresponds to the same kind of the right
     * @param left
     * @param right
     * @return
     */
    private static boolean matches(Character left, char right) {
        switch (left){
            case LR:
                if(right == RR)
                    return true;
                break;
            case LC:
                if(right == RC)
                    return true;
                break;
            case LS:
                if(right == RS)
                    return true;
                break;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("response -> " + isValid("()"));



    }

}
