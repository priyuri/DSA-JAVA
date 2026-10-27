package Queue;
import java.util.*;

public class InterleaveQ {
    public static  void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer>q2 = new LinkedList<>();
        int size = q.size();
        for(int i=0; i<size/2; i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(3);
        q.add(1);

        rearrangeQueue(q);
        // while (!q.isEmpty()) {
        //     System.out.print(q.remove()+" ");
        // }
        // System.out.println();

        
    }
}
