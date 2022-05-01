package leetcode.contest;

class Solution {
    public int countPrefixes(String[] words, String s) {
        int ans = words.length;
        for(int i  = 0; i < words.length; i++ ){
            for(int j = 0;  j < words[i].length(); j++){
                if(words[i].charAt(j) != s.charAt(j)){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
public class CountValidPrefixes {
}
