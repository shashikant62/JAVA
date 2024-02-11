import java.util.*;
class ListInterface{
    static void Arraylistclass(){
        ArrayList<Integer>a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.size();
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.set(1,10);
        System.out.println(a);

    }
    static void LInkedlistclass(){
        LinkedList<Integer>s=new LinkedList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.size();
        System.out.println(s);
        s.remove(2);
        System.out.println(s);
        s.set(1,10);
        System.out.println(s);

    }
    static void Stackclass(){
        Stack<Integer>d=new Stack<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.size();
        System.out.println(d);
        d.pop();
        System.out.println(d);
        d.set(1,10);
        System.out.println(d);

    }
    public static void main(String args[]){
        // Arraylistclass();
        // LInkedlistclass();
        Stackclass();
    }
}