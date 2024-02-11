// import java.util.*;
// import java.io.*;
// class static_keyword{
//     public static void main(String args[]){
//         Scanner st=new Scanner(System.in);
//         int p=st.nextInt();
//         String c=st.nextLine();
//         System.out.println(c);
//         System.out.println(p);
//     }
// }
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class static_keyword
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner st=new Scanner(System.in);
		int h=0;
		int a=st.nextInt();
		int c[]=new int [10];
        for(int i=0;i<a;i++){
             c[i]=st.nextInt();
        }
        System.out.println("cut");
        for(int j=0;j<a;j++){
            System.out.println(c[j]);
        }
        System.out.println(h);
	}
}


// class static_keyword
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		Scanner st=new Scanner(System.in);
// 		int h=0;
// 		int a=st.nextInt();
// 		int c[]=new int[10];
// 		for(int i=0;i<a;i++){
// 		    int b=st.nextInt();
// 		    for(int j=0;j<b;j++){
// 		       c[i]=st.nextInt();
// 		    }
//             for(int k=0;k<b;k++){
// 		    for(int p=1;p<b;p++){
// 		        if(c[k]==c[p]){
// 		            h--;
// 		        }
// 		        else{
// 		            h++;
// 		        }
// 		    }
// 		}
// 		}
//         System.out.println(h);
// 	}
// }


