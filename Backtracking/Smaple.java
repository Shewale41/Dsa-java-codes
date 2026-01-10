public class Backtracking{
    static int count=1;
    public static void printBoard(char board[][]){
        System.out.println("---- No: "+count+"----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        count++;
    }
    public static void Nqueens(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
        //colum by column traversal
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            Nqueens(board,row+1);//function call
            board[row][j]='x';
        }
    }
    public static void main(String args[]){
        int n=3;
        char board[][]=new char[n][n];
        //filling x in 2D array
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        Nqueens(board,0);
    }
}