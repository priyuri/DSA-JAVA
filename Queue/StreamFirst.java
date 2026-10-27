package Queue;
import java.util.*;

public class StreamFirst {
    public static String firstNonRepeating(String s) {
        // code here
        Queue<Character>q = new LinkedList<>();
        int[] freq = new int[26];
        StringBuilder ans = new StringBuilder();


        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1 ){
                q.remove();
            }
            if(q.isEmpty()){
                ans.append("#");
            }else{
                ans.append(q.peek());
            }
        }
        return ans.toString();
        

    }
    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(firstNonRepeating(s));

        
    }
}
