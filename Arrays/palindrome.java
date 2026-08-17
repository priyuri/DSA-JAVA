public class palindrome {

    public static boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        int left = 0;
        int right = y.length() - 1;
        while (left < right) {
            char leftChar = y.charAt(left);
            char rightChar = y.charAt(right);
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;

        }
        return true;

    }

    public static void main(String[] args) {
        int x = 10;
        
        System.out.println(isPalindrome(x));
    }

}
