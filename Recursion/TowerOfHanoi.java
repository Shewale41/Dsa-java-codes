public class Recursion{
    public static void toh(int n,String src,String helper,String des){
        if(n==1){
            System.out.println(n+" from "+src+" -> "+des);
            return;
        }
        toh(n-1,src,des,helper);
            System.out.println(n+" from "+src+" -> "+des);
        toh(n-1,helper,src,des);    
    }
    public static void main(String[] args) {
        toh(1,"A","B","C");
    }
}