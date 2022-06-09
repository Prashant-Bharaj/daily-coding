import java.io.*;
import java.util.*;

/***
 *  1. 7 char
 * 2. Up
 * 3. lo
 * 4. d
 * 5. # @ * &
 */
public class New_Password {
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();
    static boolean solve(int N, int X, int Y, double sum, List<Integer> curList, Map<String, Boolean> lookup) {
        // this might fail
        if(sum % Y == 0) {
            ans.add(curList);
            return true;
        }
        
        String key = N +"|"+sum;

        if(!lookup.containsKey(key)){
            boolean include = solve(N-1, X, Y, sum-(N-1), curList.add(N-1), lookup);
            boolean exclude = solve(N-1, X, Y, sum, curList);
            lookup.put(key, include || exclude);
        }
        return lookup.get(key);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = nextInt();
            
            // Alan
            int X = nextInt();
            // BarBara
            int Y = nextInt();

            double sum = N*(N+1)/2;
            Map<String, Boolean> lookup = new HashMap<>();
            boolean found = solve(N, X, Y, sum, new ArrayList<Integer>(), lookup);
            if(!found)
            System.out.printf("Case #%d: %s\n", t, "IMPOSSIBLE");
            else {
                System.out.printf("Case #%d: %s\n", t, "POSSIBLE");
                for(List<Integer> ls : ans){
                    w
                }
            }
        }
        in.close();
    }
}