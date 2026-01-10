class Solution{
    public static int product(int idx,int[] list){
        if(idx>=list.length) return -1;
        int ans=product(idx+1,list);
        if(list[idx]%2!=0){
            return ans;
        }
        if(ans==-1){
            return list[idx];
        }
        return ans*list[idx];
    }
    public static void main(String args[]){
        int list[]={1,2,5,7,-6};
        int ans=product(0,list);
        System.out.println(ans);
    }
}