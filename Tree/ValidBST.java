package Tree;

import java.util.*;

public class ValidBST {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static ArrayList<Integer> Helper(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }
        Helper(root.left, list);
        list.add(root.data);
        Helper(root.right, list);

        return list;
    }

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Helper(root, list);
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        // root.right.left = new TreeNode(3);
        // root.right.right = new TreeNode(6);

        System.out.println(isValidBST(root));

    }
}
