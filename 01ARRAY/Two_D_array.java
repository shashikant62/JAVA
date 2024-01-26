import java.util.*;
import java.io.*;
class Two_D_array{
    public static void main(String args[]){
        // int a[][]=new int[10][5];
        // Scanner st=new Scanner(System.in);
        // for(int i=0;i<10;i++){
        //     for(int j=0;j<5;j++){
        //     a[i][j]=st.nextInt();
        // }
        // }
        // for(int i=0;i<10;i++){
        //    for(int j=0;j<5;j++){
        //     System.out.print(a[i][j]+" ");
        //    }
        //    System.out.println(" ");
        // }
        // Scanner st=new Scanner(System.in);
        // int n=st.nextInt();
        // // System.out.println(n);
        // String s;
        // for(int i=0;i<2;i++){
        //     s=st.nextLine();
        // }
       Scanner st=new Scanner(System.in);
       
       int n=st.nextInt();
       for(int i=0;i<n;i++){
       String s,t;
       Scanner r=new Scanner(System.in);
       s=r.nextLine();
       t=r.nextLine();
       for(int j=0;j<s.length();j++){
        if(s.charAt(j)==t.charAt(j)){
             System.out.print("G");
        }
        else{
             System.out.print("B");
        }
       } 
        System.out.println("");  
       }

    }
}