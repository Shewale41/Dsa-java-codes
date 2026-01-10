

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
    public static Node LowestCA(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }

        Node leftLca = LowestCA(root.left,n1,n2);
        Node rightLca = LowestCA(root.right,n1,n2);

        if(rightLca==null) return leftLca;
        if(rightLca==null) return rightLca;

        return root;
    }
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(LowestCA(root, 4, 5).data);
        
    }
}
