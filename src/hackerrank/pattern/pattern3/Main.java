package hackerrank.pattern.pattern3;

 import java.util.*;

 public class Main {
     public static String repeat(String s, int count){
         StringBuilder sb = new StringBuilder();
         for(int i = 0; i < count; i++){
             sb.append(s);
         }
         return sb.toString();
     }

     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int number = scn.nextInt();
         scn.close();
        
         for(int i = 1; i <= number; i++) {
             System.out.println(repeat("\t",number-i)+repeat("*\t", i));
         }
     }
 }