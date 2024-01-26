import java.util.*;
class D_array{
    public static void main(String args[]){
        int a[]=new int[10];
        Scanner st=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=st.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}
