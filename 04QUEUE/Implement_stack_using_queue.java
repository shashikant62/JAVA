//https://leetcode.com/problems/implement-stack-using-queues/
import java.util.*;
import java.io.*;
class Implement_stack_using_queue{
    public static class MyStack {
    Queue<Integer>q=new LinkedList<>();
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
        int val=q.peek();
        q.remove();
        return val;
    }
    
    public int top() {
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
        int val=q.peek();
        q.add(q.remove());
        return val;
    }
    
    public boolean empty() {
        if(q.size()==0){
            return true;
        }
        return false;
    }
} 
        public static void main(String args[]){
            MyStack obj=new MyStack();
            obj.push(1);
            obj.push(2);
            obj.push(3);
            System.out.println(obj.pop());
            System.out.println(obj.empty());
            System.out.println(obj.top());
    
        }
}