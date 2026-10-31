package Tree;

import java.util.*;

import Tree.Inorder.TreeNode;

public class Levelorder {
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
   
    public static void levelorderHelper(TreeNode root ){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode newNode = q.remove();
            if(newNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(newNode.data+" ");
                if(newNode.left != null){
                    q.add(newNode.left);
                }
                if(newNode.right != null){
                    q.add(newNode.right);
                }
            }
        }


    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        levelorderHelper(root);

    }
}
