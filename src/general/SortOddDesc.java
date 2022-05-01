package general;

import java.util.Collections;
import java.util.PriorityQueue;

public class SortOddDesc {
    public static void main(String[] args) {
        int[] arr = {13, 2, 4, 15, 12, 10, 5};
        PriorityQueue<Integer> p1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> p2 = new PriorityQueue<>();

        for(int i = 0; i < arr.length; i++){
            if((i+1)%2==0){
                p2.add(arr[i]);
            }else {
                p1.add(arr[i]);
            }
        }
        for(int i = 0; i < arr.length; i++){
            if((i+1)%2==0){
                arr[i] = p2.poll();
            }else {
                arr[i] = p1.poll();
            }
        }
        for(int num: arr){
            System.out.print(num+" ");

        }
    }
}
