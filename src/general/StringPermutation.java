package general;

import java.util.*;

class StringPermutation {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int permutation[] = new int[n];

        for (int i = 0; i < n; i++)
            permutation[i] = sc.nextInt();

        String result = stringPermutation(n, str, permutation);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String stringPermutation(int n, String str, int[] permutation) {
        // abcd [2,4,3,1]

//        StringBuilder sb = new StringBuilder(4);
//        sb.append(str);
//        for(int i = 0; i < n; i++) {
////            sb.replace(permutation[i]-1,permutation[i], String.valueOf(str.charAt(i)));
//            sb.setCharAt(permutation[i]-1, str.charAt(i));
//        }
//        return sb.toString();
//
        char[] ans = new char[n];
        for(int i = 0; i < n; i++){
            ans[permutation[i]-1] = str.charAt(i);
        }
        return new String(ans);
    }
}
