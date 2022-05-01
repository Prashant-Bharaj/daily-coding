package codeforces.contest1;

// import java.io.BufferedReader;
// import java.io.PrintWriter;
// import java.io.InputStreamReader;
// import java.io.IOException;
import java.util.Scanner;
public class TheatreSquare {
    // static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    // static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {

        // String[] p = in.readLine().split("\\s");
        // long n = Long.parseLong(p[0]);
        // long m = Long.parseLong(p[1]);
        // double a = Double.parseDouble(p[2]);
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        double a = scanner.nextDouble();
        long flagstones = (long) (Math.ceil(n / a) * Math.ceil(m / a));
        // out.print(flagstones);
        // out.close();
        System.out.print(flagstones);
        scanner.close();
    }
}
