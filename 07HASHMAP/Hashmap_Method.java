import java.util.*;
import java.io.*;
class Hashmap_Method{
    public static void main(String args[]){
    HashMap<Integer,Integer>mp1=new HashMap<>();
    mp1.put(1,100);
    mp1.put(2,200);
    mp1.put(3,300);
    mp1.put(4,400);

    //print all
    System.out.println(mp1);

    //clear all
    // mp1.clear();
    // System.out.println(mp1);

    //empty or not
    System.out.println(mp1.isEmpty());

    //size
    System.out.println(mp1.size());

    //putall 
    HashMap<Integer,Integer>mp2=new HashMap<>();
    mp2.putAll(mp1);
    System.out.println(mp2);

    //putifabsent
    mp1.putIfAbsent(5,500);
    System.out.println(mp1);

    //remove
    mp1.remove(1);
    System.out.println(mp1);

    //hashmap.containsKey(Object key)
    System.out.println( mp1.containsKey(2));

    //containsValue
    System.out.println( mp1.containsValue(200));

    //replace
    mp1.replace(2,200,2000);
    System.out.println( mp1);

    //get
    System.out.println(mp1.get(2));

    //getordefaoilt
    System.out.println(mp1.getOrDefault(23,30));

    //entruyset,keyset
    System.out.println(mp1.entrySet());
    System.out.println(mp1.keySet());

    //values
    System.out.println(mp1.values());

    //for each loop
    mp1.forEach((key, value) ->{
      System.out.println(key + "=" + value + " ");
    });

    //loop 2s
    for (Map.Entry<Integer,Integer> entry : mp1.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key=" + key + ", Value=" + value);
        }
    }
}