package DP;

/**
 * fibonacci: 1 1 2 3 5
 */

import java.util.*;

public class FibonacciHashMap {
    private static HashMap<Integer, Long> memo = new HashMap<Integer, Long>();

    public static long fib(int number) {
        if (number <= 2)
            return 1;
        if (memo.containsKey(number))
            return memo.get(number);
        long result = fib(number - 1) + fib(number - 2);
        memo.put(number, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(3) + "\n" + fib(50));
    }

}
