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

    public static boolean Search(Node root,int key){
        if(root == null) return false;
        if(root.data==key) return true;
        if(root.data>key){
            return Search(root.left,key);
        }else{
            return Search(root.right,key);
        }
    }

    public static void main(String args[]){
        int values[]={5,2,3,1,4};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=Insert(root,values[i]);
        }
        System.out.println(Search(root,17));
    }
}