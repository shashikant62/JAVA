import java.util.*;
class Dequeue{
    static void DequeueExample(){
        Deque<Integer>d=new  ArrayDeque<>();
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
    public static void main(String args[]){
       DequeueExample();
    }
}