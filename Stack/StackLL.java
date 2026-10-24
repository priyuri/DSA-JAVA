package Stack;

public class StackLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // static class Stack{
    // static Node head = null;

    // public static boolean isEmpty(){
    // return head == null;
    // }

    // public static void push(int data){
    // Node newNode = new Node(data);
    // if(isEmpty()){
    // head = newNode;
    // return ;
    // }
    // newNode.next = head;
    // head = newNode;
    // }

    // //pop
    // public static int pop(){
    // if(isEmpty()){
    // return -1;
    // }
    // int top = head.data;
    // head = head.next;
    // return top;
    // }

    // //peek
    // public static int peek(){
    // if(isEmpty()){
    // return -1;
    // }
    // return head.data;
    // }
    // }

    /*
     * Structure of linked list Node
     * class Node {
     * int data;
     * Node next;
     * 
     * Node(int val) {
     * data = val;
     * next = null;
     * }
     * }
     */

    static class myStack {
        static Node head;
        static int siz;

        public myStack() {
            // Initialize your data members
            head = null;
            siz = 0;
        }

        public boolean isEmpty() {
            // check if the stack is empty
            return head == null;
        }

        public void push(int x) {
            // Adds an element x at the rear of the stack.
            Node newNode = new Node(x);
            siz++;
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void pop() {
            // Removes the front element of the stack.
            if(isEmpty()){
                System.out.println("Stack underflow");
                return ;
            }
            head = head.next;
            siz--;
        }

        public int peek() {
            // Returns the front element of the stack.
            // If stack is empty, return -1.
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

        public int size() {
            // Returns the current size of the stack.
            return siz;

        }
    }

    public static void main(String[] args) {
        myStack s = new myStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(40);
        System.out.println("Size = "+s.size());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println("Size = "+s.size());

    }

}
