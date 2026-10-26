package Stack;

import java.util.ArrayList;
import java.util.*;

public class NextGreater {
    public static  ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> nextGreat = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            nextGreat.add(-1);
        }
        for(int i=arr.length-1; i>=0; i--){
            //while loop 
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                st.pop();
            }
            //check st is empty
            if(st.isEmpty()){
                nextGreat.set(i, -1);
            }else{
                nextGreat.set(i , arr[st.peek()]);
            }
            //push in st
            st.push(i);
        }
        return nextGreat;

        
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println(nextLargerElement(arr));
    }
}
