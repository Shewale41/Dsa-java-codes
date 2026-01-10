public class Recursion{
    public static int firstOcc(int arr[],int key,int i){
         if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       
        //recursive
        return firstOcc(arr,key,i+1);
    }
    
    
    public static void main(String args[]){
        int arr[]={1,5,8,3,9,0,23,56,8};
        System.out.println(firstOcc(arr,89,0));
    }
}