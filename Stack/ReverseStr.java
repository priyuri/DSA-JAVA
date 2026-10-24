package Stack;

import java.util.*;

public class ReverseStr {
    public static String reverse(String S) {
        // code here
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while (idx < S.length()) {
            st.push(S.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("");
        while (!st.isEmpty()) {
            char ch = st.pop();
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String S = "abc";
        System.out.println(reverse(S));
    }
}
