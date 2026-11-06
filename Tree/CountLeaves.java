package Tree;
import java.util.*;

public class CountLeaves {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    
    static int countLeaves(Node node) {
        // code here
        Queue<Node>q = new LinkedList<>();
        int count = 0;
        q.add(node);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(curr.left == null && curr.right == null){
                    count++;
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Node node = new Node(4);
        node.left = new Node(8);
        node.left.left = new Node(7);
        node.left.left.left = new Node(3);
        node.right = new Node(10);
        node.right.left = new Node(5);
        node.right.right = new Node(1);

        System.out.println(countLeaves(node));

        
    }
}
