 package hackerrank.pattern.pattern2;

 import java.util.Scanner;
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
         String str = "*\t";
         for(int i = number; i >= 1; i--) {
             System.out.println(repeat(str, i));
         }
     }
 }