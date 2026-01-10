public class Solution{
    public static int FastExpo(int n,int a){
        int ans=1;
        while(a>0){
            if((a&1)!=0){
                ans=ans*n;

            }
            n=n*n;
            a=a>>1;

        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(FastExpo(5, 7));
    }
}