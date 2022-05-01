package general;

public class RepeatedSubStringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() <= 1) return true;
        int slow = 0, fast = 1;
        while (fast - slow <= s.length() / 2) {
            while (fast < s.length() && s.charAt(slow) != s.charAt(fast)) {
                fast++;
            }
            if (fast - slow > s.length() / 2) return false;
            while (fast < s.length() && s.charAt(fast) == s.charAt(slow)) {
                fast++;
                slow++;
            }
            if (fast == s.length()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubStringPattern object = new RepeatedSubStringPattern();
        System.out.println(object.repeatedSubstringPattern("ababab"));
        System.out.println(object.repeatedSubstringPattern("abcd"));
        System.out.println(object.repeatedSubstringPattern("ababac"));
    }
}
