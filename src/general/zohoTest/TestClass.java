package general.zohoTest;

import java.util.HashSet;
import java.util.Scanner;

class TestClass {
    static Integer getNumber(HashSet<Integer> hs) {
        for (Integer num : hs) {
            hs.remove(num);
            return num;
        }
        return -1;
    }

    static Integer solve1(int N, int[] A, int K) {
        if((N & 1) != 0) return -1;
        int evenCount = 0, oddCount = 0, operations = 0;
        HashSet<Integer> odd = new HashSet<>();
        HashSet<Integer> even = new HashSet<>();
        int oddSize=0,evenSize=0;
        for(int arrN : A){
            if((arrN & 1) == 1) odd.add(arrN);
            else even.add(arrN);
        }
        for(int i = 1; i <= K; i+=2){
            if(!odd.contains(i)){
                oddSize++;
            }
        }
        for(int i = 2; i <= K; i+=2){
            if(!even.contains(i)){
                evenSize++;
            }
        }
        if(even.size() < N/2){
            if(evenSize + even.size()  < N/2) return -1;
            operations+= N/2-even.size();
        }
        if(odd.size() < N/2){
            if(oddSize + odd.size() < N/2) return -1;
            operations += N/2-odd.size();
        }

        /*
        // no need of even and odd Hs
        HashSet<Integer> evenHS = new HashSet<>();
        HashSet<Integer> oddHS = new HashSet<>();*/
        // if array element repeated
        // first make odd even hs sets

//        for(int arrN : A){
//            if((arrN & 1) == 1) odd.add(arrN);
//            else even.add(arrN);
//        }
//        for(int i = 1; i <= K; i+=2){
//            if(!odd.contains(i)){
//                oddHS.add(i);
//            }
//        }
//        for(int i = 2; i <= K; i+=2){
//            if(!even.contains(i)){
//                evenHS.add(i);
//            }
//        }
//        if(even.size() < N/2){
//            if(evenHS.size() + even.size()  < N/2) return -1;
//            operations+= N/2-even.size();
//        }
//        if(odd.size() < N/2){
//            if(oddHS.size() + odd.size() < N/2) return -1;
//            operations += N/2-odd.size();
//        }


//        for(int i = even.size(); i  < N/2; i++){
//            if(getNumber(evenHS)==-1){
//                return -1;
//            }
//        }
//        for(int i = odd.size(); i < N/2; i++){
//            operations++;
//            if(getNumber(oddHS)==-1){
//                return -1;
//            }
//        }


//        for (int i = 1; i <= K; i += 2) {
//            if (!hs.contains(i)) {
//                odd.add(i);
//            }
//        }
//        for (int i = 2; i <= K; i += 2) {
//            if (!hs.contains(i)) {
//                even.add(i);
//            }
//        }
//        for (Integer num : A) {
//            if ((num & 1) == 1) {
//                oddCount++;
//            } else {
//                evenCount++;
//            }
//            if (oddCount >= N / 2 && evenCount < N/2) {
//                // must add even only
//                if((num & 1) == 1){
//                    // that is number is not even
//
//                    // try to get the number
//                    // no need to replace the number
//                    evenCount++;
//                    operations++;
//                    if (getNumber(even) == -1) {
//                        return -1;
//                    }
//                }
//
//            }
//            if (evenCount >= N / 2 && oddCount < N/2) {
//                // must add odd only
//                if((num & 1) != 1){
//                    // that is number is not odd
//
//                    // try to get the number
//                    // no need to replace the number
//                    oddCount++;
//                    operations++;
//                    if (getNumber(odd) == -1) {
//                        return -1;
//                    }
//                }
//            }
//            //
//
//
//        }
//        for (int i = hs.size(); i <= N; i++) {
//            if (oddCount > evenCount) {
//                // try to get odd number <= K
//                operations++;
//                // only need to call it will remove that number from remaining hs
//                if (getNumber(odd) == -1) {
//                    return -1;
//                }
//            } else {
//                // try to get even number <= K
//                operations++;
//                if (getNumber(even) == -1) {
//                    return -1;
//                }
//            }
//        }
        return operations;
    }

    static Integer solve(int N, int[] A, int K) {
        if (N % 2 != 0) return -1;
        // make odd hashset up-to k
        HashSet<Integer> odd = new HashSet<>();
        for (int i = 1; i <= K; i += 2) {
            odd.add(i);
        }
        // make even hashset up-to k
        HashSet<Integer> even = new HashSet<>();
        for (int i = 2; i <= K; i += 2) {
            even.add(i);
        }
        int operations = 0, evenCount = 0, oddCount = 0;
        HashSet<Integer> ans = new HashSet<>();
        for (Integer num : A) {
            if (ans.contains(num)) {
                operations++;
                if (oddCount > evenCount) {
                    int oddNumber = getNumber(odd);
                    if (oddNumber == -1) {
                        return -1;
                    } else {
                        oddCount++;
                        ans.add(oddNumber);
                    }
                } else {
                    int evenNumber = getNumber(even);
                    if (evenNumber == -1) {
                        return -1;
                    } else {
                        evenCount++;
                        ans.add(evenNumber);
                    }
                }
            } else {
                if (num % 2 == 0) {
                    evenCount++;
                    ans.add(num);
                    even.remove(num);
                } else {
                    oddCount++;
                    ans.add(num);
                    odd.remove(num);
                }

            }
        }
        return operations;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int N, K;
            N = sc.nextInt();
            int[] A = new int[N];
//            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
//                hs.add(sc.nextInt());
            }
            K = sc.nextInt();
            System.out.println(solve1(N, A, K));
            t--;
        }
    }
}
