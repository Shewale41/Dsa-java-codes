public class OOPS{
    public static void main(String args[]){
        Omnivore o=new Omnivore();
        o.climb();
        o.run();
    }
}

interface Herbivore{
    void climb();
}

interface Carnivore{
    void run();
}

class Omnivore implements Herbivore,Carnivore{
    public void climb(){
        System.out.println("Climbs the tree");
    }
    public void run(){
        System.out.println("Runs fast");
    }
}