import java.util.*;
import java.io.*;
class Dequeue1{
    public static void main(String args[]){
        Deque<Integer>d=new LinkedList<>();
        d.addLast(1);
        d.addLast(3);
        d.addLast(4);
        d.addLast(2);
        d.addLast(2);
        System.out.println(d);
        d.addFirst(2);
        System.out.println(d);
        d.removeLast();
        d.removeFirst();
        System.out.println(d);
        System.out.println (d.getFirst());
        System.out.println (d.getLast());
    }
}