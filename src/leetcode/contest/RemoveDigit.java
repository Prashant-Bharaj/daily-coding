package leetcode.contest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveDigit {
    public String toString(List<Character> ls){
        StringBuilder sb = new StringBuilder();
        for(Character c : ls){
            sb.append(c);
        }
        return sb.toString();
    }
    public String removeDigit(String number, char digit) {
        List<Character> ls = new LinkedList<>();
        for(Character c : number.toCharArray()){
            ls.add(c);
        }
        String initial="" ;
        int i = 0;
        for(; i < number.length(); i++){
            if(number.charAt(i) == digit){
                ls.remove(i);

                initial = toString(ls);
                ls.add(i, digit);
                break;
            }
        }
        i++;
        for( ; i < number.length(); i++){
            if(number.charAt(i) == digit){
                ls.remove(i);
                initial = initial.compareTo(toString(ls)) > 0 ? initial : toString(ls);
                ls.add(i, digit);
                break;
            }
        }
        return initial;
    }

    public static void main(String[] args) {
        String number = "786";
    }
}
