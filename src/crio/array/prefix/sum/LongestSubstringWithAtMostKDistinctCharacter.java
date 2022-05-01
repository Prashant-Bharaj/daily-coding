package crio.array.prefix.sum;

import java.nio.charset.StandardCharsets;
import java.util.*;

// Implement your solution here
class LongestSubstringWithAtMostKDistinctCharacter {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(k == 0) return 0;
        int first = 0, second = 0,maxLen = 0 ,len = 0;
        HashMap<Character, Integer> charFreq = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            // put element into the hm only if the resultant size is <= k
            // if element is already present -- freq and then check if freq  == 0 then
            // remove that element from the hashmap
            // if element is not already present check if i insert that element then my hm size will be <= K or not
            // if not then remove the element from second;
            if(!charFreq.containsKey(s.charAt(i))){
                while(second < s.length() && charFreq.size() == k){
                    // then I have to remove the element at second
                    len--;
                    charFreq.put(s.charAt(second), charFreq.get(s.charAt(second)) -1);
                    if(charFreq.get(s.charAt(second)) == 0){
                        charFreq.remove(s.charAt(second));
                    }
                    second++;
                }
                charFreq.put(s.charAt(i), 1);
            } else {
                charFreq.put(s.charAt(i), charFreq.get(s.charAt(i)) + 1);
            }
            len++;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();

        int result = new LongestSubstringWithAtMostKDistinctCharacter().lengthOfLongestSubstringKDistinct(s,k);
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