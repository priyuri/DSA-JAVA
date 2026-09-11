package Strings;

public class palindrome {
    public static boolean palindromeCheck(String s) {
        // your code goes here
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "hannahm";
        System.out.println(palindromeCheck(s));

    }
}
