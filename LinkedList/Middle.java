package LinkedList;

public class Middle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int getMiddle(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;

    }

    public static void main(String[] args) {
        Middle m = new Middle();
        m.addFirst(1);
        m.addFirst(5);
        m.addFirst(7);
        m.addFirst(6);
        m.addFirst(4);
        m.addFirst(2);
        System.out.println(m.getMiddle(head));
        
    }
}
