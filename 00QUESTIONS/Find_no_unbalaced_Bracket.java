import java.util.*;
import java.io.*;
class Find_no_unbalaced_Bracket{
    public static int check_unbalenced_bracket(String s){
        Stack<Character>p=new Stack<>();
        if(s.length()==1){
            return 1;
        }
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
                    return p.size();
                }
            }}
            else{
                return p.size();
            }
        }
        return p.size();
    }
    public static void main(String args[]){
        // String s="([{()[]}])[{}]";//valid
        String s="([]{()[])}[{}]"; //invalid
        // String s="]";
        // String s="(])";
        System.out.println("need to remove brackect is="+check_unbalenced_bracket(s));
    }
}