package hackerearth.minLengthEqualToTargetSum;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass {
    static int solve(int N, int target, int[] arr){
        if(N == 0) return 0;
        int mn = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int j = i; j < N; j++) {
                sum += arr[j];
                if(sum >= target) {
                    mn = Math.min(mn, j-i+1);
                }
            }
        }
        return mn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int ans = solve(N, target, arr);
        System.out.println(ans);
    }
}
