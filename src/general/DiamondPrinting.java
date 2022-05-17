package general;

import java.util.*;

class DiamondPrinting {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] pattern = diamondPrinting(n);

        for (int i = 0; i < 2 * n - 1; i++)
            System.out.println(pattern[i]);

    }

    // TODO: Implement this method
    static String[] diamondPrinting(int n) {



        String[] ans = new String[2*n];
        int mid = n-1;
        for(int i = 0; i < n; i++){
            String s ="";
            for(int j = 0; j < mid; j++){
                s+=" ";
            }
            mid--;
            for(int j = 0; j <= i; j++){
                s+="* ";
            }
            ans[i] = s;
        }
        mid++;
        for(int i = n, k = n-1 ; i < 2*n-1; i++,k--){
//            ans[i] =
            String s = "";
            for(int j = 0; j <= mid; j++){
                s+=" ";
            }
            mid++;
            for(int j = k; j > 0; j--){
                s+="* ";
            }
            ans[i] = s;
        }
        return ans;
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