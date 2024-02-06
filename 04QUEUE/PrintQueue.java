import java.util.*;
class PrintQueue{
    public static void main(String args[]){
        Queue<Integer>q=new LinkedList();
        Queue<Integer>q2=new LinkedList();
       
    

        // for add queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
       
       //print all element
       for(int i=0;i<6;i++){
        int x=q.peek();
        q.remove();
        System.out.println(x);
       }
    }
}