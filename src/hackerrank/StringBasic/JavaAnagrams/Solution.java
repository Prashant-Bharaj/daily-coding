package hackerrank.StringBasic.JavaAnagrams;

import java.util.*;
import java.util.Scanner;

public class Solution {
    static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
    
        for(int i = 0; i < a.length(); i++){
            if(map.containsKey(a.charAt(i))){
                Integer pre = map.get(a.charAt(i));
                map.put(a.charAt(i), ++pre);
            }else{
                map.put(a.charAt(i), 1);
            }
        }

        for(int i = 0; i < b.length(); i++){
            if(!map.containsKey(b.charAt(i))){
                return false;
            }
            Integer fre = map.get(b.charAt(i));
            if(fre == 0){
                return false;
            }else{
                map.put(b.charAt(i),--fre);
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
