package hackerearth.shuffleParenthesis;

import java.util.Scanner;



class TestClass {
    
    static void generateParenthesis(int n, StringBuilder sb, int open, int close){
        if(open == n && close == n){
            System.out.println(sb);
            return;
        }
        if(open < n) {
            sb.append("(");
            generateParenthesis(n, sb, open+1, close);
            sb.setLength(sb.length() - 1);
        }
        if(close < n) {
            sb.append(")");
            generateParenthesis(n, sb,open, close+1);
            sb.setLength(sb.length() - 1);
        }
    }
    static void solve(int n) {
        /***
         * @param
         * @n size of string
         * @sb required string
         * @open count of open brackets
         * @close count of close brackets
         */
        generateParenthesis(n, new StringBuilder(), 0, 0);
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        solve(N);
    }
}
