 package crio.ArraySorting;

import java.util.*;

class SortArrayAbsolute {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res[] = sortArrayAbsolute(n, arr);

        for (int j : res)
            System.out.print(j + " ");
    }
    static void mergeSort(int[] arr, int l, int r){
        if(l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
    static void merge(int[] arr, int l, int mid, int r){
        int left = l;
        int right = mid+1;
        List<Integer> ls = new ArrayList<>();
        while(left <= mid && right <= r){
            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                ls.add(arr[left]);
                left++;
            } else {
                ls.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            ls.add(arr[left]);
            left++;
        }
        while(right <= r){
            ls.add(arr[right]);
            right++;
        }
        for(Integer e : ls){
            arr[l++] = e;
        }

    }

    static int[] sortArrayAbsolute(int n, int arr[]) {
        mergeSort(arr, 0, n-1);
        return arr;
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