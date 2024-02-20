//https://www.codechef.com/problems/READPAGES?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;
class Readpage
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner st=new Scanner(System.in);
		int n=st.nextInt();
		for(int i=0;i<n;i++){
		    int t=st.nextInt();
		    int x=st.nextInt();
		    int y=st.nextInt();
		    if((x*y)>=t){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
