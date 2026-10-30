package Tree;
import java.util.*;

public class TreeMake {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BuildTree {
        static int idx = -1;
        public static TreeNode buildT(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildT(nodes);
            
            newNode.right = buildT(nodes);

            return newNode;
        }   
    }

    public static void main(String[] args) {
        int[] nodes = {5,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BuildTree tree = new BuildTree();
        TreeNode root = tree.buildT(nodes);
        System.out.println(root.data);
        
    }
}
