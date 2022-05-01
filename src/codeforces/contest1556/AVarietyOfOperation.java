package codeforces.contest1556;
import java.util.*;
public class AVarietyOfOperation {

    public static void numberFinding(int a, int b, int c, int d){
        int k = a +Math.max(c, d);
        numberFinding(a+k, b+k, c, d);
        numberFinding(a-k, b+k, c, d);
        numberFinding(a+k, b-k, c, d);
    }
    public static void main(String[] args){
        int a = 0; int b = 0;
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int d = scanner.nextInt();

    }
}
