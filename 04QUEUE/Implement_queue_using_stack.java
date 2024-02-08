//https://leetcode.com/problems/implement-queue-using-stacks/
import java.util.*;
import java.io.*;
class Implement_queue_using_stack{
    public static class MyQueue {
    Stack<Integer>s=new Stack<>();
    Stack<Integer>s1=new Stack<>();
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        while(s.size()>1){
            s1.push(s.pop());
        }
        int val=s.pop();
        while(s1.size()>0){
            s.push(s1.pop());
        }
        return val;
    }
    
    public int peek() {
        while(s.size()>1){
            s1.push(s.pop());
        }
        int val=s.peek();
        while(s1.size()>0){
            s.push(s1.pop());
        }
        return val;

    }
    
    public boolean empty() {
        if(s.size()==0){
            return true;
        }
        return false;
    }
}

  public static void main(String args[]){
            MyQueue obj=new MyQueue();
            obj.push(1);
            obj.push(2);
            obj.push(3);
            System.out.println(obj.pop());
            System.out.println(obj.empty());
            System.out.println(obj.peek());
    
    }
}