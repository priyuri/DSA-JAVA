package Queue;
import java.util.*;

public class QUsingStack {

    static class myQueue {
        Stack<Integer>s1 = new Stack<>();
        Stack<Integer>s2 = new Stack<>();
        int size = 0;

        // Initialize your data members

        void enqueue(int x) {
            // Implement enqueue operation

            //step 1
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            //step 2
            s1.push(x);
            size++;

            //step 3
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        void dequeue() {
            // Implement dequeue operation
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return ;
            }
            s1.pop();
            size--;
        }

        int front() {
            // Implement front operation
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }

        int size() {
            // Implement size operation
            return size;
        }
    }

    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        System.out.println(q.size());
        System.out.println(q.front());


    }
}
