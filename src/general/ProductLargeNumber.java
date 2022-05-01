package general;

public class ProductLargeNumber {
    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0")) return "0";

        long carry = 0;
        String ans="";
        for(int i = num1.length()-1; i >=0; i--){
            long product = (num1.charAt(i)-'0') * Long.parseLong(num2) + carry;
            ans += product % 10;
            carry = product / 10;
        }
        while(carry != 0){
            ans += carry%10;
            carry /=10;
        }
        String ans1="";
        for(int i = ans.length()-1; i >= 0; i--) {
            ans1 += ans.charAt(i);
        }
        return ans1;
    }
    public static void main(String[] args) {
        ProductLargeNumber ob = new ProductLargeNumber();
        System.out.println(ob.multiply("123456789",
                "987654321"));
    }
}
