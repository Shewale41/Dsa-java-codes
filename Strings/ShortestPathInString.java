import java.util.*;
public class one{
    public static float ShortPath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }else if(str.charAt(i)=='S'){
                y--;
            }else if(str.charAt(i)=='W'){
                x--;
            }else{
                x++;
            }
        }
        //(x2-x1)+(y2-y1) as y1 and x1 is 0;
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="NSWWENSSNEENWSNN";
       System.out.println( ShortPath(str));
    }
}