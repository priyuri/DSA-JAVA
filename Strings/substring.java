package Strings;

public class substring {
    public static String getSubString(String str , int si , int ei){
        StringBuilder sb = new StringBuilder("");
        for(int i=si; i<ei; i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Hello World";
        int si = 0;
        int ei = 4;
        System.out.println(getSubString(str , si , ei));
        
    }
}
