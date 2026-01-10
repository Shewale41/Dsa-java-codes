import java.util.*;
public class one{
public static int Sum(int a,int b){
    return a+b;
}
public static int Sum(int a,int b,int c){
    return a+b+c;
}
public static int add(int a,int b){
    return a+b;
}
public static float add(float a,float b){
    return a+b;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(Sum(5,10));
        System.out.println(Sum(4,8,4));
        System.out.println(add(5,7));
        System.out.println(add(9.8f,8.6f));
    }
}