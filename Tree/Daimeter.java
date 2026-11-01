package Tree;

import java.util.*;

public class Daimeter {

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

    static class Info {
        int diameterr;
        int height;

        public Info(int diameterr, int height) {
            this.diameterr = diameterr;
            this.height = height;
        }
    }

    public static Info diameter(Node root) {
        // code here
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftinfo = diameter(root.left);
        Info rightinfo = diameter(root.right);

        int diameterr = Math.max(Math.max(leftinfo.diameterr, rightinfo.diameterr),
                leftinfo.height + rightinfo.height + 1);

        int height = Math.max(leftinfo.height, rightinfo.height) + 1;

        return new Info(diameterr, height);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println(diameter(root).diameterr);

    }
}
