import java.util.*;
import java.io.*;
class Basic_stack{
    public static void main(String args[]){
        Stack<Integer>a=new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.println(a.peek());
        a.pop();
        System.out.println(a.peek());
        System.out.println(a.size());
        System.out.println(a);
    }
}