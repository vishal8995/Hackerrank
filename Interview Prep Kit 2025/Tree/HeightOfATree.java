package Tree;

import java.util.Scanner;

public class HeightOfATree {

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

    public static int height(Node root) {
        if (root == null)
            return -1;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        int height = height(root);
        System.out.println(height);
    }

}
