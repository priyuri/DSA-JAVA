package Strings;

public class demo {
    public static  String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(" ");
        String[] arr = s.trim().split("\\s+");
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString().trim();

    }
    
    public static String largeOddNum(String s) {
        // your code goes here
        int largest = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) % 2 != 0){
                s.substring(0 , i);
                if(largest < s.charAt(i)){
                    largest = s.charAt(i);
                }
            }
        }
        return 
    }
    public static void main(String[] args) {
        // String s = "welcome to the jungle";
        // System.out.println(reverseWords(s));
        String s = "5347";
        largeOddNum(s);
    }
}
