import java.util.*;
class SetInterface{
    static void HashsetExample(){
        HashSet<Integer>d=new  HashSet<>();
        d.add(1);
        d.add(2);
        d.add(4);
        d.add(3);
        d.size();
        System.out.println(d);
        d.remove(3);
        System.out.println(d);
        System.out.println(d);

    }
    static void linkedHashsetExample(){
        LinkedHashSet<Integer>d=new  LinkedHashSet<>();
        d.add(1);
        d.add(2);
        d.add(4);
        d.add(3);
        d.size();
        System.out.println(d);
        d.remove(3);
        System.out.println(d);
        System.out.println(d);

    }
    // static void sortedsetExample(){
    //     SortedSet<Integer>d=new  SortedSet<>();
    //     d.add(1);
    //     d.add(2);
    //     d.add(4);
    //     d.add(3);
    //     d.size();
    //     System.out.println(d);
    //     d.remove(3);
    //     System.out.println(d);
    //     System.out.println(d);

    // }
    public static void main(String args[]){
       HashsetExample();
       System.out.println("-----------------");
        linkedHashsetExample();
    }
}