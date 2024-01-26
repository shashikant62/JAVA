import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class p
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p,k,y;
		for(int i=0;i<n;i++){
		    int l=0;
		    p=s.nextInt();
		    k=s.nextInt();
		    for(int j=0;j<p;j++){
		      y=s.nextInt();
		      if(k<y){
		          l++;
		      }
		    }
		    System.out.println(l);
		}
		
	}
}
