package general.zohofamily;

import java.util.ArrayList;

import java.util.LinkedList;

import java.util.Arrays;

import java.util.IntSummaryStatistics;

import java.util.List;

import java.util.Random;

import java.util.stream.Collectors;

public class MyClass {


    public static void main(String args[]) {



        Random random = new Random();

        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();



        System.out.println("Highest number in List : " + stats.getMax());

        System.out.println("Lowest number in List : " + stats.getMin());

        System.out.println("Sum of all numbers : " + stats.getSum());

        System.out.println("Average of all numbers : " + stats.getAverage());

        System.out.println("Random Numbers: ");



        random.ints().limit(10).sorted().forEach(System.out::println);

    }

}