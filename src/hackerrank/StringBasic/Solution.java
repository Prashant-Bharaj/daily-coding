package hackerrank.StringBasic;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        if(A.charAt(0) < B.charAt(0) ){
            System.out.println("No"); 
        }else{
            System.out.println("Yes");
        } 
        
        System.out.println(A.replace(A.substring(0, 1), A.substring(0, 1).toUpperCase()) + " " + B.replace(B.substring(0, 1), B.substring(0, 1).toUpperCase()));
        
    }
}



