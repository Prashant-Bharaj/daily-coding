package crio;

import java.time.LocalDate;


public class Main {

    public static void main(String args[]){

//        String userDate = "2100-01-01";
//
//        LocalDate userInputDate = LocalDate.parse(userDate);
//
//        System.out.println(userInputDate.isLeapYear());
        String userDate = "2100-02-24";

        LocalDate userInputDate = LocalDate.parse(userDate);

        System.out.println(userInputDate.plusDays(5));


    }

}