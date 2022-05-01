package crio;

import java.util.*;


class ReverseWordsInAString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWordsInAString(s));
        sc.close();
    }

    static String reverseWordsInAString(String s){
        // String[] words = s.split(" ");
        // Collections.reverse(Arrays.asList(words));
        // StringBuilder sb = new StringBuilder();
        // for(int i = words.length-1; i >= 0; i--){
        //     sb.append(words[i]);
        //     sb.append(" ");
        // }
        // return sb.toString();
        List<String> words = new ArrayList<>();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!(s.charAt(i) == ' ')){
                flag = true;
                sb.append(s.charAt(i));
            }else if(s.charAt(i)==' ' && flag){
                sb.append(" ");
                flag = false;
            }
        }
        words = Arrays.asList(sb.toString().split(" "));
        Collections.reverse(words);
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < words.size()-1; i++){
            ans.append(words.get(i));
            ans.append(" ");
        }
        ans.append(words.get(words.size()-1));
        return ans.toString();
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