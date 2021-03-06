 package crio.ArraySorting;

import java.util.*;

class NextGreaterElementWithSameSetOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print(nextGreaterElementWithSameSetOfDigits(n));
    }
    public static int convertListToNumber(List<Integer> ls){
        int newNumber = 0;
        for(int i = 0; i < ls.size(); i++){
            newNumber += ls.get(i) * Math.pow(10,ls.size()-1-i);
        }
        return newNumber;
    }
    public static void sort(List<Integer> ls, int from, int to){
        for(int i = from; i < to; i++){
            for(int j = i+1; j < to; j++){
                if(ls.get(i) > ls.get(j)){
                    Collections.swap(ls, i, j);
                }
            }
        }
    }

    public static int findNextLeastGreaterThanCurr(List<Integer> ls, int k, int from){
        int minIndexOfNextElement = from;
        for(int fn = from+1; fn < ls.size(); fn++){
            if(ls.get(k) < ls.get(fn) && ls.get(fn) < ls.get(minIndexOfNextElement)){
                minIndexOfNextElement  = fn;
            }
        }
        return minIndexOfNextElement;
    }

    public static List<Integer> convertNumberToList(int n){
        List<Integer> ls = new ArrayList<>();
        while(n > 0){
            ls.add(n%10);
            n/=10;
        }
        Collections.reverse(ls);
        return ls;
    }

    static int nextGreaterElementWithSameSetOfDigits(int n){

        List<Integer> ls = convertNumberToList(n);

        if(ls.size() == 1) return -1;

        int first = ls.size()-2, second = ls.size()-1;

        for(; first >= 0; first--, second--){
            if(ls.get(second) > ls.get(first)){

                int minIndexOfNextElement = findNextLeastGreaterThanCurr(ls, first, second);

                Collections.swap(ls, minIndexOfNextElement, first);

                //sort from second to ls.size() // last index is exclusive
                sort(ls, second, ls.size());
                break;
            }
        }

        int newNumber = convertListToNumber(ls);

        if(n == newNumber){
            return -1;
        } else {
            return newNumber;
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
