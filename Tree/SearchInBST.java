package Tree;

public class SearchInBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    
    public static  boolean search(Node root, int key) {
        // code here
        if(root == null){
            return false;
        }
        //case 1
        if(key == root.data){
            return true;
        }
        //case 2
        if(key > root.data){
            return search(root.right, key);
        }else if(key < root.data){  //case 3
            return search(root.left, key);
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        System.out.println(search(root, 80));
        
    }
}
