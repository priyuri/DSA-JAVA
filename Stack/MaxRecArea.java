package Stack;
import java.util.*;

public class MaxRecArea {
    public static  int largestRectangleArea(int[] heights) {
        //two arrays of left smaller and right smaller
        int[] lsa = new int[heights.length];
        int[] rsa = new int[heights.length];
        int maxArea = 0;

        Stack<Integer>st = new Stack<>();
        //left smaller
        for(int i = 0; i<heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                lsa[i] = -1;
            }else{
                lsa[i] = st.peek();
            }
            st.push(i);
        }

        //right smaller 
        st = new Stack<>();
        for(int i=heights.length-1; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                rsa[i] = heights.length;
            }else{
                rsa[i] = st.peek();
            }
            st.push(i);
        }

        //area
        for(int i=0; i<heights.length; i++){
            //height
            int height = heights[i];  

            //width
            int width = rsa[i] - lsa[i] - 1;

            //area
            int area = height * width;

            //maximum area
            maxArea = Math.max(maxArea , area);
        }
        return maxArea;

    }
    public static void main(String[] args) {
        int[] heights = {2,4};
        System.out.println(largestRectangleArea(heights));
    }
}
