class Solution{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }
    }
    
 public static int SumTree(Node root){
    if(root==null) return 0;
    //left/rightChild has the origianl values  of node before storing the sum of thier nodes
    int leftChild=SumTree(root.left);
    int rightChild=SumTree(root.right);
    //newl/r has the the new values i.e the sum of its child nodes
    int newLeft=root.left==null?0:root.left.data;
    int newRight=root.right==null?0:root.right.data;
    //origianalData stores the current value of node before changing the value to sum of its nodes
    int Originaldata=root.data;//original value if node 
    root.data=leftChild+newLeft+rightChild+newRight;
    //returning this origianl data as left/rightChild
    return Originaldata;
 }


 public static void Preorder(Node root){
        if(root == null) { 
            return;}
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        Preorder(root);
        System.out.println();
        SumTree(root);
        Preorder(root);
    }
}