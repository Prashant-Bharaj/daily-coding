package hackerrank.pattern.naturalNumber;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        String str = "*\t";
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println(Math.pow(12, 14));
        }

    }
}