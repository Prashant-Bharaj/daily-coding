package hackerearth.arrayRotation;

import java.util.Scanner;

public class TestClass {
    static void permutate(int[] arr, int N){
        int left = 0, right = N, index = 0;
        int[] ans = new int[N+N];
        for(; left < N; left++, right++){
            ans[index++] = arr[left];
            ans[index++] = arr[right];
        }
        for(int i = 0; i < N+N; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+N];
        for(int i = 0; i < N+N; i++) {
            arr[i] = sc.nextInt();
        }
        permutate(arr, N);
    }
}
