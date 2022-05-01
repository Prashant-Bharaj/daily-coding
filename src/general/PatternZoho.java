package general;

public class PatternZoho {
    public static void main(String[] args) {
        String s = "12345";
        int l = 0, r= s.length()-1;
        while(l<r){
            for(int leftSpace = 0; leftSpace < l; leftSpace++){
                System.out.print(" ");
            }
            System.out.print(s.charAt(l));
            for(int midSpace = l+1; midSpace <= r-1; midSpace++){
                System.out.print(" ");
            }
            System.out.println(s.charAt(r));
            l++; r--;
        }
        for(int i = 0; i < l; i++){
            System.out.print(" ");
        }
        System.out.println(s.charAt(l));
        l--; r++;
        while(l>=0){
            for(int i = 0; i < l; i++){
                System.out.print(" ");
            }
            System.out.print(s.charAt(l));
            for(int i = l+1; i <= r-1; i++){
                System.out.print(" ");
            }
            System.out.println(s.charAt(r));
            l--; r++;
        }
    }
}
