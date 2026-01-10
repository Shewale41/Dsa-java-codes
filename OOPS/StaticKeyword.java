public class OOPS{
    public static void main(String args[]){
        Student s1=new Student();
        s1.Schoolname="KAB";
        Student s3=new Student();
        //for s3 schoolname is same as s1 changed name for all objects
        System.out.println(s3.Schoolname);
        s3.Schoolname="CKT";
        //again s3 changes the name for everyone
        System.out.println(s1.Schoolname);
    }
}

class Student{
    static String Schoolname;
}