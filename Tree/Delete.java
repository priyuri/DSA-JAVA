package Tree;
import java.util.*;

public class Delete {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    
    static Node deleteNode(Node root, int key) {
        // code here
        if(root == null){
            return null;
        }
        //find delete node
        if(key > root.data){
            //search on right side
            root.right = deleteNode(root.right, key);
        }
        else if(key < root.data){
            //go left side
            root.left = deleteNode(root.left, key);
        }
        else if(root.data == key){//node found
            //case 1  leaf - no children
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2   single parent
            if(root.left == null){
                return root.right;
            }
            //case 3   single parent
            else if(root.right == null){
                return root.left;
            }
            //case 4   both children
            
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;  //replace
            root.right = deleteNode(root.right, IS.data);  //delete IS data
        }
        return root;  
        
    }

    static Node findInorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void levelorder(Node root){
        Queue<Node>q= new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
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
        System.out.println();
    }
    public static void main(String[] args) {
        Node node = new Node(5);
        node.left = new Node(3);
        node.left.left = new Node(2);
        node.left.right = new Node(4);
        node.right = new Node(6);
        node.right.right = new Node(7);
        levelorder(node);
        System.out.println();
        System.out.println(deleteNode(node, 0).data);
        levelorder(node);


        
        
        
    }
}
