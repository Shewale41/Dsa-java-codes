public class Recursion{
    
    public static void printBinaryString(int n,int lastplace,String str){
        //for testing
        //BC
        if(n==0){
            System.out.println(str);
            return;
        }
        //0 as always a choice
        if(lastplace==0){
            printBinaryString(n-1,0,str+"0");
            printBinaryString(n-1,1,str+"1");
        }else{
            printBinaryString(n-1,0,str+"0");
        }
    }
    public static void main(String args[]){
        printBinaryString(3,0,"");
    }
}