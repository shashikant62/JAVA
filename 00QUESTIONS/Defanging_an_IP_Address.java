import java.util.*;
class Defanging_an_IP_Address{
    public String defangIPaddr(String address) {
        String s="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
               s=s+"[.]";
            }
            else{
            s=s+address.charAt(i);
            }
        }
        return s;
    }

    //default satement
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        String address=s.nextLine();
        Defanging_an_IP_Address ans=new Defanging_an_IP_Address();
        System.out.println(ans.defangIPaddr(address));
    }
}