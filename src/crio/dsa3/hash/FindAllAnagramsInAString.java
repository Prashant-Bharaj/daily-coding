package crio.dsa3.hash;

import java.util.*;

// Implement your solution here
class FindAllAnagramsInAString {
    public boolean checkAnagrams(TreeMap<Character, Integer> shm, TreeMap<Character, Integer> phm){
        if(shm.size() != phm.size()) return false;
        Iterator<Map.Entry<Character, Integer>> shmi = shm.entrySet().iterator();
        Iterator<Map.Entry<Character, Integer>> phmi = phm.entrySet().iterator();
        while(shmi.hasNext() && phmi.hasNext()){
            Map.Entry<Character, Integer> sentry = shmi.next();
            Map.Entry<Character, Integer> pentry = phmi.next();
            if(sentry.getKey() != pentry.getKey() || sentry.getValue() != pentry.getValue()){
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        TreeMap<Character, Integer> phm = new TreeMap<>();
        int pl = p.length();
        int slow = 0, fast = 0;
        for(Character c : p.toCharArray()){
            if(c >= 'a' && c <= 'z') {
                phm.put(c, phm.getOrDefault(c, 0) + 1);
                fast++;
            }
        }

        if(pl > s.length()) return new ArrayList<>();
        TreeMap<Character, Integer> hm = new TreeMap<>();

        for(int i = 0; i < pl; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        if(checkAnagrams(hm, phm)){
            ans.add(slow);
        }
        fast++;
        while(fast < s.length()){
            hm.put(s.charAt(slow), hm.get(s.charAt(slow)) -1);
            if(hm.get(s.charAt(slow)) == 0){
                hm.remove(s.charAt(slow));
            }
            slow++;

            hm.put(s.charAt(fast), hm.getOrDefault(s.charAt(fast), 0) + 1);
            fast++;
            if(checkAnagrams(hm,phm)){
                ans.add(slow);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] input = new String[2];
//        input = scanner.nextLine().split(" ");
//        String s = input[0];
//        String p = input[1];
        String s =scanner.nextLine();
        String p = scanner.nextLine();
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