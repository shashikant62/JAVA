import java.util.*;
import java.io.*;
class Balanced_Bracket{
    public static boolean checkvalid(String s){
        Stack<Character>p=new Stack<>();
        for(int i=0;i<s.length();i++){//"(])"
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' ||ch=='('){
                p.push(ch);
            }
            else if(p.isEmpty()==false){
             if (ch=='}' || ch==']' || ch==')'){
                char val=p.peek();
                if(val=='(' && ch==')'){
                    p.pop();
                }
                else if(p.peek()=='[' && ch==']'){
                    p.pop();
                }
                else if(p.peek()=='{' && ch=='}'){
                    p.pop();
                }
                else{
                    return false;
                }
            }}
            else{
                return false;
            }
        }
        return p.isEmpty();
    }
    public static void main(String args[]){
        String s="([{()[]}])[{}]";//valid
        // String s="([]{()[])}[{}]"; //invalid
        // String s="]";
        // String s="(])";
        System.out.println(checkvalid(s));
    }
}