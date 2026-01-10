public class OOPS{
    public static void main(String args[]){
        Dog moti=new Dog();
        moti.sleep();
        moti.legs=4;
        moti.breed="pomerian";
        System.out.println(moti.legs);
        System.out.println(moti.breed);
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
        int legs;
}

class Dog extends Mammal{
        String breed;
}