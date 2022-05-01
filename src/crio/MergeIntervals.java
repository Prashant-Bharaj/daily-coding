package crio;


import java.util.*;

class MergeIntervals {

    public int[][] mergeIntervals(int[][] intervals) {
        int[][] ans = new int[intervals.length][intervals[0].length];
        Arrays.sort(intervals, (a, b)-> a[0]-b[0]);
        int index = 0;
        ans[index][0] = intervals[0][0];
        ans[index][1] = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= ans[index][1]){
                ans[index][1] = Math.max(ans[index][1], intervals[i][1]);
            } else {
                index++;
                ans[index] = intervals[i];
            }
        }
        int[][] ans2 = new int[index+1][2];
        for(int i = 0; i < index+1; i++){
            ans2[i] = ans[i];
        }
        return ans2;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0 ; i < n ;i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int[][] results = new MergeIntervals().mergeIntervals(nums);

        for (int i = 0; i < results.length; ++i) {
            System.out.printf("%d %d\n", results[i][0], results[i][1]);
        }
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