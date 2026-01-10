//build tree prorder code
//prorder traversal
import java.util.*;
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
    public static void LevelOrder(Node root){
        if(root==null) return;
        Queue <Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node newNode=q.remove();
            if(newNode==null){
                System.out.println();
                if(q.isEmpty()){
                    return;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(newNode.data+" ");
                if(newNode.left!=null){
                    q.add(newNode.left);
                }
                if(newNode.right!=null){
                    q.add(newNode.right);
                }
            }
        }
    }  
    
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        // System.out.println(root.data);
        LevelOrder(root);
    }
}