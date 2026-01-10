import java.util.Stack;
public class StackB{
    static void getNextG(int[] arr,int[] ans){
        Stack<Integer> s=new Stack<>();
        //back traverse
        for(int i=arr.length-1;i>=0;i--){
            //1->while loop to pop(aliminate) smaller values from stack
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            //2->if no greater element is found (empty stack) then adding -1 
            if(s.isEmpty()){
                ans[i]=-1;
            }else{//2->otherwise adding nextgreat
                ans[i]=arr[s.peek()];
            }
            //3->puhsing current element (its index actually)
            s.push(i);
        }
    }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int ans[]=new int[arr.length];
        getNextG(arr,ans);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}