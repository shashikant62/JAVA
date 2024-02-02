import java.util.*;
import java.io.*;

class Next_Greter_Element_array{
    public static void ans(int arr[]){
       int len=arr.length;
       for(int i=0;i<len;i++){
        if(arr[i]==len-1){
            arr[i]=-1;
        }
        else  if(arr[i]<arr[i+1]){
            arr[i]=arr[i+1];
        }
        else{
            arr[i]=-1;
        }
       }
       for(int i=0;i<len;i++){
        System.out.print(arr[i]+",");
       }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={1,3,5,2,4};
        // ans{3,5,-1,4,-1};
        ans(arr);
    }
}
