package crio;

import java.io.*;
import java.util.*;

class Pair{
    public int index;
    public int mx;
    Pair(int i, int m){
        index = i;
        mx = m;
    }
}

class ContainerWithMostWater {

    // Complete the function implementation below
    public int maxArea(int[] height) {

        int left = 0, right = height.length-1, mxC = 0;
        while(left<right){
            int min = Math.min(height[left], height[right]);
            mxC = Math.max(mxC, min*(right-left));

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return mxC;
//        int mn,  mxC = 0;
//        Pair p = new Pair(0, height[0]);
//        for(int i = 1; i < height.length; i++){
//            mn = Math.min(p.mx, height[i]);
//            mxC = Math.max(mxC, mn*(i-p.index+1));
//            if(p.mx != Math.max(p.mx, height[i])){
//                p.mx = Math.max(p.mx, height[i]);
//                p.index = i;
//            }
//        }
//        return mxC;
//        int mxC = 0;
//
//        for(int i = 0; i < height.length-1; i++){
//            for(int j = i+1; j < height.length; j++){
//                int mn = Math.min(height[i], height[j]);
//                mxC = Math.max(mxC, mn*(j-i));
//            }
//        }
//        return mxC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int height[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            height[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new ContainerWithMostWater().maxArea(height);
        System.out.println(result);
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