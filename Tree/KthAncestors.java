package Tree;

public class KthAncestors {
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

    static int ans;

    public static int kthAncestor(Node root, int k, int node) {
        // code here
        ans = -1;
        find(root, k, node);
        return ans;
    }

    public static int find(Node root, int k, int node) {
        // code here
        if (root == null) {
            return -1;
        }
        if (root.data == node) {
            return 0;
        }
        int leftdist = find(root.left, k, node);
        int rightdist = find(root.right, k, node);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        } else {
            int maxdist = Math.max(leftdist, rightdist) + 1;
            if (maxdist == k) {
                ans = root.data;
            }
            return maxdist;

        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(kthAncestor(root, 1, 5));

    }
}
