public class OOPS{
    public static void main(String args[]){
      Deer d=new Deer();
      d.eat(4);
      Animal a=new Animal();
      a.eat(7);  
    }
}

class Animal{
      void eat(int a){
            System.out.println("eats anything");
      }
}

class Deer extends Animal{
      void eat(int a){
            System.out.println("eats grass");
      }
}