package Tree;

public class NodeSum {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static int sumBT(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        int ln = sumBT(root.left);
        int rn = sumBT(root.right);
        return ln+rn+root.val;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(6);
        System.out.println(sumBT(root));
        
    }
}
