package DP;

import java.util.*;

/*
    fibbonacci number: 1, 1, 2, 3, 5, 8, 13, ...
*/

public class Fibonacci {
    public static long fib(int number, long []memo){
        if(memo[number] != 0) return memo[number];
        if(number <= 2) return 1;
        memo[number] = fib(number - 1, memo) + fib(number - 2, memo);
        return memo[number];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long []memo = new long[number+1];
        scanner.close();
        System.out.println(fib(number, memo)); //
    }
    
}
