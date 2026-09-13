package Strings;

public class alphabet {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char i='A'; i<='Z'; i++){
            sb.append(i);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
