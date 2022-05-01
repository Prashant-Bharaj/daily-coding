package crio;

import java.io.*;
import java.util.*;

public class BestTimeToBuyAndSellStocks {
    public boolean localMaxima(int start, int[] prices){

        // only one element
        // yes it is a localMaxima
        if(start + 1 == prices.length){
            return true;
        }
        // return the index of local Maxima
        if(prices[start] > prices[start+1]){
            return true;
        }
        return false;
    }

    // local minima
    public boolean localMinima(int start, int[] prices){
        if(start + 1 < prices.length && prices[start] < prices[start+1]){
            return true;
        }
        return false;
    }

    // Implement your solution Here
    public int maxProfit(int[] prices) {
        int buy=0, sell=0,profit = 0, temp = 0;
        boolean flag = false;
        // if on the last element don't buy stock
        for(int i = 0; i < prices.length; i++){
            if(localMinima(i, prices) && !flag){
                buy = prices[i];
                i++;
                flag= true;
            }
            if(i< prices.length && localMaxima(i, prices) && flag){
                profit += prices[i] - buy;
                flag = false;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prices = new int[scanner.nextInt()];
        for (int i = 0; i < prices.length; i++)
            prices[i] = scanner.nextInt();
        scanner.close();

        int result = new BestTimeToBuyAndSellStocks().maxProfit(prices);
        System.out.print(Integer.toString(result));
    }
}

/*
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output & extend it to test cases
Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving.
     a. Obvious logic, tests ability to convert logic to code
     b. Figuring out logic
     c. Knowledge of specific domain or concepts
     d. Knowledge of specific algorithm
     e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one
3. Get to a point where you can explain your approach to a 10 year old
4. Take a stab at the high-level logic & write it down.
5. Try to offload processing to functions & keeping your main code small.
Milestone 3: Code by expanding your pseudocode
1. Make sure you name the variables, functions clearly.
2. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
3. Use libraries as much as possible
Milestone 4: Prove to the interviewer that your code works with unit tests
1. Make sure you check boundary conditions
2. Time & storage complexity
3. Suggest optimizations if applicable
*/