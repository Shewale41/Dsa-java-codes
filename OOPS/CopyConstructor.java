public class OOPS{
    public static void main(String args[]){
       Student s1=new Student();
       s1.name="vicky";
       s1.roll=908;
       s1.marks[0]=78;
       s1.marks[1]=56;
       Student s2=new Student(s1);
       s1.name="lali";
       System.out.println(s2.name+" "+s2.roll);
       s1.marks[1]=90;
       for (int i = 0 ; i < 2; i++){
           System.out.println(s2.marks[i]);
       }
    
    }
}


class Student{
    int roll;
    String name;
    int marks[];
    Student(){}
    Student(Student s1){
        marks = new int[2];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<2;i++){
            this.marks[i]=s1.marks[i]; 
        }
    }
}