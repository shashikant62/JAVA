//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

import java.util.*;
import java.io.*;
class Value_of_Variable_After_Performing_Operations{
public static void  finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i]=="X++" || operations[i]=="++X" ){
                ans+=1;
            }
            else if(operations[i]=="X--" || operations[i]=="--X" ){
                ans--;
            }
        }
        System.out.println(ans);
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String n[]=new String[t];
        for(int i=0;i<t;i++){
            n[i]=s.nextLine();
        }
        finalValueAfterOperations(n);
    }
}