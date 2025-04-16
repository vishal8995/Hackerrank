package Tree;

import java.util.Scanner;

public class LowestCommonAncestor {

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

    public static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (val <= root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    public static Node lca(Node root, int a, int b) {

        // GOOD TRY
        if (root == null)
            return null;

        if (a < root.data && b < root.data)
            return lca(root.left, a, b);
        else if (a > root.data && b > root.data)
            return lca(root.right, a, b);
        else
            return root;

        // Node curr = root;

        // while (curr != null) {
        // if (a < curr.data && b < curr.data)
        // curr = curr.left;
        // else if (a > curr.data && b > curr.data)
        // curr = curr.right;
        // else
        // return curr;
        // }

        // return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        Node lca = lca(root, a, b); // Assumes lca() is already defined
        System.out.println(lca.data);
    }
}
