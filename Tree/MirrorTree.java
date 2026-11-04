package Tree;
import java.util.*;

public class MirrorTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    
    public static void mirror(Node root) {
        // code here
        if(root == null){
            return;
        }
        helper(root);
        levelorder(root);
    }
    public static Node helper(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = helper(root.left);
        Node rightMirror = helper(root.right);
        //point
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
    public static void levelorder(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
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
                list.add(curr.data);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }


    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);

        mirror(root);
        
    }
}
