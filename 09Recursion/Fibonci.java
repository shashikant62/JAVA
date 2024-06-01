import java.util.*;

class Fibonci{
    public static void main(String args[]){
        message(10);
    }
    public static void message(int a){
        if(a==10){
            System.out.println(a);
            return;
        }
        System.out.println(a);
        message(a+1);
    }
}