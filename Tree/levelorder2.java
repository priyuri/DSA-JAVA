package Tree;
import java.util.*;
public class levelorder2 {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>mainList = new ArrayList<>();
        //base case
        if(root == null){
            return mainList;
        }
        //create queue
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer>level = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr = q.remove();
                level.add(curr.val);
                //check for left
                if(curr.left != null){
                    q.add(curr.left);
                }
                //check for right
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            //add curr level in mainlist
            mainList.add(level);
        }
        return mainList;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(levelOrder(root));
    }
}
