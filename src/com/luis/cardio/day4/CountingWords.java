package src.com.luis.cardio.day4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This is the solution for the counting words problem in an array
 * Using naive approach and functional programing
 */
public class CountingWords {

    /**
     * Counts the words in a string
     * @param s the string of words
     * @return a string with the format: {word1=3,word2=2...}
     */
    public static String naiveApproach(String s){
        HashMap<String,Integer> map = new HashMap<>();
        String[] arr = s.toLowerCase().split(" ");
        for(String word : arr){
            if(!map.containsKey(word)){
                map.put(word,1);
            }else{
                map.put(word, map.get(word) + 1);
            }
        }
        return map.toString();
    }

    /**
     * Counting the words in a String with functional programming
     * @param s The string of words
     * @return a string with the format:  {word1=3,word2=2...}
     */
    public static String functionalApproach(String s){
        String response = "";
        String[] arr = s.toLowerCase().split(" ");
        Map<String,Long> m = Arrays.stream(arr).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        return m.toString();
    }

    public static void main(String[] args) {
        System.out.println("Naive approach --> " + naiveApproach("hola luis hola edisa hola ana ana es mi mama"));
        System.out.println("Functional Programming --> " + functionalApproach("hola luis hola edisa hola ana ana es mi mama"));
    }
}
