public class OOPS{
    public static void main(String args[]){
        Dog d=new Dog();
        System.out.println(d.color);
    }
}

class Animal{
    Animal(){
        System.out.println("Animal constructor");
    }
    String color;
}
class Dog extends Animal{
    Dog(){
        //immediate parent class is called
        super();
        //color is 
            super.color="blue";

        System.out.println("Dog constructor");
    }
}