package LinkedList;

public class CircularLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + "->");
            temp = temp.next;

        }while (temp != head);
        System.out.println("back to head");
    }

    public static void main(String[] args) {
        // CircularLL c = new CircularLL();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        print();

    }
}
