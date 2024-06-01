import java.util.*;
import java.io.*;
class linear_search{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        int size=n.nextInt();
        int key=n.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=n.nextInt();
        }
        for(int i=0;i<size;i++){
            if(array[i]==key){
                System.out.print("yes");
            }
        }
    }
}