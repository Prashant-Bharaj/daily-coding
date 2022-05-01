// package hackerrank.pattern.pattern5;

// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int number = scn.nextInt();
//         scn.close();
//         int star = 1, tab = number/2;

//         for(int i = 1; i <= number; i++){
//             System.out.println("\t".repeat(tab)+"*\t".repeat(star));
//             if(i< number/2 + 1){
//                 tab--;
//                 star += 2;
//             }else{
//                 tab++;
//                 star -= 2;
//             }
//         }

//     }
// }