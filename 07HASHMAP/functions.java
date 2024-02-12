import java.util.*;
// import java.io.*;
class functions{
    public static void main(String args[]){
        HashMap<Integer,String>hashmap=new HashMap<>();

        //function for put;
        hashmap.put(1,"a");
        hashmap.put(2,"e");
        hashmap.put(3,"d");
        hashmap.put(4,"j");
        hashmap.put(5,"s");
        // System.out.print(hashmap);

        //get() function ;
        String name=hashmap.get(3);
        // System.out.print(name);

        for(Integer key:hashmap.keySet()){
            System.out.println(hashmap.get(key)+ " "+hashmap.);
        }
    }
}