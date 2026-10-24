package Stack;
import java.util.*;

public class StackBottom {
    public static  Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        if(st.isEmpty()){
            st.push(x);
            System.out.print(st.peek()+" ");
            return st;
            
        }
        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
        System.out.print(st.peek()+" ");
        return st;

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(8);
        insertAtBottom(st , 2);
        // while(!st.isEmpty()){
        //     System.out.print(st.peek()+" ");
        //     st.pop();
        // }
        
    }
}
