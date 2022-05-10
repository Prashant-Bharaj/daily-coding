package crio.dsa3.hash;

import java.util.*;

// Implement your solution here
class FindAllAnagramsInAString {
    public boolean check(int[] first, int[] second){
        for(int i = 0; i < 26; i++){
            if(first[i] != second[i]) return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        int left = 0, right = 0;
        while(right < p.length()){
            pCount[p.charAt(right)-'a']++;
            right++;
        }
        right-=1;
        for(int i = 0; i <= right%s.length(); i++){
            sCount[s.charAt(i)-'a']++;
        }

        if(check(sCount, pCount)){
            ans.add(left);
        }

        right++;

        while(right < s.length()){
            sCount[s.charAt(left)-'a']--;
            left++;

            sCount[s.charAt(right)-'a']++;
            right++;

            if(check(sCount,pCount)){
                ans.add(left);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[2];
        input = scanner.nextLine().split(" ");
        String s = input[0];
        String p = input[1];

        scanner.close();

        List<Integer> result = new FindAllAnagramsInAString().findAnagrams(s,p);
        System.out.println(result.size());
        for (Integer i = 0; i < result.size(); ++i) {
            System.out.printf("%d ", result.get(i));
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