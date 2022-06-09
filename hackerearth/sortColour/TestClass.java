package hackerearth.sortColour;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }


        for(int i = 0; i < N; i++) {
            int minIndex = i;
            for(int j = i+1; j < N; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
