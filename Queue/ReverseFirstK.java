package Queue;
import java.util.*;

public class ReverseFirstK {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer>s = new Stack<>();
        int size = q.size();
        if(size < k){
            return q;
        }
        for(int i=0; i<k; i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=0; i<size-k; i++){
            q.add(q.remove());
        }
        return q;

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseFirstK(q,3 );
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
        
    }
}
