//https://leetcode.com/problems/valid-palindrome/description/
class Solution {
    public static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(j);
            if(!Character.isLetterOrDigit(leftChar)){
                i = i+1;
                continue;
            }
            if(!Character.isLetterOrDigit(rightChar)){
                j = j-1;
                continue;
            }
            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            }
            i=i+1;
            j=j-1;
        }
        return true;
        
    }
    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
