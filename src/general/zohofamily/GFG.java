package general.zohofamily;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long[] arr = new long[n];
            for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
            long[] res = new Solution().nextLargerElement(arr, n);
            for (int i = 0; i < n; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}



// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    {
        long[] temp = new long[n];
        Arrays.fill(temp, 0);
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                arr[i] = arr[i+1];
            } else {
                temp[i] = -1;
            }
        }
        arr[n-1] = -1;
        for(int i = 0; i < n; i++){
            if(temp[i] == -1){
                arr[i] = -1;
            }
        }
        return arr;
    }
}