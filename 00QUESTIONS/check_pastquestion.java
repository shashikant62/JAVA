

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class check_pastquestion
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner st=new Scanner(System.in);
	    int t=st.nextInt();
	    int n,b=0,l=0;
        String M="s";
	    for(int i=0;i<t;i++){
	         n=st.nextInt();
	         for(int j=0;j<n;j++){
	             String s=st.next();
                 if(s.equals(M)){
                    b++;
                 }
                 else{
                    l++;
                 }
	         }
             System.out.println(b+" "+l);
	    }
	}
}