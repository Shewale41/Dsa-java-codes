public class BinomialCoeff{
    public static int Factorial(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static float Bino(int n,int r){
        int nf=Factorial(n);
        int rf=Factorial(r);
        int nrf=Factorial(n-r);
        float coeff=nf/(rf*nrf);
        return coeff;
    }
    public static void main(String args[]){
    float ans= Bino(5,2);
    System.out.print(ans);   
    }
}