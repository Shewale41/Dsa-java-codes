import java.util.*;

public class Solution{
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override 
        public int compareTo(Student s2)
        {
            return this.rank-s2.rank;
        }
    }   
    public static void main(String[] args){

        PriorityQueue<Student> p=new PriorityQueue<>();
        p.add(new Student("A",57));
        p.add(new Student("B",42));
        p.add(new Student("C",40));
        p.add(new Student("D",23));
        while(!p.isEmpty()){
            System.out.println(p.peek().name + "->" + p.peek().rank);
            p.remove();
        }
    }
}