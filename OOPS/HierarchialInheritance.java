public class OOPS{
    public static void main(String args[]){
        Bird b=new Bird();
        b.sleep();
        b.fly();
        Mammal d=new Mammal();
        d.eat();
        d.walk();
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

class Mammal extends Animal{
        void walk(){
            System.out.println("walking");
        }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
    System.out.println("Flying");
}}
