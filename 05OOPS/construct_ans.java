class Constructor_overloading{
    int a;
    int b;
    public Constructor_overloading(){
        a=10;
        b=10;
        System.out.println("d1");
    }
    public Constructor_overloading(int p){
        a=p;
        b=11;
        System.out.println("d2");
    }
    public Constructor_overloading(int p,int q){
        a=p;
        b=q;
        System.out.println("d3");
    }
    public void dis(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class construct_ans{
    public static void main(String args[]){
       Constructor_overloading s1=new Constructor_overloading(); 
       s1.dis();
       Constructor_overloading s2=new Constructor_overloading(10);
       s2.dis(); 
       Constructor_overloading s3=new Constructor_overloading(11,13); 
       s3.dis(); 
    }
}