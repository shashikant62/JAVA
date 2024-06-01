import java.util.*;
import java.io.*;
class Valid_Anagram{
    public static boolean isAnagram(String s, String t) {
        Stack<Character>k=new Stack<>();
        for(int i=0;i<t.length();i++){
            k.push(t.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            if(k.peek()==s.charAt(i)){
                k.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
}