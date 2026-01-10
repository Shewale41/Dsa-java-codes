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

    public static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }

    public static Node createBST(ArrayList<Integer> arr,int start,int end){
        if(start>end) return null;
        int mid=( start+end )/2;
        Node root=new Node(arr.get(mid));
        root.left=createBST(arr,start,mid-1);
        root.right=createBST(arr,mid+1,end);

        return root;
    }
    public static Node mergeBSTs(Node root1,Node root2){
        //get inorder sequence
        //step 1 -> first tree -> inorder
        ArrayList<Integer> arr1=new ArrayList<>();
        getInorder(root1,arr1);
        //step 2 -> second tree -> inorder
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(root2,arr2);
        
        //step 3 -> sorted final arr
        ArrayList<Integer> sorted_arr = new ArrayList<>();
        int left=0;
        int right=0;
        while(left<arr1.size() && right<arr2.size()){
            if(arr1.get(left) < arr2.get(right)){
                sorted_arr.add(arr1.get(left));
                left++;
            }else{
                sorted_arr.add(arr2.get(right));
                right++;
            }

            
        }
        while(left<arr1.size()){
                sorted_arr.add(arr1.get(left));
                left++;
            }

        while(right<arr2.size()){
                sorted_arr.add(arr2.get(right));
                right++;
            }    

        //step ->4 create sorted array -> balanced bst
        return createBST(sorted_arr,0,sorted_arr.size()-1);


    }
    public static void main(String args[]) {
        int values[] = {1,2,4};
        int values2[]={9,3,12};
        Node root1 = null;
        for (int i = 0; i < values.length; i++) {
            root1 = insert(root1, values[i]);
        }
        preorder(root1);
        System.out.println();
        Node root2 = null;
        for (int i = 0; i < values2.length; i++) {
            root2 = insert(root2, values2[i]);
        }
        preorder(root2);
        System.out.println();
        Node asliRoot=mergeBSTs(root1,root2);
        preorder(asliRoot);
    }
}
