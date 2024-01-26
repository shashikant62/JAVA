import java.util.*;
public class preety
{
    public static void main(String[] args) throws Exception
    {   
        Scanner st=new Scanner(System.in);
        int n=st.nextInt();
        float s,e;
        for(int i=0;i<n;i++){
        int in=0;
            s=st.nextFloat();
            e=st.nextFloat();
            int t=(int)e-(int)s;
            // System.out.println(t);
            for(int j=0;j<t+1;j++){
                float p=s/10;
                float f2 = p % 1;
                int k = Math.round(f2 * 10);
                // System.out.println(k);
                if(k==2 ||k==3 ||k==9){
                    in++;
                }
                s=s+1;
                
            }
             System.out.println(in);
        }
        // float f = 1.2345;
        // System.out.println(f);
        // float f2 = f % 1;
        // int i = Math.round(f2 * 1000);
        // System.out.println(i);
    }
}