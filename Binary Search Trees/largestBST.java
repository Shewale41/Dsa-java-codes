
class Solution {

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }

    public static int maxSize=0;;
    
    public static Info largestBST(Node root){
        if(root==null){
            //using intger.max and min for negative node values
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo =largestBST(root.left);
        Info rightInfo=largestBST(root.right);
        int size =leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        if(root.data <= leftInfo.max ||root.data >= rightInfo.min){
            return new Info(false,size,min,max);
        }

        if(leftInfo.isBST && rightInfo.isBST){
            maxSize=Math.max(maxSize,size);
            return new Info(true,size,min,max);
        }

        return new Info(false,size,min,max);
    }
    public static void main(String args[]) {
        int values[] = {8,5,3,6,10,11,14};
         Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        Info info = largestBST(root);
        System.out.println("largest BST size is "+maxSize);
    }
}
