public class Recursion{
    public static int friends(int n){
        //BC
        if(n==1 || n==2){
            return n;
        }
        //single choice
        int fnm1=friends(n-1);
        //paired choice
        //here n-1 is the pairs that one can form
        //n-2 is no of combinations he can done
        //so n-1*n-2 will be total combinations of pairs between all
        int fnm2=friends(n-2);
        int pairways=(n-1)*fnm2;
        //total pairs + single combination
        int totalways=fnm1+pairways;
        return totalways;
        //this whole code could be written as [return friends(n-1)+(n-1)*friends(n-2)]
    }
    public static void main(String args[]){
        System.out.println(friends(4));
    }
}