public class Solution{
    public static void dd(int m[a][b]){
        int j=0;
        for(int k=0;k<=(a+b)-1;k++){
            int i=k;
            for(i;i<=(a+b)-1;i++){
            System.out.print(m[i][j]);
            i--;
            j++;
            if(i<=0 || j>i){
                break;
            }
            }
        }
    }
    
}