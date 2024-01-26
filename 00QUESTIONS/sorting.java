class sorting
{
    public static void main(String args[])
    {
        // code here
        int n=7;
        int a[]={6,3,4,2,0,1,0};
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = 0;
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" "); 
        }
    }
}