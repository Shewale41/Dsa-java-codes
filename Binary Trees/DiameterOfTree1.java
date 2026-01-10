//diameter is max length of nodes between two nodes
//approach 1 -> O(n^2)
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
    public static int HeightTree(Node root)
{
     if( root == null ) return 0;

    int leftHeight=HeightTree(root.left);
    int rightHeight=HeightTree(root.right);
    
    int myHeight=Math.max(leftHeight,rightHeight)+1;

    return myHeight; 
}    
    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=Diameter(root.left);
        int diam2=Diameter(root.right);
        int diam3=HeightTree(root.left)+HeightTree(root.right)+1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }    
    
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        System.out.println("Diamter of Tree :"+Diameter(root));
    }
}