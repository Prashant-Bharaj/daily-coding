package general;

public class pattern {
    public static void main(String[] args) {
        String s = "abcdefg";
        int l , r;
        l = r = s.length()/2;
        for(int i = 0; i < l ; i++){
            System.out.print(" ");
        }
        System.out.println(s.charAt(l));
        l--; r++;

        while(l>=0 && r< s.length()){
            for(int i = 0; i < l; i++){
                System.out.print(" ");
            }
            System.out.print(s.charAt(l));
            // mid space
            for(int i = l+1; i <= r-1; i++){
                System.out.print(" ");
            }
            System.out.println(s.charAt(r));
            l--; r++;
        }
        l+=2; r-=2;
        while(l<r){
            for(int i = 0; i < l; i++){
                System.out.print(" ");
            }
            System.out.print(s.charAt(l));
            // mid space
            for(int i = l+1; i <= r-1; i++){
                System.out.print(" ");
            }
            System.out.println(s.charAt(r));
            l++; r--;
        }
        for(int i = 0; i < l; i++) System.out.print(" ");
        System.out.println(s.charAt(l));

    }
}
