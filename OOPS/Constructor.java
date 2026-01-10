public class Constructor{
    public static void main(String args[]){
        Student s=new Student();
        Student s2=new Student("Jacky");
        System.out.println(s2.name);
    }
}

class Student{
    int roll;
    String name;
    //non-parameterized constructor
    Student(){
        System.out.println("Constructor is called ....");
    }
    //overloaded constructor , parameterized comstructor
    Student(String name){
        this.name=name;
    }
}