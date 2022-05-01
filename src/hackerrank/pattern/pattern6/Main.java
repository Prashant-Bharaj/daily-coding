// package hackerrank.pattern.pattern6;

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int number = scanner.nextInt();
//         scanner.close();
//         int star = number / 2 + 1;
//         int tab = 0;
//         for (int i = 1; i <= number; i++) {
//             System.out.println("*\t".repeat(star) + "\t" + "\t".repeat(2) + "\t".repeat(tab) + "*\t".repeat(star));
//             if (i < number / 2 + 1) {
//                 star--;
//                 tab++;
//             } else {
//                 star++;
//                 tab--;
//             }
//         }
//     }

// }
