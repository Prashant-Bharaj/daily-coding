package general;

public class StringDecoding {
    static boolean isDigit(char c){
        if(c >= '0' && c <= '9') return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "a1b10";
        for(int i = 0; i < s.length(); i++){
            int temp = i;
            char rc = s.charAt(i);
            String repeatation = "";
            repeatation+= s.charAt(i+1);
            temp++;
            if(i+2 < s.length() && isDigit(s.charAt(i+2))){
                repeatation+=s.charAt(i+2);
                temp++;
            }
            for(int rtimes = 1; rtimes <= Integer.parseInt(repeatation); rtimes++ ){
                System.out.print(s.charAt(i));
            }
            i=temp;
        }
    }
}
