package crio.array.prefix.sum;

import java.util.Scanner;
public class ContiguousSequence {
    public static  long contiguousSequence(int arr[] , int n) {
        long sum = 0, mx = 0, overAllMax = arr[0];
        for(int i = 0; i < n; i++){
            sum += arr[i];
            overAllMax = Math.max(arr[i], overAllMax);
            mx = Math.max(mx, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        if(overAllMax < 0) return overAllMax;
        return mx;

        // smaller solution
        // long curSum = arr[0], globalSum = arr[0];
        // for(int i = 1; i < n; i++){
        // 	curSum = Math.max(curSum+ arr[i], arr[i]);
        // 	if(curSum > globalSum){
        // 		globalSum = curSum;
        // 	}
        // }
        // return globalSum;

    }
    public static void  main (String args []) {

        Scanner sc =  new  Scanner (System.in);

        int n = sc.nextInt();
        int arr [] = new int[n + 5];
        for ( int i = 0 ; i < n; i++)
            arr[i] = sc.nextInt();

        long max = contiguousSequence(arr, n);
        System.out.println(max);

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