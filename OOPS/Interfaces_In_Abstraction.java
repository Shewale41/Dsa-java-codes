public class Interfaces_In_Abstraction{
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
        Rook r=new Rook();
        r.moves();
    }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    //public is neccessary as all interface methods are public
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }

}
class Rook implements Chessplayer{
    //public is neccessary as all interface methods are public
    public void moves(){
        System.out.println("up,down,left,right");
    }
    
}