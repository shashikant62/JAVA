// 2
import java.util.*;
class student{
    int age;
    String name;
    public void setdata(int age,String name){
        this.name=name;
        this.age=age;
    }
    public int getdata(){
        return age;
    }
    public String getdata1(){
        return name;
    }
}
class ECAPSULATION{
    public static void main(String args[]){
        student obj=new student();
        obj.setdata(12,"ram");
        System.out.print(obj.getdata());
        obj.getdata1();
    }
}
//some important 
//1-getetter setter use good name 
//name is simple to understand other programmer