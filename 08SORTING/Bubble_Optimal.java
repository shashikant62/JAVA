import java.util.*;
import java.io.*;
class Bubble_Optimal{
    static void BSortOptimal(int arr[]){
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            boolean flag=false;
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag=false){
                return;
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,2,4,5,3,6,7};
        BSortOptimal(arr);
    }
}