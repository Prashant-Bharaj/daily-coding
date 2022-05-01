package hackerrank.JavaDateTime;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

class Result {

    public static String findDay(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        sc.close();
        System.out.println(Result.findDay(year, month, day));
    }
}