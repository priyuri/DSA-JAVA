package Tree;

public class SumOfTree {  

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int toSumTreeHepler(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = toSumTreeHepler(root.left);
        int rightsum = toSumTreeHepler(root.right);

        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;

        int data = root.data;
        root.data = leftsum + rightsum + newleft + newright;

        return data;
    }
    public static void toSumTree(Node root) {
        // code here
        if (root == null) {
            return;
        }
        toSumTreeHepler(root);
        print(root);
    }   
    public static void print(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }
    
      

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        toSumTree(root);
        
    }
    
}
