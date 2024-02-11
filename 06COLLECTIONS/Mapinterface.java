import java.util.*;
classs Mapinterface{
    static void mapExample(){
        Map<Integer,String>d=new  HashMap<>();
        d.put(3,"a");
        d.put(1,"a");
        d.put(2,"a");
        d.put(4,"a");

        System.out.println(d);
    }
    public static void main(String args[]){
       mapExample();
        // linkedHashsetExample();
    }
}