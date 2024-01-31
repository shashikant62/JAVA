import java.util.*;
import java.io.*;
class Copy_stack{
public static void main(String args[]){
        Stack<Integer>a=new Stack<>();
        Stack<Integer>temp=new Stack<>();
        Stack<Integer>b=new Stack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        int z=a.size();
        for(int i=0;i<z;i++){
            int ele=a.peek();
            temp.push(ele);
            a.pop();
        }
          System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("temp"+temp);
        for(int i=0;i<z;i++){
            b.push(temp.pop());
        }
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("temp"+temp);
    }
}