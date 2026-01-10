//diameter is max length of nodes between two nodes
//approach 1 -> O(n)
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
  static class TreeInfo{
    int ht;
    int diam;

    public TreeInfo(int diam,int ht){
        this.ht=ht;
        this.diam=diam;
    }
  }
  public static TreeInfo Diameter(Node root){
    if(root == null) {
        return new TreeInfo(0,0);
    }

    TreeInfo left=Diameter(root.left);
    TreeInfo right=Diameter(root.right);

    int myDia=Math.max(Math.max(left.diam,right.diam),(left.ht+right.ht)+1);
    int myHt=Math.max(left.ht,right.ht)+1;

    TreeInfo myInfo= new TreeInfo(myDia,myHt);
    return myInfo;
  }
      
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        System.out.println("Diamter of Tree :"+Diameter(root).diam);
       
    }
}