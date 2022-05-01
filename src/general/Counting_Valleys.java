// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

// class Result {

//     public static int countingValleys(int steps, String path) {
//         int valley_count = 0;
//         int t = 0;
        
//         for(int i = 0; i < steps; i++) {
//             if(t==0 && path.charAt(i)=='U' || t>0 && path.charAt(i) == 'D' ){
//              if(path.charAt(i)=='U'){

//                  ++t;
                                  
//              }
//              if(path.charAt(i)=='D'){
//                  --t;
//              }
//                 // System.out.println(path.charAt(i)+"t"+ t);
//                 continue;
//             }
//             if(path.charAt(i)=='U'){

//                  ++t;
                                  
//              }
//              if(path.charAt(i)=='D'){
//                  --t;
//              }
//             // System.out.println(path.charAt(i)+"t"+ t);
//              if(t==0){
//                  ++valley_count;
//              }
//         }
//         return valley_count;

//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//         int steps = Integer.parseInt(bufferedReader.readLine().trim());

//         String path = bufferedReader.readLine();

//         int result = Result.countingValleys(steps, path);

//         bufferedWriter.write(String.valueOf(result));
//         bufferedWriter.newLine();

//         bufferedReader.close();
//         bufferedWriter.close();
//     }
// }
