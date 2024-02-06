import java.util.*;
class BasicStl{
    public static void main(String args[]){
        Queue<Integer>q=new LinkedList<>();
       

        // for add queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);

        // for delete queue
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);

        //top element
        // q.peek();
        // q.element();
        System.out.println(q.peek());
        System.out.println(q.element());

        //check empty or not
        // q.isEmpty();
        System.out.println(q.isEmpty());

        //check size
        // q.size();
        System.out.println(q.size());
        
    }
}