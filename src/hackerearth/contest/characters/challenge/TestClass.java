package hackerearth.contest.characters.challenge;

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();

            int out_ = Minimum_Operations(n, s);

            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
//    static int solution(String s, int left, int right, HashMap<Character, Integer> freq){
//        while(freq.get(s.charAt(left)) > 1 || freq.get(s.charAt(right)) > 1){
//            if(s.charAt(left) == s.charAt(right) && freq.get(s.charAt(left)) > 2){
//                freq.put(s.charAt(left), freq.get(s.charAt(left))-2);
//                left++; right--;
//            }
//            else if(s.charAt(s.charAt(left)) == s.charAt(right) && freq.get(s.charAt(left)) == 2){
//
//            }
//        }
//    }
    static int Minimum_Operations(int n, String s){
        // Write your code here
        int operations = 0, left = 0, right = n-1;
        HashMap<Character, Integer> freq = new HashMap<>();
        for(Character c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
                while(entry.getValue() >= 3){
                    freq.put(entry.getKey(), entry.getValue()-2);
                    operations++;
                }
                if(entry.getValue() == 2){
                    freq.put(entry.getKey(), entry.getValue()-1);
                    operations++;
                }


//            operations += (entry.getValue() / 6) * 2;
//
//            int temp = entry.getValue() % 6;
//            if( temp == 4 || temp == 5){
//                operations += 2;
//            } else if( temp == 2 || temp == 3){
//                operations += 1;
//            }

        }
        return operations;

    }
}