import java.util.*;
import java.io.*;
class CircularQueue{
    int arr[]=new int [5];
    int f=0;
    int r=0;
    int size=0;
    public void addqueue(int val)throws Exception{
        if(size==0){
            f=r=0;
            arr[0]=val;
        }
        else if(size==arr.length){
            throw new Exception("queue is full");
        }
        else if(r < arr.length-1 ){
            arr[++r]=val;
        }
        else if(r==arr.length-1){
            r=0;
            arr[0]=val;
        }
        size++;
    }

    public int remove() throws Exception{
        if(size==0){
            throw new Exception("queue is empty");
        }
        else{
            int x=arr[f];
            if(f==arr.length-1)f=0;
            else f++;
            size--;
            return x;
        }
    }

    public int peek()throws Exception{
        if(size==0){
            throw new Exception("queue is empty");
        }
        else{
            return arr[f];
        }
    }

    public void display()throws Exception{
        if(size==0){
            throw new Exception("queue is empty");
        }
        else if(f<=r){
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ,");
            }
              System.out.println("");
        }
        else{
            for(int i=f;i<arr.length;i++){
                 System.out.print(arr[i]+" ");
            }
            for(int i=0;i<r;i++){
                 System.out.print(arr[i]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])throws Exception{
        CircularQueue a=new CircularQueue();
        a.addqueue(1);
        a.addqueue(2);
        a.addqueue(3);
        a.addqueue(4);
       
        a.display();
        a.remove();
        a.remove();
        a.remove();
        a.remove();
        a.addqueue(5);
        a.addqueue(6);
        a.addqueue(7);
        a.addqueue(8);
        a.addqueue(8);
        a.remove();
        a.addqueue(8);
        a.display();
    }
}