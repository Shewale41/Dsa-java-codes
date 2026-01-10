public class Recursion{
public static int Power(int x,int n){
    if(n==0){
        return 1;
    }
    int half=Power(x,n/2);
    int half2=half*half;
    if(n%2!=0){
        half2=x*half2;
    }
    return half2;
}

    public static void main(String args[]){
        System.out.println(Power(2, 5));
    }
}