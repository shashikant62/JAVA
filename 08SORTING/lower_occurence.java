import java.util.*;
class lower_occurence{
    public static void main(String args[]){
        Scanner st=new Scanner(System.in);
        int size=st.nextInt();
        int key=st.nextInt();
        int array[]=new int[size];
        int idx=0;
        for(int i=0;i<size;i++){
            array[i]=st.nextInt();}
        
        for(int i=0;i<size;i++){
        if(key==array[i]){
            idx=i+1;
            System.out.println(idx);
        }
    }
    }
}