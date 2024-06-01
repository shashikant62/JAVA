import java.util.*;
import java.io.*;
class makingfile{
    public static void main(String args[]){
       File fi=new File("demo.txt");
       System.out.println(fi.exist());
        fi.createNewFile();  
    }
}