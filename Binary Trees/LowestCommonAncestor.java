
import java.util.*;

class Solution {

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    public static Node LowestCA(Node root, int n1, int n2) {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();

        getPath(root, n1, list1);
        getPath(root, n2, list2);

        int i = 0;
        for (; i < list1.size() && i < list2.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                break;
            }
        }
        i = i - 1;
        Node lca = list1.get(i);
        return lca;

    }

    public static boolean getPath(Node root, int n, ArrayList<Node> list) {
        if (root == null) {
            return false;
        }
        list.add(root);
        if (root.data == n) {
            return true;
        }

        boolean left = getPath(root.left, n, list);
        boolean right = getPath(root.right, n, list);

        if (left || right) {
            return true;
        }

        list.remove(list.size() - 1);
        return false;
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(LowestCA(root, 4, 5).data);
    }
}
