public class OOPS{
    public static void main(String args[]){
       Pen p=new Pen();
       p.setColor("Orange");
      System.out.println(p.getColor()); 
    }
}

class Pen{
    private String color;
    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color=color;
    }
}