package cronis.lections.recursion;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "ababab";
        boolean b = new IsPalindrome().isPalindrome(str, 0, str.length());
        System.out.println(b);
    }

    private boolean isPalindrome(String s, int start, int end) {
        if (start + 1 == end - 1) return s.charAt(start) == s.charAt(end -1);
        return isPalindrome(s, start + 1, end - 1);
    }
}
