package Strings;

public class largestOddNum {
    public static  String largeOddNum(String s) {
        // your code goes here
        for(int i=s.length()-1; i>=0; i--){
            int digit = s.charAt(i) - '0';
            if(digit % 2 !=0){
                String ans =  s.substring(0 , i+1);
                ans = ans.replaceFirst("^0+", "");
                return ans;
            }
        }
        return "";
        
    }
    public static void main(String[] args) {
        String s = "02483";
        System.out.println(largeOddNum(s));
        
    }
    
}
