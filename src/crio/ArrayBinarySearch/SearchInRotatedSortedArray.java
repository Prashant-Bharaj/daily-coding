 package crio.ArrayBinarySearch;

import java.io.*;
import java.util.*;
class SearchInRotatedSortedArray {
    int findPivot(int[] nums){
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
    int binarySearch(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target) return mid;
            if(nums[mid] < target) left = mid + 1;
            else right  = mid - 1;
        }
        return -1;
    }
    // Complete the function implementation below
    public int search(int[] nums, int target) {

        int sLeft = findPivot(nums);
        if(nums[nums.length-1] < nums[0] && target < nums[0]){
            return binarySearch(nums, sLeft, nums.length-1, target);
        } else if(sLeft == 0){
            return binarySearch(nums, 0, nums.length-1, target);
        }
        else{
            return binarySearch(nums, 0, sLeft-1, target);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        while(q > 0) {
            int target = scanner.nextInt();
            int result = new SearchInRotatedSortedArray().search(nums , target);
            System.out.println(result);
            q--;
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