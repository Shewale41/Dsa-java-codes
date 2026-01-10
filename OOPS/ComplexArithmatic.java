public class OOPS{
    public static void main(String args[]){
        Complex c1=new Complex(5,10);
        Complex c2=new Complex(4,5);
        Complex c3=Complex.sum(c1, c2);
        c3.printC();
        c1.printC();
        Complex c4=Complex.sum(c2, c3);
        c4.printC();
            }
}

class Complex{
    int a,b;
    Complex(int a,int b){
        this.a=a;
        this.b=b;
    }
    public static Complex sum(Complex c1,Complex c2){
        // int a=c1.a+c2.a;
        // int b=c1.b+c1.b;
        return new Complex((c1.a+c2.a),(c1.b+c2.b));
    }

    public void printC(){
        System.out.println(a+"+"+b+"i");
    }
    }