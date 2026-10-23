package LinkedList;

public class GetKthElement {
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
    // public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        // size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;

    }

    // public int getSize(){
    //     Node temp = head;
    //     while(temp != null){
    //         temp = temp.next;
    //         size++;
    //     }
    //     return size;
    // }

    public int getKthFromLast(Node head, int k) {
        // code here
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(k > size){
            return -1;
        }

        temp = head;
        int i = 1;
        int idx = size - k + 1;
        while (i < idx) {
            temp = temp.next;
            i++;
        }
        return temp.data;

    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        GetKthElement ll = new GetKthElement();
        ll.print();
        ll.addFirst(60);
        ll.addFirst(50);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.print();
        // System.out.println(ll.size);
        // int ans = ll.getSize();
        // System.out.println(ans);
        int ans2 = ll.getKthFromLast(head, 7);
        System.out.println(ans2);

    }
}
