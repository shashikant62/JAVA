import java.util.*;
import java.io.*;
class Stack_Underflow{
public static void main(String args[]){
        Stack<Integer>a=new Stack<>();
        Stack<Integer>temp=new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);  
        a.pop();
        System.out.println(a);  
        a.pop();
        System.out.println(a);  
        a.pop();
        System.out.println(a) ; 
        a.pop();
        System.out.println(a);
        //size also 0
        a.pop(); //error underflow
        System.out.println(a);
    }
}