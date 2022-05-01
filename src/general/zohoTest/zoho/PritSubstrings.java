package general.zohoTest.zoho;

public class PritSubstrings {
    public static void main(String[] args){
        String s = "abc";
        // pick the starting point
        for(int start = 0; start < s.length(); start++){
            // pick the endpoint
            for(int end = start; end <s.length(); end++){
                // Now print the substrings from start to end
                System.out.println(s.substring(start,end+1));
            }
        }
    }
}
