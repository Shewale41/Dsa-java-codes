public class BackTracking{
    static int count;
    public static void GridWays(int grid[][],int row,int col){
        if(row>=grid.length || col>=grid[0].length){
            return;
        }
        if(row==grid.length-1 && col==grid[0].length-1){
            count++;
            return;
        }
        //right
        GridWays(grid,row,col+1);
        //down
        GridWays(grid,row+1,col);
    }
    public static void main(String args[]){
        int n=3,m=3;
        int grid[][]=new int[n][m];
        GridWays(grid,0,0);
        System.out.println(count);
    }
}    