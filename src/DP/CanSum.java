package DP;

import java.util.*;

/**
 * here we see if sum is possible for the given target value from the given
 * array number and repeatation of number is also allowed.
 */
public class CanSum {
    private static HashMap<Integer, Boolean> memo = new HashMap<Integer, Boolean>();

    public static boolean canSum(int[] values, int target) {
        if (memo.containsKey(target))
            return memo.get(target);
        if (target == 0)
            return true;
        if (target < 0)
            return false;
        for (int num : values) {
            // reduce the target value by the values from the values[]
            int remainder = target - num;

            // if(canSum(values, remainder) == true) return true;
            if (canSum(values, remainder)) {
                memo.put(target, true);
                return true;
            }
        }
        memo.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        scanner.close();
        int[] values = { 2, 4 };
        System.out.println(canSum(values, target));
        int[] values2 = { 7, 14 };
        System.out.println(canSum(values2, 300));
    }

}
