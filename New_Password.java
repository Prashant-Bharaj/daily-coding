
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
    static String solve(int len, String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        boolean[] requirement = new boolean[5];
        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                requirement[1] = true;
            } else if(c >= 'a' && c <='z'){
                requirement[2] = true;
            } else if(c >= '0' && c <= '9'){
                requirement[3] = true;
            } else if(c == '#' || c == '@' || c=='*' || c == '&'){
                requirement[4] = true;
            }
        }
        if(!requirement[1]) {
            sb.append('A');
        }
        if(!requirement[2]) sb.append('a');
        if(!requirement[3]) sb.append('0');
        if(!requirement[4]) sb.append('#');
        while(sb.length() < 7){
            sb.append("a");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int len = in.nextInt();
            String s = in.next();
            String validPassword = solve(len, s);

            System.out.printf("Case #%d: %s\n", t, validPassword);
        }
        in.close();
    }
}