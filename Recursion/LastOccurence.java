public class Recursion{
    public static int lastOcc(int arr[],int key,int n){
         if(n<0){
            return -1;
        }
        if(arr[n]==key){
            return n;
        }
       
        //recursive
        return lastOcc(arr,key,n-1);
    }
    //dont eat five star (difficult way to solve);
    public static int lastOcc2(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOcc2(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    
    
    public static void main(String args[]){
        int arr[]={1,5,8,3,9,0,9,0,8};
        System.out.println(lastOcc(arr,9,(arr.length-1)));
        System.out.println(lastOcc2(arr, 9, 0));
    }
}