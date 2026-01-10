
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


    public static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createBST(int arr[],int start,int end){
        if(start>end){
            return null;
        }

        int mid = (start + end )/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr,start,mid-1);
        root.right = createBST(arr,mid+1,end);

        return root;
    }

    public static void main(String args[]) {
        //sorted array to balanced BST
        int values[] = {3,5,6,8,10,11,12};
        Node root = createBST(values,0,values.length-1);
        preorder(root);
    }
}
