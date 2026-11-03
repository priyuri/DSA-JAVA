package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class demo {
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

    public static  ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        if (root == null) {
            return list;
        }
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node node = q.remove();
            if (node == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                list.add(node.data);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);

        System.out.println(levelOrder(root));

    }
}
