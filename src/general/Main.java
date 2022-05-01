package general;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code h
        ArrayList<Integer> a = new ArrayList<>();
        Collections.addAll(a,1,2,3);
        a.set(0,1);
//        a.set(4,2);
        String ans="abc";

        System.out.println(a);
    }
}
