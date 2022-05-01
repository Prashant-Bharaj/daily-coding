package hackerrank.recursion;

public class TowerOfHanoi {

    static void toh(char x, char y, char z, int n){
        if(n == 1) {
            System.out.println(x +"->"+y+" n="+n);
            return;
        }
        toh(x,z,y,n-1);
        System.out.println(x+"->"+y+" n="+n);
        toh(z,y,x,n-1);
    }

    public static void main(String[] args) {
        char x = 'A', y = 'B', z = 'C';
        toh(x, y, z, 3);
    }
}
