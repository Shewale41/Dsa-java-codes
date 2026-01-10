public class OOPS{
    public static void main(String args[]){
        Mustang m=new Mustang();
        Chicken c=new Chicken();
    }
}

abstract class Animal{
    Animal (){
        System.out.println("Animal constructor is called");
    }
    void eat(){
        System.out.println("Eating.....");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse () {
            System.out.println("Horse constructor is called");
        }
    void walk(){
        
        System.out.println("Walks on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor is called");
    }
}

class Chicken extends Horse{
    Chicken(){
        System.out.println("Chicken constructor is called");
    }
    void walk(){
        System.out.println("Walks on two legs");
    }
}