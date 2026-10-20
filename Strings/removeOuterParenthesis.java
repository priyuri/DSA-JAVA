package Strings;

public class removeOuterParenthesis {
    public static  String removeParenthesis(String s) {
        // Your code goes here
        int count = 0;
        StringBuilder sb = new StringBuilder(" ");
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
                if(count>1){
                    sb.append(ch);
                }
            }else{
                count--;
                if(count>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s ="()(()())(())";
        System.out.println(removeParenthesis(s));     
    }
}
