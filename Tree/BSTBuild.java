package Tree;

public class BSTBuild {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node buildBST(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val > root.data){
            //go right
            root.right = buildBST(root.right, val);
        }else if(val < root.data){
            root.left = buildBST(root.left, val);
        }
        return root;

    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        //left
        inOrder(root.left);
        //root
        System.out.print(root.data+" ");
        //right
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<arr.length; i++){
            root = buildBST(root, arr[i]);
        }
        inOrder(root);
    }
}
