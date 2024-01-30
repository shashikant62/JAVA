class Array_running_count{
    public static void main(String args[]){
        int a[]={1,2,3,4};
        int tmp[]=new int[a.length];
        int cout=0;
        for(int i=0;i<a.length;i++){
            cout+=a[i];
            tmp[i]=cout;
        }
        for(int i=0;i<tmp.length;i++){
            System.out.print(tmp[i]+",");
        }
}
}