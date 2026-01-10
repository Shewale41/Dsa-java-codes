
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
        if(leftLca==null) return rightLca;

        return root;
    }
    public static int MinDis(Node root,int n1,int n2){
        Node lca=LowestCA(root,n1,n2);

        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);

        return dist1+dist2;
    }

    public static int lcaDist(Node root,int n){
        if(root==null) return -1;
        if(root.data==n) return 0;
        int leftDist=lcaDist(root.left,n);
        int rightDist=lcaDist(root.right,n);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        }else if(leftDist==-1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }

    }
    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(MinDis(root, 2, 6));
        
    }
}
