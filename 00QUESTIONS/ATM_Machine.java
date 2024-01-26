//link:https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/ATM2
import java.util.*;
import java.lang.*;
import java.io.*;

class ATM_Machine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner st=new Scanner(System.in);
		int t=st.nextInt();
		while(t-->0){
		    int n=st.nextInt();
		    int k=st.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=st.nextInt();
		        if(arr[i]<=k){
		            System.out.print("1");
		            k=k-arr[i];
		        }
		        else{
		            System.out.print("0");
		        }
		    }
		     System.out.println();
		}
	}
}