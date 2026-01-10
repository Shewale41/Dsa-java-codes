//if Nqueens solution is possible or not,if possible then print 1 solution
public class Backtracking{
    static int count=1;
    public static boolean isSafe(char board[][],int row,int col){
        //VP
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //DL
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
             if(board[i][j]=='Q'){
                return false;
            }
        }
        //DR
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
             if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    
    public static void printBoard(char board[][]){
        // System.out.println("---- No: "+count+"----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        count++;
    }
    public static boolean Nqueens(char board[][],int row){
        if(row==board.length){
            // printBoard(board);
            return true;
        }
        //colum by column traversal
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            if(Nqueens(board,row+1)){//function call
            return true;
            }
            board[row][j]='x';
            }
           
        }
        return false;
    }
    
    public static void main(String args[]){
        int n=5;
        char board[][]=new char[n][n];
        //filling x in 2D array
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        if(Nqueens(board,0)){
            System.out.println("Yes solution exists for N Queens");
            printBoard(board);
        }else{
            System.out.println("No , no solution exists for N Queens");
        }
    }
}