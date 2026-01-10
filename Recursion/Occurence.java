public class Recursion{
    public static void Occurence(int arr[],int key,int i){
        //BC
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        Occurence(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,4,7,2,9,2,0,2,2};
        Occurence(arr,2,0);
    }
}