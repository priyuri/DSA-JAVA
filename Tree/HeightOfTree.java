package Tree;

public class HeightOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    
    public static int height(Node root) {
        // code here
        if(root == null){
            return -1;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left , right) + 1;

    }
    public static void main(String[] args) {
        Node node = new Node(12);
        node.left = new Node(8);
        node.left.left = new Node(5);
        node.left.right = new Node(11);
        node.right = new Node(18);

        System.out.println(height(node));
        

        
    }
}
