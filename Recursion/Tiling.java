//very very crucial question
public class Recursion{
    public static int Tiles(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical placement
        int fnm1=Tiles(n-1);
        //horizontal placement
        int fnm2=Tiles(n-2);
        //total tiles
        return fnm1+fnm2;
    }
    public static void main(String args[]){
        System.out.println(Tiles(2));
    }
}