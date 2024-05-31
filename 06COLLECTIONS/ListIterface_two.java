import java.util.*;
import java.io.*;
class ListIterface_two{
    public static void main(String args[]){
        List<Integer>l=new ArrayList<>();
        List<Integer>l2=new Vector<>();
        List<Integer>l3=new Stack<>();
        List<Integer>l4= new LinkedList<Integer>(); //all fuction same
        //arraylist 
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(0,3);
        l.remove(1);
        l.set(0,5);
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.get(0));
        System.out.println(l.contains(0));
        System.out.println(l.contains(5));
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        l.clear();
        System.out.println(l);

        //vector same as the arrylist
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(0,3);
        l2.remove(1);
        l2.set(0,5);
        System.out.println(l2);
        System.out.println(l2.size());
        System.out.println(l2.get(0));
        System.out.println(l2.contains(0));
        System.out.println(l2.contains(5));
        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i));
        }
        l2.clear();
        System.out.println(l2);

        //stack same as the arrylist
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(0,3);
        l3.remove(1);
        l3.set(0,5);
        System.out.println(l3);
        System.out.println(l3.size());
        System.out.println(l3.get(0));
        System.out.println(l3.contains(0));
        System.out.println(l3.contains(5));
        for(int i=0;i<l3.size();i++){
            System.out.println(l3.get(i));
        }
        l3.clear();
        System.out.println(l3);


    }
}