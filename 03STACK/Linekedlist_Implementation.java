import java.util.*;
import java.io.*;
class Linekedlist_Implementation{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }

    public static class Stack{
        node head=null;
        node tail=null;
        int sized=0;
        void push(int val){
        node temp=new node(val);
            if(head==null){
                head=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            sized++   ; 
        }

        int pop(){//delete at head stack in head
        if(head==null){
            return -1;
        }
            int x=head.data;
            head=head.next;
            sized--;
            return x;
        }

        int peek(){
            node temp=head;
            System.out.println(temp.data);
            return temp.data;
        }

        int size(){
            return sized;
        }

        boolean isempty(){
            if(head==null){
                return true;
            }
            return false;
        }

        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            } 
            System.out.println("null");
        }
    }
    public static void main(String args[]){
        Stack st=new Stack();
        // System.out.println(st.isempty());
        // st.display();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        st.pop();
        st.display();
        st.size();
        st.isempty();
        System.out.println(st.size());
        System.out.println(st.isempty());
    }
}