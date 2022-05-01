package DP;

import java.util.*;

public class HowSum {

    private static HashMap<Integer, ArrayList<Integer>> memo = new HashMap<Integer, ArrayList<Integer>>();

    public static ArrayList<Integer> howSum(int[] numbers, int target) {
        // check memo if it contains the subtree of the target
        if (memo.containsKey(target))
            return memo.get(target);

        // if target is zero i.e. it is empty => sum is possible & return empty array
        if (target == 0)
            return new ArrayList<Integer>();

        if (target < 0)
            return null;

        for (int num : numbers) {
            ArrayList<Integer> result = howSum(numbers, target - num);
            if (result != null) {
                result.add(num);
                memo.put(target, result);
                return result;
            }
        }
        memo.put(target, null);
        return null;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 7 };
        int[] arr2 = { 7, 14 };

        // howSum(arr1, 3);
        ArrayList<Integer> containedValues = howSum(arr1, 3);
        System.out.println(containedValues != null ? containedValues.toString() : "null");

        containedValues = howSum(arr1, 9);
        System.out.println(containedValues != null ? containedValues.toString() : "null");

        containedValues = howSum(arr2, 10);
        System.out.println(containedValues != null ? containedValues.toString() : "null");

        containedValues = howSum(arr2, 300);
        System.out.println(containedValues != null ? containedValues.toString() : "null");
    }
}
