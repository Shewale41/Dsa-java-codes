public class BackTracking{
    public static int Maze(int maze[][],int row,int col){
        if(row==maze.length-1 && col==maze.length-1){
            return 1;
        }
        if(row>=maze.length || col>=maze.length || row<0 || col<0){
            return 0;
        }
        if(maze[row][col]!=0){
        int w1=Maze(maze,row,col+1);//right
        int w2=Maze(maze,row+1,col);//down
        int w3=Maze(maze,row,col-1);//left
        int w4=Maze(maze,row+1,col);//up
        return w1+w2+w3+w4;
        }
       return 0; 
    }
    public static void main(String args[]){
        int maze[][]={
            {1,1,1,0},
            {1,1,1,0},
            {1,0,1,1},
            {1,1,1,1}
        };
        System.out.print(Maze(maze,0,0));
    }
}