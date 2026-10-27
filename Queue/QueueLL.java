package Queue;

public class QueueLL {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
    // public static Node head;
    // public static Node tail;
    // static int size;

    static class myQueue {
        static Node head;
        static Node tail;
        static int size;
        myQueue(){
            head = null;
            tail = null;
            size = 0;
        }

    public boolean isEmpty() {
        // check if the queue is empty
        return head == null && tail == null;
    }

    public static  void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node newNode = new Node(x);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;

        }
        size--;
        
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return size;

    }
}

    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        System.out.println(q.size());
        
        while(!q.isEmpty()){
            System.out.println(q.getFront());
            q.dequeue();
        }
        System.out.println(q.size());
        

    }
}
