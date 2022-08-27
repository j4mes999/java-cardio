package src.com.luis.cardio.day6;

import java.util.HashMap;
import java.util.Map;

/**
 * problem from: https://leetcode.com/problems/two-sum/
 */
public class Twosum {

    /**
     * Brute force solution. Time complexity in
     * worst case scenario = O(n^2)
     * @param nums the array with int values
     * @param target the target number
     * @return the indexes where:nums[i] + num[j] = target
     */
    public static int[] twoSumNaive(int[] nums, int target){
        int[] response = {0,0};
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if(nums[i] + nums[j] == target){
                    response[0] = i;
                    response[1] = j;
                    return response;
                }
            }
        }
        return response;
    }

    /**
     * More elegant solution with time complexity O(n)
     * @param nums the array with int values
     * @param target the target number
     * @return the indexes where:nums[i] + num[j] = target
     */
    public static int[] twoSumBestSol(int[] nums, int target){

        //For this solution I need a hashMap
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            Integer reqNum = target - nums[i];
            if(map.containsKey(reqNum)){
                int[] res = {map.get(reqNum), i};
                return res;
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
