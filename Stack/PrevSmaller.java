package Stack;

import java.util.*;


public class PrevSmaller {
    public static  ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        Stack<Integer>st = new Stack<>();
        ArrayList<Integer>prevsmall = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            prevsmall.add(-1);
        }

        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                prevsmall.set(i , -1);
            }else{
                prevsmall.set(i , arr[st.peek()]);
            }
            st.push(i);
        }
        return prevsmall;
        
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 1};
        System.out.println(prevSmaller(arr));
        
    }
}
