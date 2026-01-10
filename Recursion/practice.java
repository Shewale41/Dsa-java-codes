import java.util.*;
class Solution{
    //sum of n natural numbers
public static int SumNatural(int n){
    if(n==0) return 0;
    int partial=SumNatural(n-1);
    return n+partial;
}

   //nth fibonachi number
public static int fibo(int n){
    if(n==1) return 1;
    if(n==2) return 1;
    int partialAns1=fibo(n-1);
    int partialAns2=fibo(n-2);

    return partialAns1+partialAns2;
}

public static int power(int x,int n){
    if(n==0) return 1;

    int partialAns=power(x,n-1);
    return x*partialAns;
}

public static int power2(int x,int n){
    if(n==0) return 1;

    int temp=power(x,n/2);
    if(n%2==1) return temp*temp*x;
    return temp*temp;
}

public static boolean isPalindrome(String s,int left,int right){

    if(s.charAt(left)!=s.charAt(right)) return false;

    if(left>=right) return true;

    return isPalindrome(s, left+1, right-1);
}

 public static void reverseArray(int[] arr,int left,int right){
    if(left>=right) return;

    //swapping
    int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    //then recursion
    reverseArray(arr, left+1, right-1);

 }

 public static void reverseArray2(int arr[],int left,int right){
    if(left>=right) return;
    //first recursion
    reverseArray2(arr, left+1, right-1);
    //then swapping (from inner to outer)
    int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
 }

public static void PowerSet(int  nums[],int ci,List<Integer> subset,List<List<Integer>> ans) {
     if(ci==nums.length){
        ans.add(new ArrayList<>(subset));
        return;
     }

     subset.add(nums[ci]);
     PowerSet(nums, ci+1, subset, ans);

     subset.remove(subset.size()-1);
     PowerSet(nums, ci+1, subset, ans);
}
//number ways to reach form top left to bottom right corner in n*m grid
public static int  grid(int n,int m){
    if(n==1 && m==1){
        return 1;
    }
    if(n<=0 || m<=0){
        return 0;
    }

    int down=grid(n-1,m);
    int right=grid(n,m-1);

    return down+right;
}
//total number of partitions in (m,n) w max n partitions at one side 
public static int Partition(int m,int n){
    if(m==0) return 1;
    if(n==0 || m<0) return 0;

    int temp=Partition(m, n-1)+Partition(m-n, n);

    return temp;
}

public static void (){
    
}
    public static void main(String args[]){
        String s="golog";
        int arr[]={1,2,3};
        // List<List<Integer>> ans=new ArrayList<>();
        // PowerSet(arr, 0, new ArrayList<Integer>(), ans);
        // ans.forEach(System.out::println);
        System.out.println(Partition(5 , 3));
        
    }
}