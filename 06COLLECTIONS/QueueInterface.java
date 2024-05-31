import java.util.*;
class QueueInterface{
    static void LinkedListExample(){
        Queue<Integer>d=new LinkedList<>();
        Queue<Integer> pQueue= new PriorityQueue<Integer>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.size();
        System.out.println(d);
        d.remove();
        System.out.println(d);
        d.offer(4);
        System.out.println(d);

    }
    static void PriorytyqueueExample(){
        // PriorityQueue<Integer>d=new PriorityQueue<>();
        PriorityQueue<Integer>d=new PriorityQueue<>(Comparator.reverseOrder());
        d.add(1);
        d.add(6);
        d.add(3);
        d.add(4);
        d.size();
        System.out.println(d);
        d.remove();
        System.out.println(d);
        d.offer(4);
        System.out.println(d);

    }
    public static void main(String args[]){
        LinkedListExample();
        System.out.println("-------------------");
        PriorytyqueueExample();
    }
}