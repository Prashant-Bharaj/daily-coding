package hackerearth.contest.cannibal.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class TestClass {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static String solve(int N, int K, String S){
        // make prefix
        if(N == 0) return "";
        if(K == 0) return S;
        if(K == 1) return S + S.charAt(0);

        Character first = S.charAt(0);
        String prefix = "";
        StringBuilder curr = new StringBuilder();
        curr.append(first);


        for (int i = 1; i < N; i++) {
//            if(prefix.length() > 1 && S.charAt(i) == first && i+1 < N && prefix.charAt(1) )
            if (S.charAt(i) > first) break;

            if(S.charAt(i) == first && i+1 == N) break;
            if (S.charAt(i) <= first) {
                curr.append(S.charAt(i));
            }
        }

        prefix += curr;
//
//        for (int i = prefix.length(); i < N; i++) {
//            Character currentChar = S.charAt(i);
//            if (S.charAt(i) <= first) {
//                StringBuilder temp = new StringBuilder();
//                temp.append(S.charAt(i));
//                i++;
//                while (i < N && S.charAt(i) < first) {
//                    temp.append(S.charAt(i));
//                    i++;
//                }
//
//
////                while (i < N && S.charAt(i) <= prefix.charAt(i % prefix.length())) {
////                    temp.append(S.charAt(i));
////                    i++;
////                }
//
//                if (temp.length() > 1 ) {
//                    curr = new StringBuilder(temp.toString());
//                    prefix += curr;
//                }
////                else if(i == N && !temp.equals(first)){
////                    prefix += temp;
////                }
//            } else {
//
//                break;
//            }
//        }


        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N + K; i++) {
            ans.append(prefix.charAt(i % prefix.length()));
        }
        return ans.toString();
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            System.out.println(solve(N, K, S));
            T--;
        }
    }
}

/*
test case
string length
k
3
5
2
abdcd
6
5
spasap
7
3
feceaaa


* */