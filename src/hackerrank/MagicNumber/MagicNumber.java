package hackerrank.MagicNumber;
import java.util.*;
public class MagicNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        scanner.close();
        int sum = 0;
        for(int i = 0; i < number.length(); i++){
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        int a = 0;
        while(sum > 0){
            a += sum%10;
            sum = sum/10;
        }
        System.out.println(a);
    }
}
