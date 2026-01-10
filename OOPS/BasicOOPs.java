public class OOPS{
    public static void main(String args[]){
        // Pen p1= new Pen();
        // p1.ChangeColor("Blue");
        // System.out.println(p1.color);
        // p1.tip=10;
        // System.out.println(p1.tip);
        Bank acc=new Bank();
        acc.username="RamGopalVerma";
        acc.ChangePass("mainkyubatau");
    }
}

//classes should be declared below main public class acc to convention for easy objects
class Pen{
    String color;
    int tip;
    void ChangeColor(String newColor){
        color=newColor;
    }
}

class Bank{
    public String username;
    private String password;
    void ChangePass(String pwd){
        password=pwd;
    }
}
