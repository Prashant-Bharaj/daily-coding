package codeforces.contest1334;
import java.util.Scanner;
import java.util.Arrays;
public class MiddleClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            long []narray = new long[n];
            // Set<Long> xarray = new HashSet<Long>();
            // HashMap<Long,Long> xmap = new HashMap<Long,Long>();
            for(int i = 0; i < n; i++){
                narray[i] = sc.nextLong();
                // xarray.add(sc.nextLong());
            }
            Arrays.sort(narray);
            int count = 0;
            double sum = 0;
            double people = 1.0;
            for(int i = n-1; i >= 0; i--){
                sum += narray[i];
                if(sum/people  >= x && count < n){
                    people++;
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(count);
        }

    }
}
