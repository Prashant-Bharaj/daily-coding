package crio.dsa3.hash;
import java.util.*;

class FrequentWords{
    public static void frequentWords(Vector<String> vec,int k) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String s : vec){
            hm.put(s, hm.getOrDefault(s, 0)+1);
        }

        List<Map.Entry<String, Integer>> l = new LinkedList<>(hm.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                if(o1.getValue() > o2.getValue()){
                    return -1;
                } else if(o1.getValue() < o2.getValue()){
                    return 1;
                } else {
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });
//        if(k > l.size())
        for(int i = 0; i < k; i++){
            System.out.println(l.get(i).getKey());
        }
//        return vec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Vector<String> vec=new Vector<String>();
        for(int i=0;i<n;i++)
            vec.add(sc.next());
        int k=sc.nextInt();
        frequentWords(vec, k);

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
