class Solution{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

     public static Node Insert(Node root,int val){
            if(root==null){
                root = new Node(val);
                return root;
            }
            if(root.data>val){
                root.left = Insert(root.left,val);
            }else{
                root.right = Insert(root.right,val);
            }
            return root;
        }

    public static Node delete(Node root,int key){
        if(root.data>key){
            root.left=delete(root.left,key);
        }else if(root.data<key){
            root.right=delete(root.right,key);
        }else{
            //delete cases 
            //case-1 no child(putraheen)
            if(root.left==null && root.right==null){
                return null;
            }
            //case-2 one child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case-3 two child
            else{
                
                Node IS = FindInorderSuccessor(root.right,key);
                root.data=IS.data;
                root.right=delete(root.right,IS.data);
            }    
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
    public static Node FindInorderSuccessor(Node root,int key){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String args[]){
        int values[]={8,4,5,9,1,3,2};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=Insert(root,values[i]);
        }
        Inorder(root);
        System.out.println();
        root=delete(root,1);
        Inorder(root);
    }
}