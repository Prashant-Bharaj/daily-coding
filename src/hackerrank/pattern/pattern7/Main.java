package hackerrank.pattern.pattern7;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        // for(int i = 0; i < number; i++){
            // System.out.println("\t".repeat(i)+"*");
        // }
        for(int i = 0; i < number; i++){
            for(int j = 0; j < i; j++){
                System.out.print("\t");
            }
            System.out.println("*");
        }
    }
    
}
