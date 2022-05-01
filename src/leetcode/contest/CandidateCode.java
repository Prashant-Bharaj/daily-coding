package leetcode.contest;

/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Character> mom = new ArrayList<>();

        List<Character> dad = new ArrayList<>();



        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='M' || s.charAt(i) == 'O'){
                mom.add(s.charAt(i));

            }else if(s.charAt(i)=='D' || s.charAt(i) == 'A') {
                dad.add(s.charAt(i));

            }
        }

        int[] momF = new int[mom.size()];
        int[] dadF = new int[dad.size()];
        int mCount = 0, dCount = 0;
        for(int i = mom.size()-1, j = 0; i >= 0; i--, j++){
            if(mom.get(j) == 'M'){
                mCount += 1;

            }
            momF[i] = mCount;
        }
        for(int i = dad.size()-1, j = 0; i >= 0; i--, j++){
            if(dad.get(j) == 'D'){
                dCount += 1;

            }
            dadF[i] = dCount;
        }
        int ans = 0;
        for(int i = 0; i < mom.size(); i++){
            if(mom.get(i) == 'M'){

                int temp = i;
                temp++;
                while(temp < mom.size()){
                    while(temp < mom.size() && mom.get(temp) != 'O'){
                        temp++;
                    }
                    if(temp < mom.size()){
                        ans += momF[temp];
                    }
                    temp++;
                }

            }
        }
        for(int i = 0; i < mom.size(); i++){
            if(dad.get(i) == 'D'){
                int temp = i;
                temp++;
                while(temp < dad.size()){
                    while(temp < dad.size() && dad.get(temp) != 'A'){
                        temp++;
                    }
                    if(temp < dad.size()){
                        ans += dadF[temp];
                    }
                    temp++;
                }
            }
        }
        System.out.println(ans);
    }
}
