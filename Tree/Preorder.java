package Tree;
import java.util.*;

import Tree.Inorder.TreeNode;

public class Preorder {
    static class Node{
        int data;
        TreeNode left;
        TreeNode right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static  List<Integer> preorder(TreeNode root) {
        // your code goes here
        List<Integer> result = new ArrayList<>();
        preorderHelper(root , result);
        return result;
    }
    public static void preorderHelper(TreeNode root , List<Integer> result){
        if(root == null){
            return ;
        }
        result.add(root.data);
        preorderHelper(root.left, result);
        preorderHelper(root.right, result);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println(preorder(root));

        
    }
}
