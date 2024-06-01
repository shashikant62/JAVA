import java.util.*;
class Student{
    private int i=10;
    private String j="welcome";
}
class Employee{
    int i=20;
    String j="welcome2";
}
class generic_two{
    public static void main(String args[]){
        // ArrayList o=new ArrayList();
        Student obj1=new Student();
        ArrayList<Student> o=new ArrayList<Student>();
        Employee obj2=new Employee();
        o.add(obj1);
        // o.add(obj1);
        // o.add(obj2.i);
        // o.add(obj2.j);
        // o.add(10);
        System.out.println(o);

    }
}