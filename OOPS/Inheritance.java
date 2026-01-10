public class OOPS{
    public static void main(String args[]){
    Fish tuna=new Fish();
    tuna.eat();
    tuna.sleep();
    tuna.does();    
    }
}

class Animal{
    void eat(){
        System.out.println("eating...");
    }
    void sleep(){
                System.out.println("Sleeping");
    }
}

//inhering animal by fish
class Fish extends Animal{
    void does(){
        System.out.println("does basically nothing");
    }
}