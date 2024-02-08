import java.util.*;
import java.io.*;
class Revercefirst_k_element{
    public static void main(String args[]){
        Queue<Integer>q=new LinkedList<>();
        Stack<Integer>s=new Stack<>();
        int k=3;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int n=q.size();
        for(int i=0;i<k;i++){
            s.push(q.remove());
        }
        
        while(s.isEmpty()!=true){
            q.add(s.pop());
        }
        for(int i=0;i<n-k;i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}