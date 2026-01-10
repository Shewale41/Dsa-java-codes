public class BackTracking{
    public static int GridWays(int row,int col,int n,int m){
        //Bc
        if(row==n-1 && col==m-1){
            return 1;
        }else if(row==n || col==m){
            return 0;
        }
        int w1=GridWays(row,col+1,n,m);//right
        int w2=GridWays(row+1,col,n,m);//down
        return w1+w2;
    }
    public static void main(String args[]){
        int n=3,m=3;
        int res=GridWays(0,0,n,m);
        System.out.println("Total ways to reach (n-1,m-1) :"+res);
    }
}