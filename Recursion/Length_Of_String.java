public class Recursion{
    static int count;
    public static void Length(String str,int index){
        //BC
        if(str.charAt(index)==' '){
                return;
        }
        Length(str,index+1);
        count++;
    }
    public static void main(String args[]){
        Length("shyam",0);
        System.out.print(count);
    }
}