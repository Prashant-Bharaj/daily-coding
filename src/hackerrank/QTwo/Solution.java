package hackerrank.QTwo;

class A {
    static int add(int i, int j) {
        return i + j;
    }
}


public class Solution extends A {
    public static void main(String argv[]) {
        short s = 9;
        System.out.println(add(s, 6));
    }
}