package hackerrank.CheckVowel;

public class Main {
    public static void main(String[] args){
        String a = "abcd", b = "bcd";
        if(a.toLowerCase().matches(".*[aeiou]*.")){
            System.out.println("a contians vowels");
        }
        if(b.toLowerCase().matches(".*[aeiou].*")){
            System.out.println("b contians vowels");
        }
    }
}
