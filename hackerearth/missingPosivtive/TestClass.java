package hackerearth.missingPosivtive;

import java.util.Scanner;

public class TestClass {
    static int findFirstMissingPositiveNumber(int[] arr, int N) {
        // check if 1 is present or not because it will cause error in (n-1)%n 
        int checkOne = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] == 1){
                checkOne = 1;
            }
        }
        // if one is not present
        if(checkOne == 0) return 1;

        for(int i = 0; i < N; i++) {
            if(arr[i] <= 0 || arr[i] > N){
                arr[i] = 1;
            }
        }

        
        for(int i = 0; i < N; i++){
            arr[(arr[i]-1) % N] += N;
        }

        // now check the case where number is less than n
        for(int i = 0; i < N; i++) {
            if(arr[i] <= N) {
                return i+1;
            }
        }
        // if array has all values from 1 to n
        return N+1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = findFirstMissingPositiveNumber(arr, N);
        System.out.println(ans);
    }
}
