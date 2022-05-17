package java.topics.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayWithStream {
    public static void main(String[] args) {
        List<String> l = new ArrayList(Arrays.asList("one", "two"));

//        Stream<String> sl = l.stream();

//        l.add("three");

//        String s = sl.collect(Collectors.joining(" "));
        String s = l.stream().collect(Collectors.joining(" "));

        System.out.println(s);
    }
}
