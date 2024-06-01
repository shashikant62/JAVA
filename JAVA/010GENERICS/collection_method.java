import java.util.*;
class collection_method{
    public static void main(String args[]){
        ArrayList<Integer> o=new ArrayList<>();
        o.add(10);
        o.add(20);
        o.add(30);
        o.add(30);
        o.add(40);
        System.out.println(o);
        Collections.sort(o);
        System.out.println(o);
        int i= Collections.binarySearch(o,20);
        System.out.println(i);
        Collections.shuffle(o);
        System.out.println(o);
    }

}