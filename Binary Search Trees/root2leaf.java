import java.util.ArrayList;
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

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void root2leaf(Node root,ArrayList<Integer>path){
        if(root==null) return ;
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
            path.remove(path.size()-1);
        }
        root2leaf(root.left,path);
        root2leaf(root.right,path);
    }
    public static void main(String args[]) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        root2leaf(root,new ArrayList<>());
    }
}
