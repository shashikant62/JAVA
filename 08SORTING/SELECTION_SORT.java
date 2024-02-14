import java.util.*;
import java.io.*;
class SELECTION_SORT{
    static void SS(int arr[],int l){
        for(int i=0;i<l-1;i++){
            int min=i;
            for(int j=i+1;j<l;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[]={10,2,3,5,1,11,6};
        int length=array.length;
        SS(array,length);
    }
}