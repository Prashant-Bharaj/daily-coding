package crio.dsa3.stackAndQueue;

import java.util.*;
class Pair{
    public int index;
    public int data;
    Pair(int index, int data){
        this.index = index;
        this.data = data;
    }
}
class NextLargerElement {

    static int [] nextLargerElement(int nums[], int n) {

        // create monotonic Stack
        Stack<Pair> decreasingOrderStack = new Stack<>();


        for(int i = 0; i < n; i++){
            if(decreasingOrderStack.isEmpty()){
                decreasingOrderStack.push(new Pair(i, nums[i]));
            } else {
                // push into the stack if top is greater
                // else pop();
                while(!decreasingOrderStack.isEmpty() && decreasingOrderStack.peek().data < nums[i]){
                    // pop element and place current nums[i] into the nums
                    Pair pair = decreasingOrderStack.pop();
                    nums[pair.index]  = nums[i];
                }
                // now either stack becomes empty  or top element may not be less than current element
                decreasingOrderStack.push(new Pair(i, nums[i]));
            }
        }
        while(!decreasingOrderStack.isEmpty()){
            Pair pair = decreasingOrderStack.pop();
            nums[pair.index] = -1;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int [] ans = nextLargerElement(ar, n);
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
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