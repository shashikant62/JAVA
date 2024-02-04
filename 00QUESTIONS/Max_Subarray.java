import java.io.*;
class Max_Subarray{
    public static void main(String args[]){
        int arr[]={-1,-2,-3,-4,-5,-6};
        int maxsum=0;
        int currsum=0;
        for(int i=1;i<arr.length;i++){
           currsum=currsum+arr[i];
           if(currsum>maxsum){
            maxsum=currsum;
           }
           if(currsum<0){
            currsum=0;
           }
        }
        return maxsum;
    }
}