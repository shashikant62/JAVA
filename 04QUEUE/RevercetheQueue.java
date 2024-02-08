import java.util.*;
import java.io.*;
class RevercetheQueue{
    public static void main(String args[]){
        Queue<Integer>q=new LinkedList<>();
        Stack<Integer>s=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int n=q.size();
        for(int i=0;i<n;i++){
            s.push(q.remove());
        }
        
        while(s.isEmpty()!=true){
            q.add(s.pop());
        }
        System.out.println(q);
    }
}