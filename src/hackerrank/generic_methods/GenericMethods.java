package hackerrank.generic_methods;

import java.util.*;

public class GenericMethods {

    static Character[] charArray = {'a', 'b', 'c'};
    static Integer[] intArray = {1,2,3,4};
    static Boolean[] booleanArray = {true, false, true, true};

    // create a generic method to convert array into list

    // take two parameters array and the list
    public static <T> List<T> arrayToList(T[] array, List<T> list){
        list.addAll(Arrays.asList(array));
        return list;
    }

    public static void main(String[] args){
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        System.out.println(charList.get(0));
    }
}
