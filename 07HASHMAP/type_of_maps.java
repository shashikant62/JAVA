import java.util.HashMap;
import java.util.*;
import java.io.*;
public class type_of_maps {
    public static void main(String args[]){
        //1
        HashMap<Integer,String>hashmap=new HashMap<>();
        hashmap.put(1,"a");
        hashmap.put(2,"e");
        hashmap.put(4,"d");
        hashmap.put(3,"j");
        hashmap.put(5,"s");
        System.out.print(hashmap);

        //2
        LinkedHashMap<Integer,String>hashmap1=new LinkedHashMap<>();
        hashmap1.put(1,"a");
        hashmap1.put(2,"e");
        hashmap1.put(4,"d");
        hashmap1.put(3,"j");
        hashmap1.put(5,"s");
        System.out.print(hashmap1);

        //3
        TreeMap<Integer,String>hashmap2=new TreeMap<>();
        hashmap2.put(1,"a");
        hashmap2.put(2,"e");
        hashmap2.put(4,"d");
        hashmap2.put(3,"j");
        hashmap2.put(5,"s");
        System.out.print(hashmap2);

}
}