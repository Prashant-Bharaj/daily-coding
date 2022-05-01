package general;

import java.util.*;

class BigIntegerAddition {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String ans = bigIntegerAddition(num1, num2);
        System.out.println(ans);

    }

    // TODO: Implement this method
    static String bigIntegerAddition(String num1, String num2) {


        int i = num1.length()-1, j = num2.length()-1, carry = 0;
        String ans="";
        while(i >= 0 && j >= 0) {
            int x = num1.charAt(i) + num2.charAt(j) + carry - '0' - '0';
            carry = (x )/10;
            ans += (x ) % 10;
            i--; j--;
        }

        while(carry != 0 && i >= 0) {
            int x = num1.charAt(i) + carry - '0';
            carry = (x )/10;
            ans += (x ) % 10;
            i--;
        }
        long z = 2;
        while(carry != 0 && j >= 0) {
            int x = num2.charAt(j) + carry - '0';
            carry = (x )/10;
            ans += (x ) % 10;
            j--;
        }

        while(i >= 0) {
            ans += num1.charAt(i);
            i--;
        }
        while(j >= 0) {
            ans += num2.charAt(j);
            j--;
        }
        String ans2="";
        for(int index = ans.length()-1; index >= 0; index--) {
            ans2 += ans.charAt(index);
        }
        return ans2;
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