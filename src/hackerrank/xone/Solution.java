package hackerrank.xone;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Scanner sc = new Scanner(System.in);
//    int B = sc.nextInt();
//    int H = sc.nextInt();
//    boolean flag = true;
    public static final int B = sc.nextInt();
    public  static final int H = sc.nextInt();
    public static  boolean flag = true;

    static {
    if (B <= 0 || H <= 0) {
        flag = false;
        try {
            throw new Exception("java.lang.Exception: Breadth and height must be positive");
        } catch (Exception e) {
//            e.printStackTrace();
        }

    }
}



    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

