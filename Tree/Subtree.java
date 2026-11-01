package Tree;

public class Subtree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }else if(root1 == null || root2 == null || root1.data != root2.data){
            return false;
        }

        if(!isIdentical(root1.left, root2.left)){
            return false;
        }
        if(!isIdentical(root1.right, root2.right)){
            return false;
        }

        return true;
    }

    public static  boolean isSubTree(Node root1, Node root2) {
        // code here
        if(root1 == null){
            return false;
        }
        if(root1.data == root2.data){
            if(isIdentical(root1, root2)){
                return true;
            }
        }
        return isSubTree(root1.left, root2) || isSubTree(root1.right, root2);

    }
    public static void main(String[] args) {
            /*
             *     1
             *    /  \
             *   2    3
             *  /  \   \
             * 4   5    6
             */
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.right = new Node(6);

        //    root 2
        //      2
        //    /   \   
        //   4     5
        Node root2 = new Node(2);
        root2.left = new Node(4);
        root2.right = new Node(5);

        System.out.println(isSubTree(root1, root2));


        
    }
}
